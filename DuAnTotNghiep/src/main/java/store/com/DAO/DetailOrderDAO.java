package store.com.DAO;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import store.com.Entity.DetailOrder;
import store.com.Entity.Orders;

public interface DetailOrderDAO extends JpaRepository<DetailOrder, Integer>{
    
    List<DetailOrder> findByOrders(Orders orders);

    @Query("select SUM(do.quantity) as quantity   from DetailOrder do where do.orders.orderid in( select o.orderid from  Orders o  where  o.createdate > ?1   and o.createdate  < ?2 )   ")
    List<Double> getCountByDate(Date dateFrom, Date dateTo);

}
