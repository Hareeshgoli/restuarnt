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
@Table(name="SUB_CATAGORIES_TBL")
public class SubCategoriesTbl {

	
	@Id
	@Column(name="SUB_CATAGORARY_ID")
	private String SubcatagoraryId;
	
	
	@Column(name="SUB_CATAGORARY_DESCRIPTION")
	private String SubcatDescription;
	
	
	@Column(name="CATAGORARY_CATAGORARY_ID")
	private String catid;
	
	
	@ManyToOne
	@JoinColumn(name="CATAGORARY_CATAGORARY_ID", referencedColumnName="CATAGORARY_ID", insertable = false, updatable = false)
	private CatagoriesTbl CatagoriesTbl;
	
	@OneToMany(mappedBy="SubCategoriesTbl")
	private List<ItemsTbl> ItemsTbl;
	
	
	@OneToMany(mappedBy="subCategoriesTbl")
	private List<RestaurantItemsMappingTbl> restaurantItemsMappingTbl;

	public String getSubcatagoraryId() {
		return SubcatagoraryId;
	}

	public void setSubcatagoraryId(String subcatagoraryId) {
		SubcatagoraryId = subcatagoraryId;
	}

	public String getSubcatDescription() {
		return SubcatDescription;
	}

	public void setSubcatDescription(String subcatDescription) {
		SubcatDescription = subcatDescription;
	}

	public String getCatid() {
		return catid;
	}

	public void setCatid(String catid) {
		this.catid = catid;
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
		return "SubCategoriesTbl [SubcatagoraryId=" + SubcatagoraryId + ", SubcatDescription=" + SubcatDescription
				+ ", catid=" + catid + ", CatagoriesTbl=" + CatagoriesTbl + ", ItemsTbl=" + ItemsTbl + "]";
	}
	
	
	
	
}
