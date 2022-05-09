package com.lauramessinger.entity;

import java.util.Objects;

public class CommentDto {

	int commentId;
	int message;
	public CommentDto() {
		super();
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getMessage() {
		return message;
	}
	public void setMessage(int message) {
		this.message = message;
	}
	@Override
	public int hashCode() {
		return Objects.hash(commentId, message);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommentDto other = (CommentDto) obj;
		return commentId == other.commentId && message == other.message;
	}
	@Override
	public String toString() {
		return "CommentDto [commentId=" + commentId + ", message=" + message + "]";
	}
	
	
	
}
