package com.teamme.model;

import org.springframework.data.annotation.Id;

public class Summoner {
	@Id
	private Id summonerId;
	private String summonerName;
	private String password;
	private long lastModified;
	private long summonerLevel;
	
	public Summoner(Id summonerId, String summonerName, String password, long lastModified, long summonerLevel){
		
	}
	
	/**
	 * @return the summonerName
	 */
	public String getsummonerId() {
		return summonerName;
	}
	/**
	 * @param summonerId the summonerId to set
	 */
	public void setSummonerId(Id summonerId) {
		this.summonerId = summonerId;
	}
	
	/**
	 * @return the summonerName
	 */
	public String getSummonerName() {
		return summonerName;
	}
	/**
	 * @param summonerName the summonerName to set
	 */
	public void setSummonerName(String summonerName) {
		this.summonerName = summonerName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the lastModified
	 */
	public long getLastModified() {
		return lastModified;
	}
	/**
	 * @param lastModified the lastModified to set
	 */
	public void setLastModified(long lastModified) {
		this.lastModified = lastModified;
	}
	/**
	 * @return the summonerLevel
	 */
	public long getSummonerLevel() {
		return summonerLevel;
	}
	/**
	 * @param summonerLevel the summonerLevel to set
	 */
	public void setSummonerLevel(long summonerLevel) {
		this.summonerLevel = summonerLevel;
	}
}
