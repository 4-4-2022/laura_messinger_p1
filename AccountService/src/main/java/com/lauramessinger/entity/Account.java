package com.lauramessinger.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "accounts")
public class Account {

	@Id
	@Column(name = "account_uid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;

	@Column(name = "account_email")
	private String email;

	@Embedded
	private Credentials credentials;

	@OneToOne
	@JoinColumn(name="account_uid")
	@Embedded
	private Information information;

	@OneToMany(targetEntity = Build.class)
	@JoinColumn(name = "account_uid")
	private List<Build> builds;

	@OneToMany(targetEntity = Comment.class)
	@JoinColumn(name = "account_uid")
	private List<Comment> comments;

	public Account() {
	}

	public Account(String email, Credentials credentials) {
		super();
		this.email = email;
		this.credentials = credentials;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public Information getInformation() {
		return information;
	}

	public void setInformation(Information information) {
		this.information = information;
	}

	@JsonManagedReference
	public List<Build> getBuilds() {
		return builds;
	}

	public void setBuilds(List<Build> builds) {
		this.builds = builds;
	}

	@JsonManagedReference
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		return Objects.hash(builds, comments, credentials, email, information, uid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(builds, other.builds) && Objects.equals(comments, other.comments)
				&& Objects.equals(credentials, other.credentials) && Objects.equals(email, other.email)
				&& Objects.equals(information, other.information) && uid == other.uid;
	}

	@Override
	public String toString() {
		return "Account [uid=" + uid + ", email=" + email + ", credentials=" + credentials + ", information="
				+ information + ", builds=" + builds + ", comments=" + comments + "]";
	}

}