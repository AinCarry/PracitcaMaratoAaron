package Practica;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Main {
	//creem els arraylist de cada objecte que guardarem com a public per poder utilitzar-los en els metodes
	public static ArrayList<EsportistaFederat> esportistesFederats = new ArrayList <EsportistaFederat>();
	public static ArrayList<EsportistaNoFederat> esportistesNoFederats = new ArrayList <EsportistaNoFederat>();
	public static ArrayList<Club> clubs = new ArrayList <Club>();
	public static ArrayList<Participant> participants = new ArrayList <Participant>();
	public static ArrayList<Marato> marato = new ArrayList <Marato>();
	public static ArrayList<Prova10000> prova10000 = new ArrayList <Prova10000>();
	public static ArrayList<MarxaPopular> marxaPopular = new ArrayList <MarxaPopular>();
	
	public static void main(String[] args) {
		//inicialtiztem el menu principal amb les opcions predefinides.
		String[] opcionsMenuPrincipal = {"Insertar/Modificar Dades", "Inscripcións","Proves","Sortir"};
		String opcio = "";
		while(opcio.compareTo("Sortir")!=0) {
			opcio = (String) JOptionPane.showInputDialog(null, "Escull una opció", "Atletisme Palamos", 1, null, opcionsMenuPrincipal, opcionsMenuPrincipal[0]);
			//decidim que fer segons l'opció definida amb el cuadre d'opcions
			switch (opcio) {
			case "Insertar/Modificar Dades":
				
				menuDades();
				
				break;
			case "Inscripcións":
				
				menuInscripcions();
				
				break;
			case "Proves":
				
				menuProves();
				
				break;
			case "Sortir":
				
				
				
				break;
			}
			
		}
		
	}
	//fet
	private static void menuProves() {
		//iniciem el menu de proves amb una taula que tingui els valors de les opcions a fer.
				String[] opcionsMenuProves = {"Entrada temps prova", "Entrada temps arribada participants","Classificacio total","Classificacio sexe", "Classificacio categories" , "Retornar"};
				String opcio = "";
				while(opcio.compareTo("Retornar")!=0) {
					opcio = (String) JOptionPane.showInputDialog(null, "Escull una opció", "Atletisme Palamos", 1, null, opcionsMenuProves, opcionsMenuProves[0]);
					//decidim que fer segons l'opció definida amb el cuadre d'opcions
					switch (opcio) {
					
					case "Entrada temps prova":
						
						
						
						break;
					case "Entrada temps arribada participants":
						
						
						
						break;
					case "Classificacio total":
						
						
						
						break;
					case "Classificacio sexe":
						
						
						
						break;
					case "Classificacio categories":
						
						
						
						break;
					case "Retornar":
						
						
						
						break;
					}
					
				}
	}
	//no fet
	private static void menuInscripcions() {
		//iniciem el menu de inscripcions amb una taula que tingui els valors de les opcions a fer.
				String[] opcionsMenuInscripcions = {"Inscripcio prova","Anulacio inscripcio", "Llistar inscripcions" , "Retornar"};
				String opcio = "";
				while(opcio.compareTo("Retornar")!=0) {
					opcio = (String) JOptionPane.showInputDialog(null, "Escull una opció", "Atletisme Palamos", 1, null, opcionsMenuInscripcions, opcionsMenuInscripcions[0]);
					//decidim que fer segons l'opció definida amb el cuadre d'opcions
					switch (opcio) {
					
					
					case "Inscripcio prova":
						
						
						
						break;
					case "Anulacio inscripcio":
						
						
						
						break;
					case "Llistar inscripcions":
						
						
						
						break;
					case "Retornar":
						
						
						
						break;
					}
					
				}
	}
	//no fet
	private static void menuDades() {
		//iniciem el menu de dades amb una taula que tingui els valors de les opcions a fer.
		String[] opcionsMenuDades = {"Alta esportista", "Alta club", "Alta prova", "Consulta club", "Consulta prova" ,"Consulta esportista", "Modificacio d'esportista" , "Modificacio de club", "Modificacio de prova", "Retornar"};
		String opcio = "";
		while(opcio.compareTo("Retornar")!=0) {
			opcio = (String) JOptionPane.showInputDialog(null, "Escull una opció", "Atletisme Palamos", 1, null, opcionsMenuDades, opcionsMenuDades[0]);
			//decidim que fer segons l'opció definida amb el cuadre d'opcions
			switch (opcio) {
			
			case "Alta esportista":
				
				altaEsportista();
				
				break;
			case "Alta club":
				
				altaClub();
				
				break;
			case "Alta prova":
				
				altaProva();
				
				break;
			case "Consulta club":
				
				consultaClub();
				
				break;
			case "Consulta prova":
				
				consultaProva();
				
				break;
			case "Consulta esportista":
				
				consultaEsportista();
				
				break;
			case "Modificacio d'esportista":
				
				modificacioEsportista();
				
				break;
			case "Modificacio de club":
				
				modificacioClub();
				
				break;
			case "Modificacio de prova":
				
				modificacioProva();
				
				break;
			case "Retornar":
				
				
				
				break;
			}
			
		}
		
	}

	//fet
	private static void altaEsportista() {
		String club ="";
		boolean clubExistent = false;
		String codiFederat ="";
		String[] sexe = {"Dona", "Home"};
		String nom = (String) JOptionPane.showInputDialog("Entra el nom de l'esportista");
		String cognom1 =(String) JOptionPane.showInputDialog("Entra el primer cognom de l'esportista");
		String cognom2 =(String) JOptionPane.showInputDialog("Entra el segon cognom de l'esportista");
		char sexeC = ((String) JOptionPane.showInputDialog(null, "Escull el sexe de l'esportista", "Sexe", 1, null, sexe, sexe[0])).charAt(0);
		boolean dataCorrecte = false;
		Date dataNaixement = new Date();
		do {
			
			String dataNaixementString = (String) JOptionPane.showInputDialog("Entra la data de naixement de l'esportista en format dd/mm/aaaa");
			
			try {
				String[] dates = dataNaixementString.split("/");
				int[] datesInt = new int[3];
				for (int j = 0; j < dates.length; j++) {
					datesInt[j] = Integer.parseInt(dates[j]);
				}
				
				dataNaixement = new Date(datesInt[2], datesInt[1], datesInt[0]);
				dataCorrecte = true;				
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "S'ha entrat erroniament el format de la data torna-ho a intentar");
			}
			
		} while (!dataCorrecte);
		dataCorrecte = false;
		String dni = (String) JOptionPane.showInputDialog("Entra el DNI de l'esportista");
		//falta comprobar dni que sea correcto!!!!
		boolean dniReptit = comprobarDni(dni);
		if(dniReptit == true) {
			
			JOptionPane.showMessageDialog(null, "L'esportita ja estaba previament registrat!");
			
		}else {
			
			String[] federacio = {"Si", "No"};
			String federat = (String) JOptionPane.showInputDialog(null, "Es un esportista federat?", "Federat", 1, null, federacio, federacio[0]);
			switch (federat) {
			case "Si":
				//creem l'objecte esportistaN que equival a un esportista federat amb les seves dades i l'afegim a la taula de federats
				
				codiFederat = (String) JOptionPane.showInputDialog("Entra el codi de federat");
				do {
					club = (String) JOptionPane.showInputDialog("Entra el club");
					clubExistent = clubExisteix(club);
				} while (!clubExistent);
				clubExistent = false;
				
				EsportistaFederat esportista = new EsportistaFederat(nom, cognom1, cognom2, sexeC, dataNaixement, dni, club, codiFederat);	
				esportistesFederats.add(esportista);
				break;

			case "No":
				//creem l'objecte esportistaN que equival a un esportista no federat amb les seves dades i l'afegim a la taula de no federats
				EsportistaNoFederat esportistaN = new EsportistaNoFederat(nom, cognom1, cognom2, sexeC, dataNaixement, dni);
				
				esportistesNoFederats.add(esportistaN);
				
				break;
			}
			
		}
		
	}
	//fet
	private static boolean clubExisteix(String club) {
		boolean existent = false;
		
		for (int i = 0; i < clubs.size(); i++) {
			
			if(clubs.get(i).getNom().equalsIgnoreCase(club)) {
				
				existent = true;
				
			}
			
		}
		
		return existent;
	}
	//fet
	private static boolean comprobarDni(String dni) {
		boolean repetit = false;
		
		for (int i = 0; i < esportistesFederats.size(); i++) {
			
			if(esportistesFederats.get(i).getDni().equalsIgnoreCase(dni)) {
				
				repetit = true;
				
			}
			
		}
		for (int i = 0; i < esportistesNoFederats.size(); i++) {
			
			if(esportistesNoFederats.get(i).getDni().equalsIgnoreCase(dni)) {
				
				repetit = true;
				
			}
			
		}
		
		return repetit;
	}
	//fet
	private static void altaClub() {
		boolean codiRepetit = false;
		String codiClub = (String) JOptionPane.showInputDialog("Entra el codi del club");
		codiRepetit = codiClubRepetit(codiClub);
		if(codiRepetit) {
			
			JOptionPane.showInputDialog("El club ja existeix!");
			
		}else {

			String nom = (String) JOptionPane.showInputDialog("Entra el nom del club");
			boolean anyFundacioCorrecte = false;
			boolean codiPostalCorrecte = false;
			int codiPostal = 0;
			int anyFundacioInteger =0;
			String poblacio = (String) JOptionPane.showInputDialog("Entra la poblacio del club");
			do {
			try {
				
				codiPostal = Integer.parseInt((String) JOptionPane.showInputDialog("Entra el codi postal de la poblacio"));
				codiPostalCorrecte = true;
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "El codi postal no es correcte tornal a entrar");
					
			}
			} while (!codiPostalCorrecte);
			do {
				try {
					String anyFundacio = (String) JOptionPane.showInputDialog("Entra l'any de fundacio del club");
					anyFundacioInteger = Integer.parseInt(anyFundacio);
					anyFundacioCorrecte = true;
				} catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "L'any de fundacio no es correcte tornal a entrar");
					
				
				}
			} while (!anyFundacioCorrecte);
			
			Club clubNou = new Club(nom, poblacio, codiPostal, anyFundacioInteger, codiClub);
			clubs.add(clubNou);
			
		}
		
		
	}
	//fet
	private static boolean codiClubRepetit(String codiClub) {
		boolean repetit = false;
		
		for (int i = 0; i < clubs.size(); i++) {
			
			if(clubs.get(i).getCodiClub().equalsIgnoreCase(codiClub)) {
				
				repetit = true;
				
			}
			
		}
		
		return repetit;
	}
	//
	private static void altaProva() {
		
		
		
	}

	private static void consultaClub() {
		
		
	}

	private static void consultaProva() {
		
		
	}

	private static void consultaEsportista() {
		
		
	}

	private static void modificacioEsportista() {
		
		
	}

	private static void modificacioClub() {
		
		
	}

	private static void modificacioProva() {
		
		
	}

}
