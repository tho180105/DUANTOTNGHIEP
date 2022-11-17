package store.com.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import store.com.Entity.Account;
import store.com.Service.AccountService;

@RestController
@RequestMapping("/rest/account")
public class AccountRestController {
    @Autowired
    AccountService accountService;
    
    @GetMapping("/getone")
    public Account getOne(Authentication auth) {
        return accountService.findById(auth.getName());
    }

    @PutMapping()
    public Account update(@RequestBody Account account){
        return accountService.update(account);
    }

    @GetMapping()
    public List<Account> getAll(Authentication auth) {
        return accountService.findAll();
    }
}
