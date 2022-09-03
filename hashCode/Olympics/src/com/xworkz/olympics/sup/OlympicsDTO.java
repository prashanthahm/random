package com.xworkz.olympics.sup;

public class OlympicsDTO {
	
	private String nameOfGames;
	private Integer noOfNations;
	private Integer noOfPlayersInFootball;
	private Integer noOfSetsInMensTennis;
	private Integer noOfPlayersInVollyball;
	private Integer noOfGoldWinByIndia;
	private Integer noOfSilverWinByIndia;
	private Integer noOfBronzeWinByIndia;
	private String host;
	private String fastestRunner;
	
	public String getNameOfGames() {
		return nameOfGames;
	}
	public void setNameOfGames(String nameOfGames) {
		this.nameOfGames = nameOfGames;
	}
	public Integer getNoOfNations() {
		return noOfNations;
	}
	public void setNoOfNations(Integer noOfNations) {
		this.noOfNations = noOfNations;
	}
	public Integer getNoOfPlayersInFootball() {
		return noOfPlayersInFootball;
	}
	public void setNoOfPlayersInFootball(Integer noOfPlayersInFootball) {
		this.noOfPlayersInFootball = noOfPlayersInFootball;
	}
	public Integer getNoOfSetsInMensTennis() {
		return noOfSetsInMensTennis;
	}
	public void setNoOfSetsInMensTennis(Integer noOfSetsInMensTennis) {
		this.noOfSetsInMensTennis = noOfSetsInMensTennis;
	}
	public Integer getNoOfPlayersInVollyball() {
		return noOfPlayersInVollyball;
	}
	public void setNoOfPlayersInVollyball(Integer noOfPlayersInVollyball) {
		this.noOfPlayersInVollyball = noOfPlayersInVollyball;
	}
	public Integer getNoOfGoldWinByIndia() {
		return noOfGoldWinByIndia;
	}
	public void setNoOfGoldWinByIndia(Integer noOfGoldWinByIndia) {
		this.noOfGoldWinByIndia = noOfGoldWinByIndia;
	}
	public Integer getNoOfSilverWinByIndia() {
		return noOfSilverWinByIndia;
	}
	public void setNoOfSilverWinByIndia(Integer noOfSilverWinByIndia) {
		this.noOfSilverWinByIndia = noOfSilverWinByIndia;
	}
	public Integer getNoOfBronzeWinByIndia() {
		return noOfBronzeWinByIndia;
	}
	public void setNoOfBronzeWinByIndia(Integer noOfBronzeWinByIndia) {
		this.noOfBronzeWinByIndia = noOfBronzeWinByIndia;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getFastestRunner() {
		return fastestRunner;
	}
	public void setFastestRunner(String fastestRunner) {
		this.fastestRunner = fastestRunner;
	}
	
	@Override
	public int hashCode() {
		return 800;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {
			System.out.println("continue");
			if(obj instanceof OlympicsDTO) {
				System.out.println("Olympics is object");	
			OlympicsDTO casted=(OlympicsDTO)obj;
			if (casted.noOfPlayersInFootball.equals(this.noOfPlayersInFootball)&&casted.noOfSetsInMensTennis.equals(this.noOfSetsInMensTennis)) {
				System.out.println("Olympics equals"+this.noOfPlayersInFootball +"&"+ this.noOfSetsInMensTennis);
				return true;
			}
			else {
				System.out.println("Olympics is not same");
			}
			
			}
			else {
				System.out.println("Olympics is not null");
			}
				
				}
		return false;
		
		}

}
