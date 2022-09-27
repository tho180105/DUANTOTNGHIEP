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
@Table(name = "Category")
public class Category implements Serializable{
	@Id
	Integer categoryId;
	String categoryName;
	@JsonIgnore
	@OneToMany(mappedBy = "categogy")
	List<Product> products;
}