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
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public Integer getCoin() {
		return coin;
	}
	public void setCoin(Integer coin) {
		this.coin = coin;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Rate> getRates() {
		return rates;
	}
	public void setRates(List<Rate> rates) {
		this.rates = rates;
	}
	public List<Response> getResponses() {
		return responses;
	}
	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}
	public List<DetailCart> getDetailCarts() {
		return detailCarts;
	}
	public void setDetailCarts(List<DetailCart> detailCarts) {
		this.detailCarts = detailCarts;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	public List<ProductDiscount> getProductDiscounts() {
		return productDiscounts;
	}
	public void setProductDiscounts(List<ProductDiscount> productDiscounts) {
		this.productDiscounts = productDiscounts;
	}
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
	public Account(String accountId, String password, String email, String avatar, Integer coin, String phoneNumber,
			Date createDate, String status, Role role, List<Rate> rates, List<Response> responses,
			List<DetailCart> detailCarts, List<Address> addresses, List<Orders> orders,
			List<ProductDiscount> productDiscounts) {
		super();
		this.accountId = accountId;
		this.password = password;
		this.email = email;
		this.avatar = avatar;
		this.coin = coin;
		this.phoneNumber = phoneNumber;
		this.createDate = createDate;
		this.status = status;
		this.role = role;
		this.rates = rates;
		this.responses = responses;
		this.detailCarts = detailCarts;
		this.addresses = addresses;
		this.orders = orders;
		this.productDiscounts = productDiscounts;
	}
	public Account() {
		super();
	}
	
}
