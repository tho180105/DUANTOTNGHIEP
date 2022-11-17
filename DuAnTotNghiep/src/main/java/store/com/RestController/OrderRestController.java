package store.com.RestController;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import store.com.DAO.AccountDAO;
import store.com.DAO.OrdersDAO;
import store.com.DAO.VoucherDAO;
import store.com.Entity.Orders;
import store.com.Entity.Voucher;

@RestController
@RequestMapping("/rest/order")
public class OrderRestController {
	OrdersDAO dao;
	AccountDAO adao;
	Orders o;
	HttpSession se;
	VoucherDAO vd;
	String a;
	

	public OrderRestController(AccountDAO adao, Orders o, HttpSession se, OrdersDAO dao, VoucherDAO vd) {
		this.adao = adao;
		this.o = o;
		this.se = se;
		this.dao = dao;
		this.vd = vd;
	}
	@GetMapping
	public List<Orders> getOders() {
		return dao.findAll();
	}


	@GetMapping("/createNew")
	public Orders initOrder() {
		return o;
	}

	@PostMapping
	public Orders create(@RequestBody Orders orders, Authentication auth) {
		try {

			Voucher v = vd.findById(orders.getVoucher().getVoucherid()).get();
			v.setQuantity(v.getQuantity() - 1);
			vd.save(v);
		} catch (Exception e) {
		}
		if (auth != null) {
			orders.setAccount(adao.findById(auth.getName()).get());
			return dao.save(orders);
		}
		return dao.save(orders);
	}

}
