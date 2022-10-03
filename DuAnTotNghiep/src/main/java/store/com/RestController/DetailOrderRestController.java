package store.com.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import store.com.DAO.DetailOrderDAO;
import store.com.Entity.DetailOrder;

@RestController
@RequestMapping("/rest/detailorder")
public class DetailOrderRestController {
	@Autowired
	DetailOrderDAO dao;

	@PostMapping
	public DetailOrder create(@RequestBody DetailOrder detailOrder) {
		return dao.save(detailOrder);
	}

}
