package com.lauramessinger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Comment {

	private int uid;

	private Account account;
	
	private int accountId;

	private int productId;

	private String comment;

	public Comment() {
	}
	
	

	public Comment(Account account, int productId, String comment) {
		super();
		this.account = account;
		this.productId = productId;
		this.comment = comment;
	}



	public int getAccountId() {
		return accountId;
	}



	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}



	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}


	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(account, accountId, comment, productId, uid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		return Objects.equals(account, other.account) && accountId == other.accountId
				&& Objects.equals(comment, other.comment) && productId == other.productId && uid == other.uid;
	}

	@Override
	public String toString() {
		return "Comment [uid=" + uid + ", account=" + account + ", accountId=" + accountId + ", productId=" + productId
				+ ", comment=" + comment + "]";
	}

}
