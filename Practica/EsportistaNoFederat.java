package Practica;

import java.util.Date;

public class EsportistaNoFederat {
	protected String nom; 
	protected String cognom1;
	protected String cognom2;
	protected char sexe;
	protected Date dataNaixement;
	protected String dni;
	public EsportistaNoFederat(String nom, String cognom1, String cognom2, char sexe, Date dataNaixement, String dni){
		
		this.setNom(nom);
		this.setCognom1(cognom1);
		this.setCognom2(cognom2);
		this.setSexe(sexe);
		this.setDataNaixement(dataNaixement);
		this.setDni(dni);
		
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getDataNaixement() {
		return dataNaixement;
	}
	public void setDataNaixement(Date dataNaixement) {
		this.dataNaixement = dataNaixement;
	}
	
}
