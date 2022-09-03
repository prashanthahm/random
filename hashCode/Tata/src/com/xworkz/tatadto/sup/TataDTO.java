package com.xworkz.tatadto.sup;

public class TataDTO {
	
	private String name;
	private String indestrie;
	private Integer age;
	private Integer noOfBranches;
	private String place;
	private String city;
	private Integer noOfStaff;
	private Integer noOfBusiness;
	private Integer noOfNationsTravelled;
	private String product;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIndestrie() {
		return indestrie;
	}
	public void setIndestrie(String indestrie) {
		this.indestrie = indestrie;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getNoOfBranches() {
		return noOfBranches;
	}
	public void setNoOfBranches(Integer noOfBranches) {
		this.noOfBranches = noOfBranches;
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
	public Integer getNoOfBusiness() {
		return noOfBusiness;
	}
	public void setNoOfBusiness(Integer noOfBusiness) {
		this.noOfBusiness = noOfBusiness;
	}
	public Integer getNoOfNationsTravelled() {
		return noOfNationsTravelled;
	}
	public void setNoOfNationsTravelled(Integer noOfNationsTravelled) {
		this.noOfNationsTravelled = noOfNationsTravelled;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	@Override
	public int hashCode() {
		return 200;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {
			System.out.println("continue");
			if(obj instanceof TataDTO) {
				System.out.println("Industrie is object");	
			TataDTO casted=(TataDTO)obj;
			if (casted.age.equals(this.age)&&casted.indestrie.equals(this.indestrie)) {
				System.out.println("Tata equals"+this.age +"&"+ this.indestrie);
				return true;
			}
			else {
				System.out.println("Tata is not same");
			}
			
			}
			else {
				System.out.println("Tata is not null");
			}
				
				}
		return false;
		
		}
}

