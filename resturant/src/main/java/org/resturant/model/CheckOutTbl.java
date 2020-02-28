package org.resturant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CHECK_OUT_TBL")
public class CheckOutTbl {
	
	@Id
	@Column(name="CHECK_OUT_ID")
	private String checkOutId;
	
	
	@Column(name="RESTAURANT_MASTER_ID")
	private String restaurantMasterId;

	@Column(name="USER_ID")
	private String userId;
	
	@Column(name="FLAG")
	private Integer flag;
	
	@Column(name="PRICE")
	private Double price;
	
	@ManyToOne
	@JoinColumn(name="USER_ID",referencedColumnName="USER_ID", insertable = false, updatable= false)
	private UserTbl userTbl;

	@ManyToOne
	@JoinColumn(name="RESTAURANT_MASTER_ID",referencedColumnName="RESTAURANT_ID", insertable = false, updatable= false)
	private RestaurantMasterTbl restaurantMasterTbl;

	public String getCheckOutId() {
		return checkOutId;
	}

	public void setCheckOutId(String checkOutId) {
		this.checkOutId = checkOutId;
	}

	public String getRestaurantMasterId() {
		return restaurantMasterId;
	}

	public void setRestaurantMasterId(String restaurantMasterId) {
		this.restaurantMasterId = restaurantMasterId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public UserTbl getUserTbl() {
		return userTbl;
	}

	public void setUserTbl(UserTbl userTbl) {
		this.userTbl = userTbl;
	}

	public RestaurantMasterTbl getRestaurantMasterTbl() {
		return restaurantMasterTbl;
	}

	public void setRestaurantMasterTbl(RestaurantMasterTbl restaurantMasterTbl) {
		this.restaurantMasterTbl = restaurantMasterTbl;
	}

	@Override
	public String toString() {
		return "CheckOutTbl [checkOutId=" + checkOutId + ", restaurantMasterId=" + restaurantMasterId + ", userId="
				+ userId + ", flag=" + flag + ", price=" + price + ", userTbl=" + userTbl + ", restaurantMasterTbl="
				+ restaurantMasterTbl + "]";
	}
	
	
}
