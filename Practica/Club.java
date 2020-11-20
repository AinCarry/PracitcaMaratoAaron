package Practica;


public class Club {
	private String nom;
	private String poblacio;
	private int codiPostal;
	private int anyFundacio;
	private String codiClub;
	public Club(String nom, String poblacio, int codiPostal, int anyFundacioInteger, String codiClub) {
		
		this.setNom(nom);
		this.setPoblacio(poblacio);
		this.setCodiPostal(codiPostal);
		this.setAnyFundacio(anyFundacioInteger);
		this.setCodiClub(codiClub);
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPoblacio() {
		return poblacio;
	}
	public void setPoblacio(String poblacio) {
		this.poblacio = poblacio;
	}
	public int getCodiPostal() {
		return codiPostal;
	}
	public void setCodiPostal(int codiPostal) {
		this.codiPostal = codiPostal;
	}
	public int getAnyFundacio() {
		return anyFundacio;
	}
	public void setAnyFundacio(int anyFundacioInteger) {
		this.anyFundacio = anyFundacioInteger;
	}
	public String getCodiClub() {
		return codiClub;
	}
	public void setCodiClub(String codiClub2) {
		this.codiClub = codiClub2;
	}

}
