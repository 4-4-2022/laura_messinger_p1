package com.lauramessinger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rating {
	
	private int productId;
	
	private int oneStars;
	
	private int twoStars;
	
	private int threeStars;
	
	private int fourStars;
	
	private int fiveStars;
	
	private double avgStars;

	public Rating() {
	}
	
	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getOneStars() {
		return oneStars;
	}

	public void setOneStars(int oneStars) {
		this.oneStars = oneStars;
	}

	public int getTwoStars() {
		return twoStars;
	}

	public void setTwoStars(int twoStars) {
		this.twoStars = twoStars;
	}

	public int getThreeStars() {
		return threeStars;
	}

	public void setThreeStars(int threeStars) {
		this.threeStars = threeStars;
	}

	public int getFourStars() {
		return fourStars;
	}

	public void setFourStars(int fourStars) {
		this.fourStars = fourStars;
	}

	public int getFiveStars() {
		return fiveStars;
	}

	public void setFiveStars(int fiveStars) {
		this.fiveStars = fiveStars;
	}

	public double getAvgStars() {

		List<Integer> ratingList = new ArrayList<Integer>();

		for (int i = 0; i < oneStars; i++)
			ratingList.add(1);
		for (int i = 0; i < twoStars; i++)
			ratingList.add(2);
		for (int i = 0; i < threeStars; i++)
			ratingList.add(3);
		for (int i = 0; i < fourStars; i++)
			ratingList.add(4);
		for (int i = 0; i < fiveStars; i++)
			ratingList.add(5);

		return ratingList.stream().mapToInt(a -> a).average().orElse(0);

	}

	public void setAvgStars(double avgStars) {
		this.avgStars = avgStars;
	}

	@Override
	public int hashCode() {
		return Objects.hash(avgStars, fiveStars, fourStars, oneStars, productId, threeStars, twoStars);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rating other = (Rating) obj;
		return Double.doubleToLongBits(avgStars) == Double.doubleToLongBits(other.avgStars)
				&& fiveStars == other.fiveStars && fourStars == other.fourStars && oneStars == other.oneStars
				&& productId == other.productId && threeStars == other.threeStars && twoStars == other.twoStars;
	}

	@Override
	public String toString() {
		return "Rating [productId=" + productId + ", oneStars=" + oneStars + ", twoStars=" + twoStars + ", threeStars="
				+ threeStars + ", fourStars=" + fourStars + ", fiveStars=" + fiveStars + ", avgStars=" + avgStars + "]";
	}

}
