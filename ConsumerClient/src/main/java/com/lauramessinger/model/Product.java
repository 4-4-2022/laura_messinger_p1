package com.lauramessinger.model;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({ @Type(value = Cpu.class, name = "CPU"), @Type(value = CpuCooler.class, name = "CPU Cooler"),
		@Type(value = Motherboard.class, name = "Motherboard"), @Type(value = Memory.class, name = "Memory"),
		@Type(value = Storage.class, name = "Storage"), @Type(value = Gpu.class, name = "GPU"),
		@Type(value = Case.class, name = "Case"), @Type(value = Psu.class, name = "PSU"),
		@Type(value = Os.class, name = "OS"), @Type(value = Monitor.class, name = "Monitor") })
public abstract class Product {

	private int uid;

	private String type;

	private String name;

	private double price;

	private String manufacturer;

	private String image;

	private Rating rating;
	
	private List<Comment> comments;

	public Product() {
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

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
		return Objects.hash(comments, image, manufacturer, name, price, rating, type, uid);
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
		return Objects.equals(comments, other.comments) && Objects.equals(image, other.image)
				&& Objects.equals(manufacturer, other.manufacturer) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(rating, other.rating) && Objects.equals(type, other.type) && uid == other.uid;
	}

	@Override
	public String toString() {
		return "Product [uid=" + uid + ", type=" + type + ", name=" + name + ", price=" + price + ", manufacturer="
				+ manufacturer + ", image=" + image + ", rating=" + rating + ", comments=" + comments + "]";
	}

}
