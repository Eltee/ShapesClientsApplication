import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.EventObject;

import javax.swing.SwingWorker;
import javax.swing.event.EventListenerList;

/**
 * Repr�sente le client TCP qui r�cup�re les s�quences.
 * 
 * G�re les connexions ainsi que les appels au serveur.
 * 
 * @auteur Renaud Bigras
 * @date 19 septembre 2013
 */
public class SequencesClient {

	private final int DELAY = 1000;
	private Socket socket;
	private PrintWriter out;
	private BufferedReader in;

	private boolean _isConnected;

	private SwingWorker _swingWorker;
	private EventListenerList _listenerList;

	/**
	 * Constructeur par d�faut.
	 */
	public SequencesClient() {
		this._listenerList = new EventListenerList();
	}

	/**
	 * Retourne tous les observateur de l'objet courant.
	 * 
	 * @return
	 */
	public SequencesClientListener[] getListeners() {
		return (SequencesClientListener[]) this._listenerList
				.getListeners(SequencesClientListener.class);
	}

	/**
	 * D�marre la connexion au serveur.
	 * 
	 * Initie le travail de fond (SwingWorker) permettant de tester l'existance
	 * de la connexion au serveur.
	 * 
	 * @param dns
	 */
	public void start(String dns, int port) {
		final String _dns = dns;
		final int _port = port;
		
		//Si d�j� connect�, ne rien faire
		if(_isConnected){
			System.out.println("D�j� connect�!");
		}
		else{
			EventObject e = new EventObject(this);

			// Alerte les observateur que la connexion au serveur a �t� cr��e.
			for (SequencesClientListener listener : this.getListeners()) {
				listener.serverConnected(e);
			}

			//Boucle principale pour le thread du swingWorker qui communique avec le serveur
			this._swingWorker = new SwingWorker() {
				@Override
				protected Object doInBackground() throws Exception {
					//On se connecte au serveur et on initialize le input/output
					try{
						socket = new Socket(_dns, _port);
						out = new PrintWriter(socket.getOutputStream(), 
				                 true);
						in = new BufferedReader(new InputStreamReader(
								socket.getInputStream())); 
						_isConnected = true;
					}
					catch (UnknownHostException e) {
					    System.out.println("Unknown host: localhost");
					    System.exit(1);
					} 
					catch  (IOException e) {
					    System.out.println("No I/O");
					    System.exit(1);
					}
					//Tant que la connection dure..
					while (_isConnected) {
						
						//..� chaque seconde..
						Thread.sleep(DELAY);
						
						//..on �coute premi�rement le serveur..
						try{
						     String line = in.readLine();
						     System.out.println("Text received: " + line);				     
						} 
						catch (IOException e){
						     System.out.println("Read failed");
						     System.exit(1);
						}
						
						//..ensuite on lui envoi notre commande..
						out.println("GET");
						
						//..puis on �coute sa r�ponse.
						try{
						     String line = in.readLine();
						     System.out.println("Text received: " + line);				     
						} 
						catch (IOException e){
						     System.out.println("Read failed");
						     System.exit(1);
						}
						
					}
					return null;
				}
			};
			//On d�marre le thread pour communiquer avec le serveur
			_swingWorker.execute();
		}
		
	}

	/**
	 * Met fin � la connexion au serveur.
	 */
	public void stop() {
		//� effectuer seulement si deja connect�
		if(_isConnected){
			//On termine le thread
			_swingWorker.cancel(true);
			try {
				//On envoi un requ�te de fermeture au serveur
				out = new PrintWriter(socket.getOutputStream(), 
		                 true);
				out.println("END");
				//On ferme le socket
				socket.close();			
			} 
			catch (IOException e) {
				System.out.println("No I/O");
			     System.exit(1);
			}
			_isConnected = false;
		}
	}

	/**
	 * Retourne une s�quence.
	 * 
	 * @return
	 * @throws Exception
	 */
	public String getSequence() throws Exception {
		if (!this.isConnected()) {
			throw new Exception("The connection must be started.");
		}

		// TODO Impl�menter la m�thode g�n�r�e.

		return null;
	}

	/**
	 * Retourne vrai si la connexion au serveur est existante.
	 * 
	 * @return
	 */
	public boolean isConnected() {

		return this._isConnected;
	}

	/**
	 * Ajoute un observateur � la liste d'observateurs du client.
	 * 
	 * @param listener
	 */
	public void addActionListener(SequencesClientListener listener) {
		this._listenerList.add(SequencesClientListener.class, listener);
	}

	/**
	 * Retire un observateur de la liste d'observateurs du client.
	 * 
	 * @param listener
	 */
	public void removeActionListener(SequencesClientListener listener) {
		this._listenerList.remove(SequencesClientListener.class, listener);
	}
}
