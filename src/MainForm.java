import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.EventObject;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
public class MainForm extends JFrame implements SequencesClientListener, WindowListener{
	
	private static final long serialVersionUID = 8403163808442068907L;
	
	private ShapesContainer _shapesContainer;
	private SequencesClient _sequencesClient;
	private MenuBar _menuBar;
	
	//Le panel principal qui contiendra l'élément Canvas _shapesContainer
	private JPanel _panel;
	private int resX = 800;
	private int resY = 600;

	/**
	 * Constructeur par défaut.
	 * 
	 * Initie les différents objets encapsulés dans la fenêtre principale.
	 * S'ajoute comme observateur des objets SequencesClient et MenuBar.
	 */
	public MainForm() {
		super(LocalisationResource.getResource("app.frame.title"));
		this.addWindowListener(this);
		this._shapesContainer = new ShapesContainer();
		this._sequencesClient = new SequencesClient();
		this._menuBar = new MenuBar(this);
		
		//On initialise la fenêtre
		_panel = (JPanel) this.getContentPane();
		_panel.setPreferredSize(new Dimension(resX,resY));
		_panel.setLayout(null);

		setBounds(0,0,resX,resY);
		_panel.add(_shapesContainer);
		
		//On s'assure que le bouton X de la fenêtre n'appel pas directement System.exit, on veut gérer la fermeture manuellement
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//On ajoute le menuBar
		this.setJMenuBar(_menuBar);

		this._sequencesClient.addActionListener(this);
	}

	/**
	 * Se déclenche lorsque l'utilisateur demande à se connecter au serveur.
	 */
	public void requestToConnect() {
		// TODO Implémenter la méthode générée.
		System.out.println("Request to connect.");
		_sequencesClient.start("localhost", 10000);
	}

	/**
	 * Se déclenche lorsque l'utilisateur demande à se déconnecter du serveur.
	 */
	public void requestToDisconnect() {
		// TODO Implémenter la méthode générée.
		System.out.println("Request to disconnect.");
		_sequencesClient.stop();
	}

	/**
	 * Se déclenche lorsque l'utilisateur demande à quitter l'application.
	 */
	public void requestToQuit() {
		// TODO Implémenter la méthode générée.
		System.out.println("Request to quit.");
		_sequencesClient.stop();
		System.exit(0);
	}

	/**
	 * Se déclenche lorsque le serveur s'est connecté.
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
