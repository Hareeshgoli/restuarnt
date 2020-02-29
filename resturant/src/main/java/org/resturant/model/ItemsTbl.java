package org.resturant.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ITEMS_TBL")
public class ItemsTbl {
	
	
	
	
	@Embedded
	ItemsTblPK id;
	
	@Column(name="ITEM_DESCRIPTION")
	private String itemDescription;
	
	@ManyToOne
	@JoinColumn(name="CATAGORARY_CATAGORARY_ID", referencedColumnName="CATAGORARY_ID", insertable = false, updatable = false)
	private CatagoriesTbl CatagoriesTbl;
	

	@ManyToOne
	@JoinColumn(name="SUB_CATAGORARY_ID", referencedColumnName="SUB_CATAGORARY_ID", insertable = false, updatable = false)
	private SubCategoriesTbl SubCategoriesTbl;
	
	
	@OneToMany(mappedBy="itemsTbl")
	private List<RestaurantItemsMappingTbl> restaurantItemsMappingTbl;




	public String getItemDescription() {
		return itemDescription;
	}


	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
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
		return "ItemsTbl [itemDescription=" + itemDescription + ", CatagoriesTbl=" + CatagoriesTbl + ", SubCategoriesTbl="
				+ SubCategoriesTbl + "]";
	}
	
	

}
