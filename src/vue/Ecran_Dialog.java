package vue;

import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.Controleur_Dialog;
import modele.Mediateur_Prix;

public class Ecran_Dialog extends JFrame implements Observer{

	private JPanel panelPrincipal;
	private JComboBox selectionAge;
	private JComboBox selectionSection;
	private JTextField prix;
	private JButton boutonOK;
	private JButton boutonCancel;
	
	private Mediateur_Prix mediateur;
	
	public static final String ACTION_OK = "ok";
	public static final String ACTION_CANCEL = "cancel";
	public static final String ACTION_SELECTION_AGE = "age";
	public static final String ACTION_SELECTION_SECTION = "section";
	
	public Ecran_Dialog(Mediateur_Prix mediateur){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 100);
		panelPrincipal = new JPanel();
		setContentPane(panelPrincipal);
		
		this.mediateur = mediateur;
		mediateur.addObserver(this);
		Controleur_Dialog controleur = new Controleur_Dialog(this, mediateur);
		
		selectionAge = new JComboBox(mediateur.getGammeAge().toArray());
		selectionAge.addActionListener(controleur);
		selectionAge.setActionCommand(ACTION_SELECTION_AGE);
		panelPrincipal.add(selectionAge);
		
		selectionSection = new JComboBox(mediateur.getSections().toArray());
		selectionSection.addActionListener(controleur);
		selectionSection.setActionCommand(ACTION_SELECTION_SECTION);
		panelPrincipal.add(selectionSection);
		
		prix = new JTextField();
		prix.setPreferredSize(new Dimension(50,24));
		prix.setEditable(false);
		panelPrincipal.add(prix);
		
		boutonOK = new JButton("OK");
		boutonOK.setActionCommand(ACTION_OK);
		boutonCancel = new JButton("Cancel");
		boutonCancel.setActionCommand(ACTION_CANCEL);
		
		boutonOK.addActionListener(controleur);
		boutonCancel.addActionListener(controleur);
		
		panelPrincipal.add(boutonOK);
		panelPrincipal.add(boutonCancel);
		
		update(null,null);
		setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		prix.setText(String.valueOf(mediateur.getPrix()));
		boutonOK.setEnabled(mediateur.getValidCombo());
	}
	
	public void closeSelf(){
		this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
	}
	
	public JComboBox getSelectionAge(){
		return selectionAge;
	}
	
	public JComboBox getSelectionSection(){
		return selectionSection;
	}
}
