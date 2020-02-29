package org.resturant.model;

import java.io.Serializable;

import javax.persistence.Column;

public class SubCategoriesTblPK implements Serializable {

	
	@Column(name="SUB_CATAGORARY_ID")
	private String SubcatagoraryId;
	

	@Column(name="CATAGORARY_CATAGORARY_ID")
	private String catid;
	
	public String getCatid() {
		return catid;
	}

	public void setCatid(String catid) {
		this.catid = catid;
	}
	

	public String getSubcatagoraryId() {
		return SubcatagoraryId;
	}

	public void setSubcatagoraryId(String subcatagoraryId) {
		SubcatagoraryId = subcatagoraryId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SubcatagoraryId == null) ? 0 : SubcatagoraryId.hashCode());
		result = prime * result + ((catid == null) ? 0 : catid.hashCode());
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
		SubCategoriesTblPK other = (SubCategoriesTblPK) obj;
		if (SubcatagoraryId == null) {
			if (other.SubcatagoraryId != null)
				return false;
		} else if (!SubcatagoraryId.equals(other.SubcatagoraryId))
			return false;
		if (catid == null) {
			if (other.catid != null)
				return false;
		} else if (!catid.equals(other.catid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SubCategoriesTblPK [SubcatagoraryId=" + SubcatagoraryId + ", catid=" + catid + "]";
	}
	
	
}
