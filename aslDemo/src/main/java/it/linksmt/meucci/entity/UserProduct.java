package it.linksmt.meucci.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="user_product")
public class UserProduct implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@EmbeddedId
	private UserProductKey id;
	
	@ManyToOne
	@MapsId("userId")
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@MapsId("productId")
	@JoinColumn(name="product_id")
	private Product product;
	
	private Integer quantity;
	
	@Column(name="purchase_date")
	private Date purchaseDate;

	public UserProductKey getId() {
		return id;
	}

	public void setId(UserProductKey id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public UserProduct(UserProductKey id, Integer quantity, Date purchaseDate) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.purchaseDate = purchaseDate;
	}
	
	public UserProduct() {
		
	}
	
	
	

}
