package store.com.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "Banner")
public class Banner implements Serializable{
	@Id
	Integer bannerId;
	String bannerPath;
	String posotion;
	@Temporal(TemporalType.DATE)
	@Column(name = "StartDate")
	Date startDate;
	@Temporal(TemporalType.DATE)
	@Column(name = "EndDate")
	Date endDate;
}
