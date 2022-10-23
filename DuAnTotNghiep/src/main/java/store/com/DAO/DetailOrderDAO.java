package store.com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import store.com.Entity.DetailOrder;
import store.com.Entity.Orders;


public interface DetailOrderDAO extends JpaRepository<DetailOrder, Integer>{
    
    List<DetailOrder> findByOrders(Orders orders);
}
