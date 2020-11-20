package Practica;

import java.util.ArrayList;

public class Prova {
	protected String nom = "";
	protected int any;
	protected int codiProva;
	protected ArrayList<Participant> participants = new ArrayList <Participant>();
	public Prova(String nom, int any, int codiProva) {
		
		this.setNom(nom);
		this.setAny(any);
		this.setCodiProva(codiProva);
		
	}
	public void setCodiProva(int codiProva2) {
		this.codiProva=codiProva2;
		
	}
	public void setAny(int any2) {
		this.any=any2;
		
	}
	public void setNom(String nom2) {
		this.nom = nom2;
		
	}
	public String getNom() {
		
		return this.nom;
		
	}
	public int getAny() {
		
		return this.any;
		
	}
	public int getCodiProva() {
		
		return this.codiProva;
		
	}
	//public afegirParticipants aqui!!!
}
