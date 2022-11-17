package store.com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import store.com.Entity.Category;
import store.com.Entity.Product;

public interface CategoryDAO extends JpaRepository<Category, Integer>{
    @Query("SELECT count(c.categoryid) FROM Category c ")
    Integer getCount();
}
