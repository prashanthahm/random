package com.xworkz.computerdto.sup;



public class ComputerDTO {
	
	private String nameOfComputer;
	private String indestrie;
	private Integer since;
	private Integer noOfBranches;
	private String place;
	private String city;
	private Integer noOfStaff;
	private Integer noOfBusiness;
	private Integer noOfNationshavingBusiness;
	private String logo;
	
	public String getIndestrie() {
		return indestrie;
	}
	public void setIndestrie(String indestrie) {
		this.indestrie = indestrie;
	}
	public Integer getSince() {
		return since;
	}
	public void setSince(Integer since) {
		this.since = since;
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
	public Integer getNoOfNationshavingBusiness() {
		return noOfNationshavingBusiness;
	}
	public void setNoOfNationshavingBusiness(Integer noOfNationshavingBusiness) {
		this.noOfNationshavingBusiness = noOfNationshavingBusiness;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getNameOfComputer() {
		return nameOfComputer;
	}
	public void setNameOfComputer(String nameOfComputer) {
		this.nameOfComputer = nameOfComputer;
	}
	@Override
	public int hashCode() {
		return 567;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {
			System.out.println("continue");
			if(obj instanceof ComputerDTO) {
				System.out.println("Industrie is object");	
			ComputerDTO casted=(ComputerDTO)obj;
			if (casted.since.equals(this.since)&&casted.indestrie.equals(this.indestrie)) {
				System.out.println("Computer equals"+this.since +"&"+ this.indestrie);
				return true;
			}
			else {
				System.out.println("Computer is not same");
			}
			
			}
			else {
				System.out.println("Computer is not null");
			}
				
				}
		return false;
		
		}
}
