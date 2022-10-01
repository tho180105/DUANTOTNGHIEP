package store.com.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import store.com.DAO.VoucherDAO;
import store.com.Entity.Voucher;

@RestController
@RequestMapping("/rest/voucher")
public class VoucherRestController {
	@Autowired
	VoucherDAO dao;
	
	@GetMapping
	public List<Voucher> getDetailCart() {
		return dao.findAll();
	}
	
}
