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
@Table(name = "Size")
public class Size implements Serializable{
	@Id
	String sizeId;
	String describe;
	@JsonIgnore
	@OneToMany(mappedBy = "size")
	List<ProductRepository> ProductRepositories;
}
