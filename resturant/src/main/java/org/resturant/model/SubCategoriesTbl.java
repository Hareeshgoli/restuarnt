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
@Table(name="SUB_CATAGORIES_TBL")
public class SubCategoriesTbl {

	
	
	@Embedded
	SubCategoriesTblPK id;
	
	@Column(name="SUB_CATAGORARY_DESCRIPTION")
	private String SubcatDescription;
	
	@ManyToOne
	@JoinColumn(name="CATAGORARY_CATAGORARY_ID", referencedColumnName="CATAGORARY_ID", insertable = false, updatable = false)
	private CatagoriesTbl CatagoriesTbl;
	
	@OneToMany(mappedBy="SubCategoriesTbl")
	private List<ItemsTbl> ItemsTbl;
	
	
	@OneToMany(mappedBy="subCategoriesTbl")
	private List<RestaurantItemsMappingTbl> restaurantItemsMappingTbl;


	public String getSubcatDescription() {
		return SubcatDescription;
	}

	public void setSubcatDescription(String subcatDescription) {
		SubcatDescription = subcatDescription;
	}

	

	public CatagoriesTbl getCatagoriesTbl() {
		return CatagoriesTbl;
	}

	public void setCatagoriesTbl(CatagoriesTbl catagoriesTbl) {
		CatagoriesTbl = catagoriesTbl;
	}

	public List<ItemsTbl> getItemsTbl() {
		return ItemsTbl;
	}

	public void setItemsTbl(List<ItemsTbl> itemsTbl) {
		ItemsTbl = itemsTbl;
	}

	@Override
	public String toString() {
		return "SubCategoriesTbl [SubcatDescription=" + SubcatDescription
				+ ",CatagoriesTbl=" + CatagoriesTbl + ", ItemsTbl=" + ItemsTbl + "]";
	}
	
	
	
	
}
