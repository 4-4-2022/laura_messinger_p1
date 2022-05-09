package com.lauramessinger.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="products")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Product {
	
	@Id
	@Column(name = "product_uid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	
	@Column(name = "product_type")
	private String type;
	
	@Column(name = "product_name")
	private String name;
	
	@Column(name="price")
	private double price;
	
	@Column(name="manufacturer")
	private String manufacturer;
	
	@Column(name="image")
	private String image;
	
	@OneToOne
	@JoinColumn(name="product_uid")
	@Embedded
	private Rating rating;
	
	public Product() {}
	
	
	
	public Rating getRating() {
		return rating;
	}



	public void setRating(Rating rating) {
		this.rating = rating;
	}



	public int getUid() {
		return uid;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public int hashCode() {
		return Objects.hash(image, manufacturer, name, price, rating, type, uid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(image, other.image) && Objects.equals(manufacturer, other.manufacturer)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(rating, other.rating) && Objects.equals(type, other.type) && uid == other.uid;
	}

	@Override
	public String toString() {
		return "Product [uid=" + uid + ", type=" + type + ", name=" + name + ", price=" + price + ", manufacturer="
				+ manufacturer + ", image=" + image + ", rating=" + rating + "]";
	}
	
}
