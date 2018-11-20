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
}
