package com.lauramessinger.model;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Account {

	private int uid;

	private String email;

	private Credentials credentials;

	private Information information;

	private List<Build> builds;

	private List<Comment> comments;

	public Account() {
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