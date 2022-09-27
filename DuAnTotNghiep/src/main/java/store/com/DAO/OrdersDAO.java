package store.com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import store.com.Entity.Orders;

public interface OrdersDAO extends JpaRepository<Orders, Integer>{

}
