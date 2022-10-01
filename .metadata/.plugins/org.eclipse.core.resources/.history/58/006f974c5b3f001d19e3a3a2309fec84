package store.com.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "Rate")
public class Rate implements Serializable{
	@Id
	Integer rateId;
	String content;
	@Temporal(TemporalType.DATE)
	@Column(name = "RateDate")
	Date rateDate;
	Float starNumber;
	String picture1;
	String picture2;
	String picture3;
	String picture4;
	@ManyToOne
	@JoinColumn(name = "AccountId")
	Account account;
	@ManyToOne
	@JoinColumn(name = "ProductId")
	Product product;
	@JsonIgnore
	@OneToMany(mappedBy="rate")
	List<Response> responses;
}
