package store.com.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Data
@Getter
@Setter
@Entity 
@Table(name = "Voucher")
public class Voucher implements Serializable{
	@Id
	String voucherId;
	String voucherTitle;
	String voucherContent;
	Float minimunMoney;
	Float percentDiscount;
	Float moneyDiscount;
	Integer quantity;
	@Temporal(TemporalType.DATE)
	@Column(name = "StartDate")
	Date startDate;
	@Temporal(TemporalType.DATE)
	@Column(name = "EndDate")
	Date endDate;
	
	@JsonIgnore
	@OneToMany(mappedBy = "voucher")
	List<KOLvoucher> KOLvouchers;
	@JsonIgnore
	@OneToMany(mappedBy = "voucher")
	List<Orders> Orders;
}
