package Practica;

import java.util.Date;

public class EsportistaFederat extends EsportistaNoFederat{
	public EsportistaFederat(String nom, String cognom1, String cognom2, char sexe, Date dataNaixement, String dni, String club, String codiFederat) {
		super(nom, cognom1, cognom2, sexe, dataNaixement, dni);
		
		this.setClub(club);
		this.setCodiFederat(codiFederat);
		this.setNom(nom);
		this.setCognom1(cognom1);
		this.setCognom2(cognom2);
		this.setDataNaixement(dataNaixement);
		this.setDni(dni);
		this.setSexe(sexe);
		
	}
	private String club;
	private String codiFederat;
	
	public String getCodiFederat() {
		return codiFederat;
	}
	public void setCodiFederat(String codiFederat) {
		this.codiFederat = codiFederat;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}

}
