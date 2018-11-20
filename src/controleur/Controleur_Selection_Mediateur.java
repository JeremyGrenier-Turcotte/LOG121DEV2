package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modele.Createur_Mediateur;
import modele.Mediateur_Prix;
import vue.Ecran_Dialog;
import vue.Selection_Mediateur;

public class Controleur_Selection_Mediateur implements ActionListener{
	
	private Selection_Mediateur vue;
	
	public Controleur_Selection_Mediateur(Selection_Mediateur vue){
		this.vue = vue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String commande = e.getActionCommand();
		Mediateur_Prix med = null;
		
		if(commande.equals(vue.ACTION_SEMAINE)){
			med = Createur_Mediateur.getMediateur("SEMAINE");
		}
		else if(commande.equals(vue.ACTION_FIN_SEMAINE)){
			med = Createur_Mediateur.getMediateur("FIN_SEMAINE");
		}
		new Ecran_Dialog(med);
		vue.closeSelf();
	}

}
