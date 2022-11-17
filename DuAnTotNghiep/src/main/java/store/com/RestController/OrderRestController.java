package store.com.RestController;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import store.com.DAO.AccountDAO;
import store.com.DAO.OrdersDAO;
import store.com.Entity.Orders;

@RestController
@RequestMapping("/rest/order")
public class OrderRestController {
	@Autowired
	OrdersDAO dao;
	@Autowired
	AccountDAO adao;
	@Autowired
	Orders o;
	@Autowired
	HttpSession se;
	@GetMapping
	public List<Orders> getOders() {
		return dao.findAll();
	}
	
	
	@GetMapping("/createNew")
	public Orders initOrder() {
		return o;
	}
	
	@PostMapping
	public Orders create(@RequestBody Orders orders,Authentication auth) {
		if (auth != null) {
			orders.setAccount(adao.findById(auth.getName()).get());
			return dao.save(orders);
		}
		return dao.save(orders);
	}
	
	@PutMapping
	public Orders update(@RequestBody Orders orders) {
		System.out.println(orders.getOrderid());
		System.out.println(orders.getOrderstatus().getOrderstatusid());
		return dao.save(orders);
	}
	
}
