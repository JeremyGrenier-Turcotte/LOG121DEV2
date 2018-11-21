package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modele.Mediateur_Prix;
import vue.Ecran_Dialog;

public class Controleur_Dialog implements ActionListener{

	private Ecran_Dialog vue;
	private Mediateur_Prix modele;
	
	public Controleur_Dialog(Ecran_Dialog vue, Mediateur_Prix modele){
		this.vue = vue;
		this.modele = modele;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String commande = e.getActionCommand();
		
		if(commande.equals(vue.ACTION_OK)){
			
		}
		else if(commande.equals(vue.ACTION_CANCEL)){
			vue.closeSelf();
		}
		else if(commande.equals(vue.ACTION_SELECTION_AGE)){
			String selectedAge = String.valueOf(vue.getSelectionAge().getSelectedItem());
			modele.setSelectedAge(selectedAge);
			modele.calculatePrix();
			modele.validCombo();
		}
		else if(commande.equals(vue.ACTION_SELECTION_SECTION)){
			String selectedSection = String.valueOf(vue.getSelectionSection().getSelectedItem());
			modele.setSelectedSection(selectedSection);
			modele.calculatePrix();
			modele.validCombo();
		}
	}

}
