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
@Table(name = "Product")
public class Product implements Serializable{
	@Id
	Integer productId;
	String productName;
	Float listedPrice;
	Float sellingPrice;
	String describe;
	String mainProductImage;
	@ManyToOne
	@JoinColumn(name = "StyleId")
	Style style;
	@ManyToOne
	@JoinColumn(name = "CategoryId")
	Category categogy;
	@ManyToOne
	@JoinColumn(name = "ProductStatusId")
	ProductStatus productStatus;
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	List<AdditionalImages> AdditionalImages;
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	List<ProductRepository> productRepositories;
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	List<ProductDiscount> productDiscounts;
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	List<Rate> rates;
	
}
