package store.com.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Data
@Getter
@Setter
@Entity 
@Component
@Table(name="orders")
public class Orders implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	Integer orderid;
	@Temporal(TemporalType.DATE)
	@Column(name = "Createdate")
	Date createdate = new Date();
	Float shipfee;
	Float productmoney;
	Float totalmoney;
	String address;
	String paymentmethod;
	String phonenumber;
	@ManyToOne
	@JoinColumn(name = "Orderstatusid")
	OrderStatus orderstatus; 
	@ManyToOne
	@JoinColumn(name = "Voucherid")
	Voucher voucher;
	@JsonIgnore
	@OneToMany(mappedBy="orders")
	List<DetailOrder> orderdetails;
	@ManyToOne
	@JoinColumn(name = "Accountid")
	Account account;

	public Orders() {
		super();
	}

	public Integer getOrderid() {
		return orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Float getShipfee() {
		return shipfee;
	}

	public void setShipfee(Float shipfee) {
		this.shipfee = shipfee;
	}

	public Float getProductmoney() {
		return productmoney;
	}

	public void setProductmoney(Float productmoney) {
		this.productmoney = productmoney;
	}

	public Float getTotalmoney() {
		return totalmoney;
	}

	public void setTotalmoney(Float totalmoney) {
		this.totalmoney = totalmoney;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenumber() {
		return address;
	}

	public void setPhonenumber(String address) {
		this.phonenumber = address;
	}
	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	public OrderStatus getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(OrderStatus orderstatus) {
		this.orderstatus = orderstatus;
	}

	public Voucher getVoucher() {
		return voucher;
	}

	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}
	@JsonIgnore
	public List<DetailOrder> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<DetailOrder> orderdetails) {
		this.orderdetails = orderdetails;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Orders(Integer orderid, Date createdate, Float shipfee, Float productmoney, Float totalmoney, String address,
			String paymentmethod, OrderStatus orderstatus, Voucher voucher, List<DetailOrder> orderdetails,
			Account account) {
		super();
		this.orderid = orderid;
		this.createdate = createdate;
		this.shipfee = shipfee;
		this.productmoney = productmoney;
		this.totalmoney = totalmoney;
		this.address = address;
		this.paymentmethod = paymentmethod;
		this.orderstatus = orderstatus;
		this.voucher = voucher;
		this.orderdetails = orderdetails;
		this.account = account;
	}

	




	
}
