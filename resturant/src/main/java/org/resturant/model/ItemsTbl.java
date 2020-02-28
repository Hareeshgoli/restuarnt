package org.resturant.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ITEMS_TBL")
public class ItemsTbl {
	
	
	@Id
	@Column(name="ITEM_ID")
	private String itemId;
	
	
	@Column(name="ITEM_DESCRIPTION")
	private String itemDescription;
	
	@Column(name="CATAGORARY_CATAGORARY_ID")
	private String catagoraryId;
	
	@Column(name="SUB_CATAGORARY_ID")
	private String subCatagoraryId;
	
	
	@ManyToOne
	@JoinColumn(name="CATAGORARY_CATAGORARY_ID", referencedColumnName="CATAGORARY_ID", insertable = false, updatable = false)
	private CatagoriesTbl CatagoriesTbl;
	

	@ManyToOne
	@JoinColumn(name="SUB_CATAGORARY_ID", referencedColumnName="SUB_CATAGORARY_ID", insertable = false, updatable = false)
	private SubCategoriesTbl SubCategoriesTbl;
	
	
	@OneToMany(mappedBy="itemsTbl")
	private List<RestaurantItemsMappingTbl> restaurantItemsMappingTbl;


	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}


	public String getItemDescription() {
		return itemDescription;
	}


	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}


	public String getCatagoraryId() {
		return catagoraryId;
	}


	public void setCatagoraryId(String catagoraryId) {
		this.catagoraryId = catagoraryId;
	}


	public String getSubCatagoraryId() {
		return subCatagoraryId;
	}


	public void setSubCatagoraryId(String subCatagoraryId) {
		this.subCatagoraryId = subCatagoraryId;
	}


	public CatagoriesTbl getCatagoriesTbl() {
		return CatagoriesTbl;
	}


	public void setCatagoriesTbl(CatagoriesTbl catagoriesTbl) {
		CatagoriesTbl = catagoriesTbl;
	}


	public SubCategoriesTbl getSubCategoriesTbl() {
		return SubCategoriesTbl;
	}


	public void setSubCategoriesTbl(SubCategoriesTbl subCategoriesTbl) {
		SubCategoriesTbl = subCategoriesTbl;
	}


	@Override
	public String toString() {
		return "ItemsTbl [itemId=" + itemId + ", itemDescription=" + itemDescription + ", catagoraryId=" + catagoraryId
				+ ", subCatagoraryId=" + subCatagoraryId + ", CatagoriesTbl=" + CatagoriesTbl + ", SubCategoriesTbl="
				+ SubCategoriesTbl + "]";
	}
	
	

}
