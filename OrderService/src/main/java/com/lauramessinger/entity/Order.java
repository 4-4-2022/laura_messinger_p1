package com.lauramessinger.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@Column(name = "order_uid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	
	@Column(name="account_uid")
	private int accountId;
	
	@Column(name="product_uid")
	private int productId;
	
	@Column(name="unix_time")
	private int unixTime;

	public Order() {}

	public Order(int uid) {
		this.uid = uid;
	}
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getUnixTime() {
		return unixTime;
	}

	public void setUnixTime(int unixTime) {
		this.unixTime = unixTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountId, productId, uid, unixTime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return accountId == other.accountId && productId == other.productId && uid == other.uid
				&& unixTime == other.unixTime;
	}

	@Override
	public String toString() {
		return "Order [uid=" + uid + ", accountId=" + accountId + ", productId=" + productId + ", unixTime=" + unixTime
				+ "]";
	}
	
}
