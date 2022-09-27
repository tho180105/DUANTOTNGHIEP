package store.com.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Account")
public class Account implements Serializable{
	@Id
	String accountId;
	String password;
	String email;
	String avatar;
	Integer coin;
	String phoneNumber;
	@Temporal(TemporalType.DATE)
	@Column(name = "CreateDate")
	Date createDate = new Date();
	String status;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="RoleId")
	Role role;
	@JsonIgnore
	@OneToMany(mappedBy="account")
	List<Rate> rates ;
	@JsonIgnore
	@OneToMany(mappedBy="account")
	List<Response> responses ;
	@JsonIgnore
	@OneToMany(mappedBy="account")
	List<DetailCart> detailCarts ;
	@JsonIgnore
	@OneToMany(mappedBy="account")
	List<Address>  addresses ;
	@JsonIgnore
	@OneToMany(mappedBy="account")
	List<Orders>  orders ;
	@JsonIgnore
	@OneToMany(mappedBy="account")
	List<ProductDiscount>  productDiscounts ;
	
}
