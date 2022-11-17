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
import store.com.Service.CategoryService;

@RestController
@RequestMapping("/rest/cate")
public class CategoryRestController {
    @Autowired
    CategoryDAO categoryDAO;
    
    
//     @RequestMapping("/category")
//     @ResponseBody
//     public List<Category> category(Model model) {
//         Category category = new Category();
//         model.addAttribute("form", category);
//         List<Category> map = categoryDAO.findAll();
//         model.addAttribute("items", map);
//         return map;
//     }
    
//     @RequestMapping("/category/edit/{key}")
//     @ResponseBody
//     public Category edit(Model model, @PathVariable("key") Integer key) {
//         model.addAttribute("key", key);
//         Category category = categoryDAO.findById(key).get();
//         model.addAttribute("form", category);
//         List<Category> map = categoryDAO.findAll();
//         model.addAttribute("items", map);
//         return category;
//     }
    
// //    @RequestMapping("/category/create")
// //    public String create(Category student) {
// //        categoryDAO.create(student);
// //        return "redirect:thi/index";
// //    }
    
//     @RequestMapping("/category/update/{key}")
//     public String update(@PathVariable("key") String key, Category student) {
//         categoryDAO.save(student);
//         return "redirect:thi/edit/" + key;
//     }
    
//    @RequestMapping("/category/delete/{key}")
//    public String delete(@PathVariable("key") String key) {
//        categoryService.delete(key);
//        return "redirect:thi/index";
//    }
    // @GetMapping("/")
}
