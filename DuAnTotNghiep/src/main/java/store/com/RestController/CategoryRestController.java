package store.com.RestController;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import store.com.DAO.AccountDAO;
import store.com.DAO.CategoryDAO;
import store.com.DAO.DetailCartDAO;
import store.com.DAO.ProductRepositoryDAO;
import store.com.Entity.Category;
import store.com.Entity.DetailCart;
import store.com.Entity.Product;
import store.com.Service.CategoryService;
import store.com.Service.ProductService;

@RestController
public class CategoryRestController {
    @Autowired
    CategoryDAO categoryDAO;
    
    
    @RequestMapping("/category")
    @ResponseBody
    public List<Category> category(Model model) {
        Category category = new Category();
        model.addAttribute("form", category);
        List<Category> map = categoryDAO.findAll();
        model.addAttribute("items", map);
        return map;
    }
    
    @RequestMapping("/category/update/{key}")
    public String update(@PathVariable("key") String key, Category student) {
        categoryDAO.save(student);
        return "redirect:thi/edit/" + key;
    }
    
    @Autowired
    CategoryService categoryService;
    
    @GetMapping("/rest/categorys/{id}")
    public Category getOne(@PathVariable("id") Integer id) {
        return categoryService.findById(id);
    }
    
    @GetMapping("/rest/categorys")
    public List<Category> getAll() {
        return categoryService.findAll();
    }
    
    @PostMapping("/rest/categorys")
    public Category save(@RequestBody Category category) {
        return categoryService.create(category);
    }
    
    @PutMapping("/rest/categorys/{id}")
    public Category update(@PathVariable("id") Integer id ,@RequestBody Category category) {
        return categoryService.update(category);
    }
    
    @DeleteMapping("/rest/categorys/{id}")
    public void delete(@PathVariable("id") Integer id) {
        categoryService.delete(id);
    }
}
