package vue;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controleur.Controleur_Selection_Mediateur;

public class Selection_Mediateur extends JFrame implements Observer{

	private JPanel panelPrincipal;
	private JButton boutonSemaine;
	private JButton boutonFinSemaine;
	
	public static final String ACTION_SEMAINE = "sem";
	public static final String ACTION_FIN_SEMAINE = "fds";
	
	public Selection_Mediateur(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 150);
		panelPrincipal = new JPanel();
		setContentPane(panelPrincipal);
		///////////////////////////////////////
		boutonSemaine = new JButton("Semaine");
		boutonFinSemaine = new JButton("Fin de semaine");
		///////////////////////////////////////
		panelPrincipal.add(boutonSemaine);
		panelPrincipal.add(boutonFinSemaine);
		
		setVisible(true);
		
		Controleur_Selection_Mediateur controleur = new Controleur_Selection_Mediateur(this);
		
		boutonSemaine.setActionCommand(ACTION_SEMAINE);
		boutonSemaine.addActionListener(controleur);
		
		boutonFinSemaine.setActionCommand(ACTION_FIN_SEMAINE);
		boutonFinSemaine.addActionListener(controleur);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		
	}

}
