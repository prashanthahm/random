package com.xworkz.Marketdto.sup;



public class MarketDTO {

	private String nameOfMarket;
	private String specialFor;
	private Integer since;
	private Integer ward;
	private String place;
	private String city;
	private Integer noOfSellers;
	private Integer noOfShops;
	private Integer noOfCarts;
	private String noOfBuyersPerDay;
	

	public String getSpecialFor() {
		return specialFor;
	}
	public void setSpecialFor(String specialFor) {
		this.specialFor = specialFor;
	}
	public Integer getcity() {
		return since;
	}
	public void setSince(Integer since) {
		this.since = since;
	}
	public Integer getWard() {
		return ward;
	}
	public void setWard(Integer ward) {
		this.ward = ward;
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
	public Integer getNoOfSellers() {
		return noOfSellers;
	}
	public void setNoOfSellers(Integer noOfSellers) {
		this.noOfSellers = noOfSellers;
	}
	public Integer getNoOfShops() {
		return noOfShops;
	}
	public void setNoOfShops(Integer noOfShops) {
		this.noOfShops = noOfShops;
	}
	public Integer getNoOfCarts() {
		return noOfCarts;
	}
	public void setNoOfCarts(Integer noOfCarts) {
		this.noOfCarts = noOfCarts;
	}
	public String getNoOfBuyersPerDay() {
		return noOfBuyersPerDay;
	}
	public void setNoOfBuyersPerDay(String noOfBuyersPerDay) {
		this.noOfBuyersPerDay = noOfBuyersPerDay;
	}
	public String getNameOfMarket() {
		return nameOfMarket;
	}
	public void setNameOfMarket(String nameOfMarket) {
		this.nameOfMarket = nameOfMarket;
	}
	@Override
	public int hashCode() {
		return 700;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {
			System.out.println("continue");
			if(obj instanceof MarketDTO) {
				System.out.println("Market is object");	
			MarketDTO casted=(MarketDTO)obj;
			if (casted.city.equals(this.city)&&casted.specialFor.equals(this.specialFor)) {
				System.out.println("Market equals"+this.city +"&"+ this.specialFor);
				return true;
			}
			else {
				System.out.println("Market is not same");
			}
			
			}
			else {
				System.out.println("Market is not null");
			}
				
				}
		return false;
		
		}
}
