package store.com.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Data
@Getter
@Setter
@Entity 
@Table(name = "KOL")
public class KOL implements Serializable{
	@Id
	Integer KOLId;
	String KOLFullName;
	String phoneNumber;
	String email;
	@JsonIgnore
	@OneToMany(mappedBy = "KOL")
	List<KOLvoucher> KOLvouchers;
}
