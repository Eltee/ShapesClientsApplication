import java.util.EventObject;

import javax.swing.JFrame;

/**
 * Représente la fenêtre principale.
 * 
 * La fenêtre hérite de la classe JFrame qui définit une fenêtre dans
 * l'environnement Java. De plus, la fenêtre implémente les interfaces
 * SequencesClientListener et MenuBarListener afin de réagir au différents
 * évènements de ces objets.
 * 
 * @auteur Hugo Lapointe Di Giacomo
 * @date 19 septembre 2013
 */
public class MainForm extends JFrame implements SequencesClientListener,
		MenuBarListener {
	
	private static final long serialVersionUID = 8403163808442068907L;
	
	private ShapesContainer _shapesContainer;
	private SequencesClient _sequencesClient;
	private MenuBar _menuBar;

	/**
	 * Constructeur par défaut.
	 * 
	 * Initie les différents objets encapsulés dans la fenêtre principale.
	 * S'ajoute comme observateur des objets SequencesClient et MenuBar.
	 */
	public MainForm() {
		//this._shapesContainer = new ShapesContainer();
		//this._sequencesClient = new SequencesClient();
		this._menuBar = new MenuBar();

		//this._sequencesClient.addActionListener(this);
		//this._menuBar.addActionListener(this);
		
		setJMenuBar(this._menuBar);
		
		// Initialiser les propriétés de la fenêtre.
		setTitle("Shapes Client Application");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Se déclence lorsque l'utilisateur demande à se connecter au serveur.
	 */
	@Override
	public void requestToConnect(EventObject e) {
		// TODO Implémenter la méthode générée.

	}

	/**
	 * Se déclence lorsque l'utilisateur demande à se déconnecter du serveur.
	 */
	@Override
	public void requestToDisconnect(EventObject e) {
		// TODO Implémenter la méthode générée.

	}

	/**
	 * Se déclence lorsque l'utilisateur demande à quitter l'application.
	 */
	@Override
	public void requestToQuit(EventObject e) {
		// TODO Implémenter la méthode générée.

	}

	/**
	 * Se déclence lorsque le serveur s'est connecté.
	 */
	@Override
	public void serverConnected(EventObject e) {
		// TODO Implémenter la méthode générée.

	}

	/**
	 * Se déclenche lorsque le serveur s'est déconnecté.
	 */
	@Override
	public void serverDisconnected(EventObject e) {
		// TODO Implémenter la méthode générée.

	}

}
