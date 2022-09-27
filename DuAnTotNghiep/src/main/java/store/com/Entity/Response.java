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
@Table(name = "Response")
public class Response implements Serializable{
	@Id
	Integer responseId;
	String content;
	@Temporal(TemporalType.DATE)
	@Column(name = "ResponseDate")
	Date responseDate;
	@ManyToOne
	@JoinColumn(name = "RateId")
	Rate rate;
	@ManyToOne
	@JoinColumn(name = "AccountId")
	Account account;
}
