package store.com.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.context.annotation.ApplicationScope;
import store.com.DAO.AddressDAO;
import store.com.Entity.Address;
//import store.com.Service.AddressService;
@RestController
@RequestMapping("/rest/address")
@ApplicationScope
public class AddressRestController {
//   @Autowired
//   AddressService addressService;
//
//    @GetMapping
//    public Address getone(Authentication au){
//        return addressService.findByAccountId(au.getName());
//    }
//
//    @PutMapping
//    public Address update(@RequestBody Address address){
//        return addressService.update(address);
//    }
//
//    @PostMapping
//    public Address create(@RequestBody Address address){
//        return addressService.create(address);
//    }
}
