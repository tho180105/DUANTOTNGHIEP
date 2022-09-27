package store.com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import store.com.Entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>{

}
