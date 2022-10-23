package store.com.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import store.com.DAO.CategoryDAO;
import store.com.Service.CategoryService;

@RestController
@RequestMapping("/rest/cate")
@CrossOrigin
public class CategoryRestController {
    @Autowired
    CategoryService cs;
    @Autowired
    CategoryDAO cd;
    @GetMapping("/count")
    public Integer count() {
        return cd.getCount();
    }
    
}
