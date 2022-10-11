package com.xworkz.dto;


import com.xworkz.dto.OwningType;
import com.xworkz.dto.Type;

public class HouseDTO {
	
	private Integer id;
	private String name;
	private String owner;
	private Type type;
	private Integer noOfFloors;
	private Boolean loan;
	private OwningType owningType;
	private Double sqft;
	
	public HouseDTO() {

	System.out.println("default constructor=====================================");
	
	}

	public HouseDTO(int id, String name, String owner, Type type, int noOfFloors, boolean loan, OwningType owningType, double sqft) {
		
		
		System.out.println("parameterized constructor=====================================");
	}

	

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Integer getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(Integer noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public Boolean getLoan() {
		return loan;
	}

	public void setLoan(Boolean loan) {
		this.loan = loan;
	}

	public OwningType getOwningType() {
		return owningType;
	}

	public void setOwningType(OwningType owningType) {
		this.owningType = owningType;
	}

	public Double getSqft() {
		return sqft;
	}

	public void setSqft(Double sqft) {
		this.sqft = sqft;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
