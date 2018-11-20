package vue;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import modele.Mediateur_Prix;

public class Ecran_Dialog extends JFrame implements Observer{

	private JPanel panelPrincipal;
	private JComboBox selectionAge;
	private JComboBox selectionSection;
	
	public Ecran_Dialog(Mediateur_Prix mediateur){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 100);
		panelPrincipal = new JPanel();
		setContentPane(panelPrincipal);
		
		selectionAge = new JComboBox(mediateur.getGammeAge().toArray());
		panelPrincipal.add(selectionAge);
		
		selectionSection = new JComboBox(mediateur.getSections().toArray());
		panelPrincipal.add(selectionSection);
		
		setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
