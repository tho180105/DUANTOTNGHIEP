package store.com.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Data
@Getter
@Setter
@Entity 
@Table(name = "DetailOrder")
public class DetailOrder implements Serializable{
	@Id
	Integer detailOrderId;
	Float productPrice;
	Integer quantity;
	@ManyToOne
	@JoinColumn(name = "ProductRepositoryId")
	ProductRepository productRepository;
	@ManyToOne
	@JoinColumn(name = "OrderId")
	Orders orders;
}
