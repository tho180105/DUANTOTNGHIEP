package store.com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import store.com.Entity.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer>{

}
