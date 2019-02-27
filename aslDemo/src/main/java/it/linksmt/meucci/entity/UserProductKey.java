package it.linksmt.meucci.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class UserProductKey implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="user_id")
	private Integer userId;
	
	@Column(name="product_id")
	private Integer productId;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public UserProductKey(Integer userId, Integer productId) {
		super();
		this.userId = userId;
		this.productId = productId;
	}
	
	public UserProductKey() {
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(obj==null) {
			return false;
		}
		
		if (obj==this) {
			return true;
		}
		
		UserProductKey receivedKey = (UserProductKey) obj;
		
		if(userId.equals(receivedKey.getUserId()) && productId.equals(receivedKey.getProductId())) {
			return true;
		}
		
		return false;
	} 
		
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


}
