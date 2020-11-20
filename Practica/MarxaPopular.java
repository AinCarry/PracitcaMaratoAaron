package Practica;

import java.time.LocalTime;
import java.util.Date;

public class MarxaPopular extends Prova{
	
	protected int codiFederat;
	protected String ubicacio;
	protected Date data;
	protected LocalTime horaSortida;
	
	
	public MarxaPopular(String nom, int any, int codiProva, int codiFederat,  String ubicacio, Date data, LocalTime horaSortida) {
		super(nom, any, codiProva);
		this.setNom(nom);
		this.setAny(any);
		this.setCodiProva(codiProva);
		this.setCodiFederat(codiFederat);
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
	public void setCodiFederat(int codiFederat) {
		this.codiFederat=codiFederat;
		
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
	public int getCodiFederat() {
		
		
		return this.codiFederat;
		
	}
	

}
