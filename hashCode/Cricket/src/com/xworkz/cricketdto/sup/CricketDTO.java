package com.xworkz.cricketdto.sup;

public class CricketDTO {
	
	private String nameOfTeam;
	private Integer noOfBatsmans;
	private Integer noOfBowlers;
	private Integer noOfAlrounders;
	private Integer noOfWickets;
	private Integer noOfExtraPlayers;
	private Integer noOfFastBowlers;
	private Integer noOfSpinners;
	private String captain;
	private String coach;
	
	public String getNameOfTeam() {
		return nameOfTeam;
	}
	public void setNameOfTeam(String nameOfTeam) {
		this.nameOfTeam = nameOfTeam;
	}
	public Integer getNoOfBatsmans() {
		return noOfBatsmans;
	}
	public void setNoOfBatsmans(Integer noOfBatsmans) {
		this.noOfBatsmans = noOfBatsmans;
	}
	public Integer getNoOfBowlers() {
		return noOfBowlers;
	}
	public void setNoOfBowlers(Integer noOfBowlers) {
		this.noOfBowlers = noOfBowlers;
	}
	public Integer getNoOfAlrounders() {
		return noOfAlrounders;
	}
	public void setNoOfAlrounders(Integer noOfAlrounders) {
		this.noOfAlrounders = noOfAlrounders;
	}
	public Integer getNoOfWickets() {
		return noOfWickets;
	}
	public void setNoOfWickets(Integer noOfWickets) {
		this.noOfWickets = noOfWickets;
	}
	public Integer getNoOfExtraPlayers() {
		return noOfExtraPlayers;
	}
	public void setNoOfExtraPlayers(Integer noOfExtraPlayers) {
		this.noOfExtraPlayers = noOfExtraPlayers;
	}
	public Integer getNoOfFastBowlers() {
		return noOfFastBowlers;
	}
	public void setNoOfFastBowlers(Integer noOfFastBowlers) {
		this.noOfFastBowlers = noOfFastBowlers;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public Integer getNoOfSpinners() {
		return noOfSpinners;
	}
	public void setNoOfSpinners(Integer noOfSpinners) {
		this.noOfSpinners = noOfSpinners;
	}
	
	@Override
	public int hashCode() {
		return 700;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {
			System.out.println("continue");
			if(obj instanceof CricketDTO) {
				System.out.println("Cricket is object");	
			CricketDTO casted=(CricketDTO)obj;
			if (casted.noOfBatsmans.equals(this.noOfBatsmans)&&casted.noOfBowlers.equals(this.noOfBowlers)) {
				System.out.println("cricket equals"+this.noOfBatsmans +"&"+ this.noOfBowlers);
				return true;
			}
			else {
				System.out.println("Cricket is not same");
			}
			
			}
			else {
				System.out.println("Cricket is not null");
			}
				
				}
		return false;
		
		}
}
