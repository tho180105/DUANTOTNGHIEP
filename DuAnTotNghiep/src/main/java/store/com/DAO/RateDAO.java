package store.com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import store.com.Entity.Rate;

public interface RateDAO extends JpaRepository<Rate, Integer>{

}
