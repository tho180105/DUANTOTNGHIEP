package store.com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import store.com.Entity.Address;

public interface AddressDAO extends JpaRepository<Address, Integer>{

}
