import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 * Représente le menu de de la fenêtre principale.
 * 
 * Offre à l'utilisateur la possibilité de demander de se connecter, se
 * déconnecter ou de quitter l'application. De plus, le menu implémente
 * l'interface PropertyChangeListener afin d'intérargir lorsque l'utilisateur
 * cliquera sur les items du menu.
 * 
 * @auteur Hugo Lapointe Di Giacomo
 * @date 19 septembre 2013
 */
public class MenuBar extends JMenuBar implements ActionListener{
	
	private MainForm fenetre; //Le parent du menu; c'est-à=dire la fenêtre principale
	private ArrayList<JMenu> menus; //Liste des menus dans le menuBar
	private static final String //Les liens vers les noms propres à la langue courante
		MENU_FICHIER_TITRE = "app.frame.menus.file.title",
		MENU_FICHIER_QUITTER = "app.frame.menus.file.exit",
		MENU_ACTIONS_TITRE = "app.frame.menus.actions.title",
		MENU_ACTIONS_DEMARRER = "app.frame.menus.actions.start",
		MENU_ACTIONS_ARRETER = "app.frame.menus.actions.stop",
		MENU_AIDE_TITRE = "app.frame.menus.help.title",
		MENU_AIDE_PROPOS = "app.frame.menus.help.about",
		MENU_AIDE_AIDE = "app.frame.menus.help.help",
		MESSAGE_DIALOGUE_A_PROPOS = "app.frame.dialog.about";

	/**
	 * Constructeur par défaut.
	 */
	public MenuBar(MainForm parent) {
		//On lie le menu à son parent
		this.fenetre = parent;
		
		menus = new ArrayList<JMenu>();
		
		JMenuItem menuItem;
		
		//On créer les menus à ajouter, on leur attribue une tache et on les lie au listener (this)
		
		menus.add(new JMenu(LocalisationResource.getResource(MENU_FICHIER_TITRE)));
		
		menuItem = new JMenuItem(LocalisationResource.getResource(MENU_FICHIER_QUITTER));
		menuItem.setActionCommand("quitter");
		menuItem.addActionListener(this);
		menus.get(menus.size()-1).add(menuItem);
		
		
		menus.add(new JMenu(LocalisationResource.getResource(MENU_ACTIONS_TITRE)));
		
		menuItem = new JMenuItem(LocalisationResource.getResource(MENU_ACTIONS_DEMARRER));
		menuItem.setActionCommand("connecter");
		menuItem.addActionListener(this);
		menus.get(menus.size()-1).add(menuItem);
		
		menuItem = new JMenuItem(LocalisationResource.getResource(MENU_ACTIONS_ARRETER));
		menuItem.setActionCommand("deconnecter");
		menuItem.addActionListener(this);
		menus.get(menus.size()-1).add(menuItem);
		
		menus.add(new JMenu(LocalisationResource.getResource(MENU_AIDE_TITRE)));
		
		menuItem = new JMenuItem(LocalisationResource.getResource(MENU_AIDE_PROPOS));
		menuItem.setActionCommand("apropos");
		menuItem.addActionListener(this);
		menus.get(menus.size()-1).add(menuItem);
		
		menuItem = new JMenuItem(LocalisationResource.getResource(MENU_AIDE_AIDE));
		menuItem.setActionCommand("aide");
		menuItem.addActionListener(this);
		menus.get(menus.size()-1).add(menuItem);
		
		//On ajoute les menus au menuBar
		for(int i=0; i<menus.size(); i++){
			this.add(menus.get(i));
		}
		
	}
	
	//TODO: update()

	@Override
	public void actionPerformed(ActionEvent e) {
		//Gestion des evenements
		if(e.getActionCommand().equals("connecter")){
			 fenetre.requestToConnect();
		}
		else if(e.getActionCommand().equals("deconnecter")){
			fenetre.requestToDisconnect();
		}
		else if(e.getActionCommand().equals("quitter")){
			fenetre.requestToQuit();
		}
		else if(e.getActionCommand().equals("apropos")){
			JOptionPane.showMessageDialog(fenetre,
					LocalisationResource.getResource(MESSAGE_DIALOGUE_A_PROPOS),
					LocalisationResource.getResource(MENU_AIDE_PROPOS),
				    JOptionPane.PLAIN_MESSAGE);
		}
		else{
			System.out.println(e.getActionCommand());
		}
	}
	
}
