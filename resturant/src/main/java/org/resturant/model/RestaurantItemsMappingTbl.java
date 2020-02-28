package org.resturant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="RESTAURANT_ITEMS_TBL")
public class RestaurantItemsMappingTbl {

	@Id
	@Column(name="RESTAURANT_MAPPING_ID")
	private String restaurantMapId;
	
	@Column(name="SUB_CATAGORARY_ID")
	private String SubcatagoraryId;
	
	@Column(name="CATAGORARY_ID")
	private String catagoraryId;
	
	@Column(name="ITEM_ID")
	private String itemId;
	
	@Column(name="FLAG")
	private Integer flag;
	
	@Column(name="PRICE")
	private Double price;
	
	
	@ManyToOne
	@JoinColumn(name="SUB_CATAGORARY_ID",referencedColumnName="SUB_CATAGORARY_ID",insertable=false,updatable=false)
	private SubCategoriesTbl subCategoriesTbl;
	
	@ManyToOne
	@JoinColumn(name="CATAGORARY_ID",referencedColumnName="CATAGORARY_ID",insertable=false,updatable=false)
	private CatagoriesTbl catagoriesTbl;
	
	
	@ManyToOne
	@JoinColumn(name="ITEM_ID",referencedColumnName="ITEM_ID",insertable=false,updatable=false)
	private ItemsTbl itemsTbl;
	
	


	public String getRestaurantMapId() {
		return restaurantMapId;
	}


	public void setRestaurantMapId(String restaurantMapId) {
		this.restaurantMapId = restaurantMapId;
	}


	public String getSubcatagoraryId() {
		return SubcatagoraryId;
	}


	public void setSubcatagoraryId(String subcatagoraryId) {
		SubcatagoraryId = subcatagoraryId;
	}


	public String getCatagoraryId() {
		return catagoraryId;
	}


	public void setCatagoraryId(String catagoraryId) {
		this.catagoraryId = catagoraryId;
	}


	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
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


	public SubCategoriesTbl getSubCategoriesTbl() {
		return subCategoriesTbl;
	}


	public void setSubCategoriesTbl(SubCategoriesTbl subCategoriesTbl) {
		this.subCategoriesTbl = subCategoriesTbl;
	}


	public CatagoriesTbl getCatagoriesTbl() {
		return catagoriesTbl;
	}


	public void setCatagoriesTbl(CatagoriesTbl catagoriesTbl) {
		this.catagoriesTbl = catagoriesTbl;
	}


	public ItemsTbl getItemsTbl() {
		return itemsTbl;
	}


	public void setItemsTbl(ItemsTbl itemsTbl) {
		this.itemsTbl = itemsTbl;
	}


	@Override
	public String toString() {
		return "RestaurantItemsMappingTbl [restaurantMapId=" + restaurantMapId + ", SubcatagoraryId=" + SubcatagoraryId
				+ ", catagoraryId=" + catagoraryId + ", itemId=" + itemId + ", flag=" + flag + ", price=" + price
				+ ", subCategoriesTbl=" + subCategoriesTbl + ", catagoriesTbl=" + catagoriesTbl + ", itemsTbl="
				+ itemsTbl + "]";
	}
	
	
}
