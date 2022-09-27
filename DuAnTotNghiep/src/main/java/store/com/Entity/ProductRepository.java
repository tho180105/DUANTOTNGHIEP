package store.com.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ProductRepository")
public class ProductRepository implements Serializable{
	@Id
	Integer productRepositoryId;
	Integer quantity;
	@JsonIgnore
	@OneToMany(mappedBy = "productRepository")
	List<DetailCart> detailCarts;
	@JsonIgnore
	@OneToMany(mappedBy = "productRepository")
	List<DetailOrder> detailOrders;
	@ManyToOne
	@JoinColumn(name = "SizeId")
	Size size;
	@ManyToOne
	@JoinColumn(name = "ProductId")
	Product product;
	
	
}
