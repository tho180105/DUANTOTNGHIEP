package store.com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import store.com.Entity.Voucher;

public interface VoucherDAO extends JpaRepository<Voucher, Integer>{

}