package com.xworkz.airlines.sup;


public class AirlinesDTO {

	private String name;
	private String ownerName;
	private Integer age;
	private Integer noOfCases;
	private String place;
	private String city;
	private Integer noOfStaff;
	private Integer noOfTravellers;
	private Integer noOfPlanes;
	private String nameOfPlane;
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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
	public Integer getNoOfTravellers() {
		return noOfTravellers;
	}
	public void setNoOfTravellers(Integer noOfTravellers) {
		this.noOfTravellers = noOfTravellers;
	}
	public Integer getNoOfPlanes() {
		return noOfPlanes;
	}
	public void setNoOfPlanes(Integer noOfPlanes) {
		this.noOfPlanes = noOfPlanes;
	}
	public String getNameOfPlane() {
		return nameOfPlane;
	}
	public void setNameOfPlane(String nameOfPlane) {
		this.nameOfPlane = nameOfPlane;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return 300;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {
			System.out.println("continue");
			if(obj instanceof AirlinesDTO) {
				System.out.println("Airlines is object");	
			AirlinesDTO casted=(AirlinesDTO)obj;
			if (casted.age.equals(this.age)&&casted.noOfCases.equals(this.noOfCases)) {
				System.out.println("Airlines equals"+this.age +"&"+ this.noOfCases);
				return true;
			}
			else {
				System.out.println("Airlines is not same");
			}
			
			}
			else {
				System.out.println("Airlines is not null");
			}
				
				}
		return false;
		
		}
}
