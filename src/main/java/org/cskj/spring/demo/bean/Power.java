package org.cskj.spring.demo.bean;

public class Power {

	private int id;
	private String name;
	private String country;
	private String occupation;
	private String slogan;
	private String perish;
	
	public Power(int id, String name, String country, String occupation, String slogan, String perish) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.occupation = occupation;
		this.slogan = slogan;
		this.perish = perish;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public String getPerish() {
		return perish;
	}
	public void setPerish(String perish) {
		this.perish = perish;
	}
	public Power() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Power(int id, String name, String slogan, String perish) {
		super();
		this.id = id;
		this.name = name;
		this.slogan = slogan;
		this.perish = perish;
	}
	
	
	
}
