package modele;

import java.util.ArrayList;

public class Mediateur_Semaine extends Mediateur_Prix {
	public Mediateur_Semaine(){
		super();
		initializeGammeAge();
	}
	
	private void initializeGammeAge(){
		gammeAge.add("0-17 ans");
		gammeAge.add("18-64 ans");
		gammeAge.add("65 ans et plus");
	}
	
	public int calculatePrix(){
		switch(selectedAge){
		case "0-17 ans":
			switch(selectedSection){
			case "loges": prix= 30;break;
			case "parterre": prix= 25;break;
			case "premier balcon": prix= 10;break;
			case "deuxième balcon": prix= 10;break;
			}
			break;
		case "18-64 ans":
			switch(selectedSection){
			case "loges": prix= 40;break;
			case "parterre": prix= 30;break;
			case "premier balcon": prix= 15;break;
			case "deuxième balcon": prix= 10;break;
			}
			break;
		case "65 ans et plus":
			switch(selectedSection){
			case "loges": prix= 30;break;
			case "parterre": prix= 20;break;
			case "premier balcon": prix= 10;break;
			case "deuxième balcon": prix= 10;break;
			}
			break;
		}
		triggerObservers();
		return prix;
	}
}
