package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vue.Selection_Mediateur;

public class Controleur_Selection_Mediateur implements ActionListener{
	
	private Selection_Mediateur vue;
	
	public Controleur_Selection_Mediateur(Selection_Mediateur vue){
		this.vue = vue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String commande = e.getActionCommand();
		
		if(commande.equals(vue.ACTION_SEMAINE)){
			
		}
	}

}
