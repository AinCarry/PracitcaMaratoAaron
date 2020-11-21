package Practica;

import java.time.LocalTime;
import java.util.Date;

public class Prova10000 extends Prova{
	protected String clubAnfitrio ="";
	protected String ubicacio ="";
	protected Date data;
	protected LocalTime horaSortida;
	public Prova10000(String nom, int any, int codiProva, String clubAnfitrio, String ubicacio, Date data, LocalTime horaSortida) {
		super(nom, any, codiProva);
		
		this.setNom(nom);
		this.setAny(any);
		this.setCodiProva(codiProva);
		this.setClubAnfitrio(clubAnfitrio);
		this.setUbicacio(ubicacio);
		this.setData(data);
		this.setHoraSortida(horaSortida);
		
	}
	public void setHoraSortida(LocalTime horaSortida2) {
		this.horaSortida = horaSortida2;
		
	}
	public void setData(Date data2) {
		this.data=data2;
		
	}
	public void setUbicacio(String ubicacio2) {
		this.ubicacio=ubicacio2;
		
	}
	public void setClubAnfitrio(String clubAnfitrio2) {
		this.clubAnfitrio=clubAnfitrio2;
		
	}
	public LocalTime getHoraSortida() {
		
		return this.horaSortida;
		
	}
	public Date getData() {
		
		return this.data;
		
	}
	public String getUbicacio() {
		
		return this.ubicacio;
		
	}
	public String getClubAnfitrio() {
		
		return this.clubAnfitrio;
		
	}
	
}
