package org.resturant.model;

import java.io.Serializable;

import javax.persistence.Column;

public class ItemsTblPK implements Serializable {
	

	@Column(name="ITEM_ID")
	private String itemId;
	
	
	@Column(name="CATAGORARY_CATAGORARY_ID")
	private String catagoraryId;
	
	@Column(name="SUB_CATAGORARY_ID")
	private String subCatagoraryId;
	

	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result + ((catagoraryId == null) ? 0 : catagoraryId.hashCode());
		result = prime * result + ((subCatagoraryId == null) ? 0 : subCatagoraryId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemsTblPK other = (ItemsTblPK) obj;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (catagoraryId == null) {
			if (other.catagoraryId != null)
				return false;
		} else if (!catagoraryId.equals(other.catagoraryId))
			return false;
		if (subCatagoraryId == null) {
			if (other.subCatagoraryId != null)
				return false;
		} else if (!subCatagoraryId.equals(other.subCatagoraryId))
			return false;
		return true;
	}
}
