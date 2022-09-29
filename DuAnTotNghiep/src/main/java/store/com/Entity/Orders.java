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
public class Orders implements Serializable{
	@Id
	Integer orderid;
	@Temporal(TemporalType.DATE)
	@Column(name = "Createdate")
	Date createdate = new Date();
	Float shipfee;
	Float productmoney;
	Float totalmoney;
	String address;
	String paymentmethod;
	@ManyToOne
	@JoinColumn(name = "Orderstatusid")
	OrderStatus orderstatus; 
	@ManyToOne
	@JoinColumn(name = "Voucherid")
	Voucher voucher;
	
	@ManyToOne
	@JoinColumn(name = "Accountid")
	Account account;

	public Orders() {
		super();
	}

	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public Voucher getVoucher() {
		return voucher;
	}

	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

	public Account getAccount() {
		return account;
	}

	public Orders(Integer orderId, Date createdate, Float shipfee, Float productmoney, Float totalmoney, String address,
			String paymentmethod, OrderStatus orderstatus, Voucher voucher, Account account) {
		super();
		this.orderid = orderId;
		this.createdate = createdate;
		this.shipfee = shipfee;
		this.productmoney = productmoney;
		this.totalmoney = totalmoney;
		this.address = address;
		this.paymentmethod = paymentmethod;
		this.orderstatus = orderstatus;
		this.voucher = voucher;
		this.account = account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	public Integer getOrderId() {
		return orderid;
	}



	public void setOrderId(Integer orderId) {
		this.orderid = orderId;
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
}
