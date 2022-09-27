package store.com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import store.com.Entity.Account;

public interface AccountDAO extends JpaRepository<Account, String> {

}
