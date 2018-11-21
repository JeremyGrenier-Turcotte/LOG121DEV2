package modele;

public class Createur_Mediateur{

	public static Mediateur_Prix getMediateur(String type){
		if("SEMAINE".equalsIgnoreCase(type)){
			return new Mediateur_Semaine();
		}
		else if("FIN_SEMAINE".equalsIgnoreCase(type)){
			return new Mediateur_Fin_Semaine();
		}
		else
			return null;
	}
}
