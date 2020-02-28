package org.resturant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS_TBL")
public class OrdersTbl {

	
	@Id
	@Column(name="ORDER_ID")
	private String orderId;
	
	@Column(name="USER_ID")
	private String userId;
	
	@Column(name="ORDER_STATUS")
	private Integer orderStatus;
	
	@Column(name="ORDER_AMOUNT")
	private Double orderAmount;
	
	@Column(name="CHECK_ID")
	private String checkId;

	
	public String getCheckId() {
		return checkId;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
	}

	@ManyToOne
	@JoinColumn(name="USER_ID",referencedColumnName="USER_ID",insertable=false,updatable=false)
	private UserTbl userTbl;
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	

	public UserTbl getUserTbl() {
		return userTbl;
	}

	public void setUserTbl(UserTbl userTbl) {
		this.userTbl = userTbl;
	}

	
	@Override
	public String toString() {
		return "OrdersTbl [orderId=" + orderId + ", userId=" + userId + ", orderStatus=" + orderStatus
				+ ", orderAmount=" + orderAmount + ", checkId=" + checkId + ", userTbl=" + userTbl + "]";
	}

	
	
	
}
