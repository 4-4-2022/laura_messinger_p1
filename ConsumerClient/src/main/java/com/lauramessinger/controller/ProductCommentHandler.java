package com.lauramessinger.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.lauramessinger.model.Account;
import com.lauramessinger.model.Comment;
import com.lauramessinger.model.Product;

@Component("productCommentHandler")
public class ProductCommentHandler {

	public void setProductComments(List<Account> accountList, List<Product> productList) {

		List<List<Comment>> listOfAccountCommentLists = new ArrayList<>();

		for (Account account : accountList) {
			listOfAccountCommentLists.add(account.getComments());
		}

		List<Comment> individualComments = new ArrayList<>();

		for (List<Comment> commentList : listOfAccountCommentLists) {
			for (Comment comment : commentList) {
				individualComments.add(comment);
			}
		}

		for (Product product : productList) {

			List<Comment> productComments = new ArrayList<>();

			for (Comment comment : individualComments) {
				
				if (product.getUid() == comment.getProductId()) {
					productComments.add(comment);
				}
			}


			product.setComments(productComments);

		}
	}

}
