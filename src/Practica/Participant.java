package Practica;

import java.time.Duration;

public class Participant {
	private String nom;
	private String cognom1;
	private String cognom2;
	private char sexe;
	private String categoria;
	private String club;
	private int dorsal;
	private Duration tempsProva;
	public Participant(String nom, String cognom1, String cognom2, char sexe, String categoria, String club, int dorsal, Duration tempsProva) {
		
		this.setNom(nom);
		this.setCognom1(cognom1);
		this.setCognom2(cognom2);
		this.setSexe(sexe);
		this.setCategoria(categoria);
		this.setClub(club);
		this.setDorsal(dorsal);
		this.setTempsProva(tempsProva);
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognom1() {
		return cognom1;
	}
	public void setCognom1(String cognom1) {
		this.cognom1 = cognom1;
	}
	public String getCognom2() {
		return cognom2;
	}
	public void setCognom2(String cognom2) {
		this.cognom2 = cognom2;
	}
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public Duration getTempsProva() {
		return tempsProva;
	}
	public void setTempsProva(Duration tempsProva) {
		this.tempsProva = tempsProva;
	}

}
