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
		this._shapesContainer = new ShapesContainer();
		this._sequencesClient = new SequencesClient();
		this._menuBar = new MenuBar();

		this._sequencesClient.addActionListener(this);
		this._menuBar.addActionListener(this);
	}

	/**
	 * Se déclence lorsque l'utilisateur demande à se connecter au serveur.
	 */
	@Override
	public void requestToConnect() {
		// TODO Implémenter la méthode générée.

	}

	/**
	 * Se déclence lorsque l'utilisateur demande à se déconnecter du serveur.
	 */
	@Override
	public void requestToDisconnect() {
		// TODO Implémenter la méthode générée.

	}

	/**
	 * Se déclence lorsque l'utilisateur demande à quitter l'application.
	 */
	@Override
	public void requestToQuit() {
		// TODO Implémenter la méthode générée.

	}

	/**
	 * Se déclence lorsque le serveur s'est connecté.
	 */
	@Override
	public void serverConnected() {
		// TODO Implémenter la méthode générée.

	}

	/**
	 * Se déclenche lorsque le serveur s'est déconnecté.
	 */
	@Override
	public void serverDisconnected() {
		// TODO Implémenter la méthode générée.

	}

}
