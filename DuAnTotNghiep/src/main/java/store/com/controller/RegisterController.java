package store.com.controller;

import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import store.com.Entity.Account;
import store.com.Entity.Role;
import store.com.Service.AccountService;
import store.com.Service.MailerService;

@Controller
public class RegisterController {
	
	String codeEmail= "";
	
	@Autowired
	AccountService accService;
	@Autowired
	MailerService mailer;
	Account acc;
	
	@RequestMapping("register/form")
	public String form(Model model) {
		acc= new Account();
		codeEmail= "";
		model.addAttribute("sv", acc);
		return "security/register";
	}
	
	
	@PostMapping("register/check")
	public String success(Model model, @Validated @ModelAttribute("sv") Account account, Errors errors, @RequestParam("confirmpass") String confirmPass) throws MessagingException {
		if (errors.hasErrors()) {
			return "security/register";
		}
		try {
			Account checkAcc = accService.findById(account.getAccountid());
			model.addAttribute("message", "Tài khoản đã tồn tại");
			return "forward:/register/form";
		} catch (Exception e) {
			if(!account.getPassword().equals(confirmPass)) {
				model.addAttribute("message", "Xác nhận mật khẩu không chính xác!");
				return "forward:/register/form";
			}
			List<Account> checkAcc = accService.findAll();
			for(Account listAcc: checkAcc){
				if(listAcc.getEmail() ==null){
					listAcc.setEmail("");
				}
				if(listAcc.getEmail().equals(account.getEmail())){
					model.addAttribute("message", "Email đã tồn tại");
					return "forward:/register/form";
				}
			}
			acc = account;
			codeEmail = codeEmail();
			mailer.send(account.getEmail(), "Xác nhận Email ","Mã xác nhận của bạn là :"+ codeEmail);	
			model.addAttribute("acc", account);
			return "security/confirm-email";
		}
	}
	
	
	@RequestMapping("register/confirmCode")
	public String checkCode(Model model,@RequestParam("codeEmail") String checkCode) {
		if(codeEmail.equals(checkCode)) {
			Role role = new Role("1","",null);
			acc.setRole(role);
			accService.create(acc);
			model.addAttribute("message", "Đăng ký thành công!");
			acc= new Account();
			codeEmail= "";
			return "security/login";
		}
		model.addAttribute("message", "Mã xác nhận không đúng");
		return "security/confirm-email";
	}
	
	
	public String codeEmail() {
		Double a = Math.random()*100000;
        int b = (int) Math.round(a);
        String chuyen = String.valueOf(b);
        if(chuyen.length()<5){
            for(int i =chuyen.length(); i< 5;i++){
            b =b*10;
            }
        }
        return chuyen;
	}
	
	
	@RequestMapping("/account")
	public String account(Model model,Authentication auth) {
	    model.addAttribute("sv", accService.findById(auth.getName()));
	    return "user/account";
	}
	
}
