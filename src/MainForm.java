import javax.swing.JFrame;

/**
 * Repr�sente la fen�tre principale.
 * 
 * La fen�tre h�rite de la classe JFrame qui d�finit une fen�tre dans
 * l'environnement Java. De plus, la fen�tre impl�mente les interfaces
 * SequencesClientListener et MenuBarListener afin de r�agir au diff�rents
 * �v�nements de ces objets.
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
	 * Constructeur par d�faut.
	 * 
	 * Initie les diff�rents objets encapsul�s dans la fen�tre principale.
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
	 * Se d�clence lorsque l'utilisateur demande � se connecter au serveur.
	 */
	@Override
	public void requestToConnect() {
		// TODO Impl�menter la m�thode g�n�r�e.

	}

	/**
	 * Se d�clence lorsque l'utilisateur demande � se d�connecter du serveur.
	 */
	@Override
	public void requestToDisconnect() {
		// TODO Impl�menter la m�thode g�n�r�e.

	}

	/**
	 * Se d�clence lorsque l'utilisateur demande � quitter l'application.
	 */
	@Override
	public void requestToQuit() {
		// TODO Impl�menter la m�thode g�n�r�e.

	}

	/**
	 * Se d�clence lorsque le serveur s'est connect�.
	 */
	@Override
	public void serverConnected() {
		// TODO Impl�menter la m�thode g�n�r�e.

	}

	/**
	 * Se d�clenche lorsque le serveur s'est d�connect�.
	 */
	@Override
	public void serverDisconnected() {
		// TODO Impl�menter la m�thode g�n�r�e.

	}

}
