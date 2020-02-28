package org.resturant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS_TBL")
public class UserTbl {
	
	@Id
	@Column(name="USER_ID")
	private String userId;
	
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="MOBILE_NUMBER")
	private Integer mobileNumber;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	public Integer getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "UserTbl [userId=" + userId + ", userName=" + userName + ", mobileNumber=" + mobileNumber + "]";
	}
	

}
