package org.resturant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RESTAURANT_MASTER_TBL")
public class RestaurantMasterTbl {
	
	@Id
	@Column(name="RESTAURANT_ID")
	private String restaurantId;
	
	
	@Column(name="RESTAURANT_DESCRIPTION")
	private String restaurantDescription;


	public String getRestaurantId() {
		return restaurantId;
	}


	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}


	public String getRestaurantDescription() {
		return restaurantDescription;
	}


	public void setRestaurantDescription(String restaurantDescription) {
		this.restaurantDescription = restaurantDescription;
	}


	@Override
	public String toString() {
		return "RestaurantMasterTbl [restaurantId=" + restaurantId + ", restaurantDescription=" + restaurantDescription
				+ "]";
	}


	
	

}
