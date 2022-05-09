package com.lauramessinger.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "account_comments")
public class Comment {

	@Id
	@Column(name = "comment_uid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;

	@ManyToOne
	@JoinColumn(name = "account_uid")
	private Account account;
	
	@Column(name="account_uid", insertable=false, updatable=false)
	private int accountId;

	@Column(name = "product_uid")
	private int productId;

	@Column(name = "account_comment")
	private String comment;

	public Comment() {
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@JsonBackReference
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
	
	

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
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
