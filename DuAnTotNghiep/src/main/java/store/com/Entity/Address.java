package store.com.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Data
@Getter
@Setter
@Entity 
@Table(name = "Address")
public class Address implements Serializable{
	@Id
	Integer addressId;
	Integer province;
	Integer district;
	Integer ward;
	String detailAddress;
	Boolean defaultAddress;

	@ManyToOne
	@JoinColumn(name = "AccountId")
	Account account;
}
