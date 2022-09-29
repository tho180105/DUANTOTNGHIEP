package store.com.controller;

import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String success(Model model,Account account,@RequestParam("confirmpass") String confirmPass) throws MessagingException {
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
		model.addAttribute("message", "đăng ký thất bại");
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
	
}
