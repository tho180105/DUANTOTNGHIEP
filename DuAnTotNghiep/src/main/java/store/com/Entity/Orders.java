package store.com.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Data
@Getter
@Setter
@Entity 
@Table(name = "Orders")
public class Orders implements Serializable{
	@Id
	Integer orderId;
	@Temporal(TemporalType.DATE)
	@Column(name = "CreateDate")
	Date createDate = new Date();
	Float shipFee;
	Float productMoney;
	Float totalMoney;
	String address;
	String paymentMethod;
	String orderStatus;

	@ManyToOne
	@JoinColumn(name = "VoucherId")
	Voucher voucher;
	
	@ManyToOne
	@JoinColumn(name = "AccountId")
	Account account;
}
