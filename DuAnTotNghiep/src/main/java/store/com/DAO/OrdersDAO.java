package store.com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import store.com.Entity.Orders;

public interface OrdersDAO extends JpaRepository<Orders, Integer>{
    
    @Query("Select u from Orders u where u.account.accountid like ?1 ")
    List<Orders> findByAccount(String username);
}
