package org.resturant.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="CATAGORIES_TBL")
public class CatagoriesTbl {
	
	@Id
	@Column(name="CATAGORARY_ID")
	private String catagoraryId;
	
	
	@Column(name="CATAGORARY_DESCRIPTION")
	private String catDescription;
	
	@OneToMany(mappedBy="CatagoriesTbl")
	private List<ItemsTbl> ItemsTbl;

	
	@OneToMany(mappedBy="catagoriesTbl")
	private List<RestaurantItemsMappingTbl> restaurantItemsMappingTbl;
	
	
	
	
	public List<ItemsTbl> getItemsTbl() {
		return ItemsTbl;
	}


	public void setItemsTbl(List<ItemsTbl> itemsTbl) {
		ItemsTbl = itemsTbl;
	}


	public String getCatagoraryId() {
		return catagoraryId;
	}


	public void setCatagoraryId(String catagoraryId) {
		this.catagoraryId = catagoraryId;
	}


	public String getCatDescription() {
		return catDescription;
	}


	public void setCatDescription(String catDescription) {
		this.catDescription = catDescription;
	}


	@Override
	public String toString() {
		return "CatagoriesTbl [catagoraryId=" + catagoraryId + ", catDescription=" + catDescription + "]";
	}
	
	

}
