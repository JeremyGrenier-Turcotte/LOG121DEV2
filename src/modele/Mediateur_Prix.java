package modele;

import java.util.ArrayList;
import java.util.Observable;

public abstract class Mediateur_Prix extends Observable{
	protected ArrayList<String> gammeAge;
	protected ArrayList<String> sections;
	protected String selectedAge;
	protected String selectedSection;
	protected int prix;
	protected boolean validCombo;
	
	public Mediateur_Prix(){
		gammeAge = new ArrayList<String>();
		sections = new ArrayList<String>();
		selectedAge = "";
		selectedSection = "";
		initializeGammeAge();
		initializeSections();
	}
	
	private void initializeGammeAge(){
		gammeAge.add("");
	}
	
	private void initializeSections(){
		sections.add("");
		sections.add("loges");
		sections.add("parterre");
		sections.add("premier balcon");
		sections.add("deuxième balcon");
	}
	
	public void validCombo(){
		if(prix == -1 || prix == 0){
			validCombo = false;
		}
		else{
			validCombo = true;
		}
		triggerObservers();
	}
	
	public int calculatePrix(){
		return prix;
	}
	
	public void triggerObservers(){
		setChanged();
		notifyObservers();
	}
	
	public ArrayList<String> getGammeAge(){
		return this.gammeAge;
	}
	
	public ArrayList<String> getSections(){
		return this.sections;
	}

	public String getSelectedAge() {
		return selectedAge;
	}
	public String getSelectedSection() {
		return selectedSection;
	}
	public int getPrix(){
		return prix;
	}
	public boolean getValidCombo(){
		return validCombo;
	}

	public void setSelectedAge(String selectedAge) {
		this.selectedAge = selectedAge;
	}
	public void setSelectedSection(String selectedSection) {
		this.selectedSection = selectedSection;
	}
	
}
