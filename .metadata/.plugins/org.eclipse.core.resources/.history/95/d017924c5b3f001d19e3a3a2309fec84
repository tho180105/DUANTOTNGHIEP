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
@Table(name = "ProductDiscount")
public class ProductDiscount implements Serializable{
	@Id
	Integer productDiscountId;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "StartDate")
	Date startDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "EndDate")
	Date endDate;
	
	Float disCount;

	@ManyToOne
	@JoinColumn(name = "ProductId")
	Product product;
	
	@ManyToOne
	@JoinColumn(name = "AccountId")
	Account account;
}
