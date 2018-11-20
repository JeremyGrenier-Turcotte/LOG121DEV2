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
}
