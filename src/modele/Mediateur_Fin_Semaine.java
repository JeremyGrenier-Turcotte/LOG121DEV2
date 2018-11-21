package modele;

public class Mediateur_Fin_Semaine extends Mediateur_Prix {
	public Mediateur_Fin_Semaine(){
		super();
		initializeGammeAge();
	}
	
	private void initializeGammeAge(){
		gammeAge.add("0-17 ans");
		gammeAge.add("18-25 ans");
		gammeAge.add("26-64 ans");
		gammeAge.add("65 ans et plus");
	}
	
	public int calculatePrix(){
		switch(selectedAge){
		case "0-17 ans":
			switch(selectedSection){
			case "loges": prix=-1;break;
			case "parterre": prix=20;break;
			case "premier balcon": prix= 15;break;
			case "deuxième balcon": prix= 10;break;
			}
			break;
		case "18-25 ans":
			switch(selectedSection){
			case "loges": prix= 35;break;
			case "parterre": prix= 30;break;
			case "premier balcon": prix= 25;break;
			case "deuxième balcon": prix= 20;break;
			}
			break;
		case "26-64 ans":
			switch(selectedSection){
			case "loges": prix= 40;break;
			case "parterre": prix= 40;break;
			case "premier balcon": prix= 35;break;
			case "deuxième balcon": prix= 20;break;
			}
			break;
		case "65 ans et plus":
			switch(selectedSection){
			case "loges": prix= 20;break;
			case "parterre": prix= 15;break;
			case "premier balcon": prix= 10;break;
			case "deuxième balcon": prix= -1;break;
			}
			break;
		}
		triggerObservers();
		return prix;
	}
}
