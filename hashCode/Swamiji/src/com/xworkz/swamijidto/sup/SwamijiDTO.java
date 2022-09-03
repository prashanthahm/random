package com.xworkz.swamijidto.sup;

public class SwamijiDTO {

	private String name;
	private String aliasName;
	private Integer age;
	private Integer noOfCases;
	private String place;
	private String city;
	private Integer noOfStaff;
	private Integer noOfBelevers;
	private Integer noOfBranches;
	private String nameOfAshram;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAliasName() {
		return aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getNoOfCases() {
		return noOfCases;
	}
	public void setNoOfCases(Integer noOfCases) {
		this.noOfCases = noOfCases;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getNoOfStaff() {
		return noOfStaff;
	}
	public void setNoOfStaff(Integer noOfStaff) {
		this.noOfStaff = noOfStaff;
	}
	public Integer getNoOfBelevers() {
		return noOfBelevers;
	}
	public void setNoOfBelevers(Integer noOfBelevers) {
		this.noOfBelevers = noOfBelevers;
	}
	public Integer getNoOfBranches() {
		return noOfBranches;
	}
	public void setNoOfBranches(Integer noOfBranches) {
		this.noOfBranches = noOfBranches;
	}
	public String getNameOfAshram() {
		return nameOfAshram;
	}
	public void setNameOfAshram(String nameOfAshram) {
		this.nameOfAshram = nameOfAshram;
	}
	
	@Override
	public int hashCode() {
		return 456;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {
			System.out.println("continue");
			if(obj instanceof SwamijiDTO) {
				System.out.println("Swamiji is object");	
			SwamijiDTO casted=(SwamijiDTO)obj;
			if (casted.age.equals(this.age)&&casted.noOfCases.equals(this.noOfCases)) {
				System.out.println("swamiji equals"+this.age +"&"+ this.noOfCases);
				return true;
			}
			else {
				System.out.println("swamiji is not same");
			}
			
			}
			else {
				System.out.println("swamiji is not null");
			}
				
				}
		return false;
		
		}
	}

