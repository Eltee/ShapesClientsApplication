import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.EventObject;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
public class MainForm extends JFrame implements SequencesClientListener, WindowListener{
	
	private static final long serialVersionUID = 8403163808442068907L;
	
	private ShapesContainer _shapesContainer;
	private SequencesClient _sequencesClient;
	private MenuBar _menuBar;
	
	//Le panel principal qui contiendra l'�l�ment Canvas _shapesContainer
	private JPanel _panel;
	private int resX = 800;
	private int resY = 600;

	/**
	 * Constructeur par d�faut.
	 * 
	 * Initie les diff�rents objets encapsul�s dans la fen�tre principale.
	 * S'ajoute comme observateur des objets SequencesClient et MenuBar.
	 */
	public MainForm() {
		super(LocalisationResource.getResource("app.frame.title"));
		this.addWindowListener(this);
		this._shapesContainer = new ShapesContainer();
		this._sequencesClient = new SequencesClient();
		this._menuBar = new MenuBar(this);
		
		//On initialise la fen�tre
		_panel = (JPanel) this.getContentPane();
		_panel.setPreferredSize(new Dimension(resX,resY));
		_panel.setLayout(null);

		setBounds(0,0,resX,resY);
		_panel.add(_shapesContainer);
		
		//On s'assure que le bouton X de la fen�tre n'appel pas directement System.exit, on veut g�rer la fermeture manuellement
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//On ajoute le menuBar
		this.setJMenuBar(_menuBar);

		this._sequencesClient.addActionListener(this);
	}

	/**
	 * Se d�clenche lorsque l'utilisateur demande � se connecter au serveur.
	 */
	public void requestToConnect() {
		// TODO Impl�menter la m�thode g�n�r�e.
		System.out.println("Request to connect.");
		_sequencesClient.start("localhost", 10000);
	}

	/**
	 * Se d�clenche lorsque l'utilisateur demande � se d�connecter du serveur.
	 */
	public void requestToDisconnect() {
		// TODO Impl�menter la m�thode g�n�r�e.
		System.out.println("Request to disconnect.");
		_sequencesClient.stop();
	}

	/**
	 * Se d�clenche lorsque l'utilisateur demande � quitter l'application.
	 */
	public void requestToQuit() {
		// TODO Impl�menter la m�thode g�n�r�e.
		System.out.println("Request to quit.");
		_sequencesClient.stop();
		System.exit(0);
	}

	/**
	 * Se d�clenche lorsque le serveur s'est connect�.
	 */
	@Override
	public void serverConnected(EventObject e) {
		// TODO Impl�menter la m�thode g�n�r�e.

	}

	/**
	 * Se d�clenche lorsque le serveur s'est d�connect�.
	 */
	@Override
	public void serverDisconnected(EventObject e) {
		// TODO Impl�menter la m�thode g�n�r�e.

	}

	@Override
	public void windowClosed(WindowEvent e) {
		requestToQuit();		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
