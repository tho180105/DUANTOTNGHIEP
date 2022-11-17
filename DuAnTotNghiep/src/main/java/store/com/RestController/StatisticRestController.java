package store.com.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import store.com.DAO.CategoryDAO;
import store.com.DAO.DetailOrderDAO;
import store.com.DAO.OrdersDAO;
import store.com.DAO.ProductDAO;
import store.com.DAO.ProductRepositoryDAO;
import store.com.DAO.StyleDAO;

@RestController
@RequestMapping("/rest/statistic")
public class StatisticRestController {
    @Autowired
    ProductDAO pdao;
    @Autowired
    OrdersDAO odao;
    @Autowired
    DetailOrderDAO dodao;
    @Autowired
    CategoryDAO cdao;
    @Autowired
    StyleDAO sdao;
    @Autowired
    ProductRepositoryDAO prdao;

    /**             
     * @return
     */
    @GetMapping("/countStyle")
    public Integer getCountStyle() {
        return sdao.findAll().size();
    }
}
