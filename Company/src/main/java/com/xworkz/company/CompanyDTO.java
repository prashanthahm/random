package com.xworkz.company;

public class CompanyDTO {

	private String name;
	private String founder;
	private String since;
	private String employees;
	private String address;
	private String business;
	
	public CompanyDTO() {
		System.out.println("default constructo running");
	}
	
	public CompanyDTO(String name, String founder, String since, String employees, String address, String business) {
		this.name = name;
		this.founder = founder;
		this.since = since;
		this.employees = employees;
		this.address = address;
		this.business = business;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getSince() {
		return since;
	}

	public void setSince(String since) {
		this.since = since;
	}

	public String getEmployees() {
		return employees;
	}

	public void setEmployees(String employees) {
		this.employees = employees;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}
	
	


}
