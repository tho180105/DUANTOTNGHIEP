package store.com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import store.com.Entity.Style;

public interface StyleDAO extends JpaRepository<Style, Integer>{

}
