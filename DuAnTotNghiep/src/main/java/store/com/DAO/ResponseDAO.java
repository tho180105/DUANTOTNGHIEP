package store.com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import store.com.Entity.Response;
public interface ResponseDAO extends JpaRepository<Response, Integer>{

}
