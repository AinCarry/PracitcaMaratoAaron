package Practica;

import java.time.LocalTime;
import java.util.Date;

public class Marato extends Prova {
	protected LocalTime horaSortida;
	protected Date data;
	public Marato(String nom, int any, int codiProva,Date data, LocalTime horaSortida) {
		super(nom, any, codiProva);
		
		this.setAny(any);
		this.setNom(nom);
		this.setCodiProva(codiProva);
		this.setData(data);
		this.setHoraSortida(horaSortida);
	}
	public void setData(Date data2) {
		
		
		this.data=data2;
		
		
	}
	public void setHoraSortida(LocalTime horaSortida2) {
		this.horaSortida = horaSortida2;
		
	}
	public Date getData() {
		
		return this.data;
		
	}
	public LocalTime getHoraSortida() {
		
		return this.horaSortida;
		
	}

}
