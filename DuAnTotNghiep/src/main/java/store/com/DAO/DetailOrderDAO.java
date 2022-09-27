package store.com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import store.com.Entity.DetailOrder;


public interface DetailOrderDAO extends JpaRepository<DetailOrder, Integer>{

}
