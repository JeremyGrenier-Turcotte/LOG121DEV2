package modele;

import java.util.ArrayList;

public abstract class Mediateur_Prix {
	protected ArrayList<String> gammeAge;
	protected ArrayList<String> sections;
	
	public Mediateur_Prix(){
		gammeAge = new ArrayList<String>();
		sections = new ArrayList<String>();
		initializeGammeAge();
	}
	
	private void initializeGammeAge(){
		gammeAge.add("");
	}
	
	private void initializeSections(){
		//AFFICHAGE DES SECTIONS MARCHE PAS
		//CHUI RENDU ICITTE
		sections.add("loges");
		sections.add("parterre");
		sections.add("premier balcon");
		sections.add("deuxième balcon");
	}
	
	public ArrayList<String> getGammeAge(){
		return this.gammeAge;
	}
	
	public ArrayList<String> getSections(){
		return this.sections;
	}
}
