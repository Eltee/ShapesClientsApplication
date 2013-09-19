import javax.swing.SwingWorker;
import javax.swing.event.EventListenerList;

/**
 * Repr�sente le client TCP qui r�cup�re les s�quences.
 * 
 * G�re les connexions ainsi que les appels au serveur.
 * 
 * @auteur Hugo Lapointe Di Giacomo
 * @date 19 septembre 2013
 */
public class SequencesClient {

	private final int DELAY = 1000;

	private boolean _isConnected;

	private SwingWorker _swingWorker;
	private EventListenerList _listeners;

	/**
	 * Constructeur par d�faut.
	 */
	public SequencesClient() {
		this._listeners = new EventListenerList();
	}

	/**
	 * D�marre la connexion au serveur.
	 * 
	 * Initie le travail de fond (SwingWorker) permettant de tester l'existance
	 * de la connexion au serveur.
	 * 
	 * @param dns
	 */
	public void start(String dns) {
		// TODO Impl�menter l'alerte aux observateur que le serveur s'est
		// connect�.

		this._swingWorker = new SwingWorker() {
			@Override
			protected Object doInBackground() throws Exception {
				while (true) {
					Thread.sleep(DELAY);

					// TODO Impl�menter la t�che de fond du client TCP.
				}
			}
		};
	}

	/**
	 * Met fin � la connexion au serveur.
	 */
	public void stop() {
		// TODO Impl�menter la m�thode g�n�r�e.
	}

	/**
	 * Retourne une s�quence.
	 * 
	 * @return
	 */
	public String getSequence() {
		// TODO Impl�menter la m�thode g�n�r�e.

		return null;
	}

	/**
	 * Retourne vrai si la connexion au serveur est existante.
	 * @return
	 */
	public boolean isConnected() {

		return this._isConnected;
	}

	/**
	 * Ajoute un observateur � la liste d'observateurs du client.
	 * @param listener
	 */
	public void addActionListener(SequencesClientListener listener) {
		this._listeners.add(SequencesClientListener.class, listener);
	}

	/**
	 * Retire un observateur de la liste d'observateurs du client.
	 * @param listener
	 */
	public void removeActionListener(SequencesClientListener listener) {
		this._listeners.remove(SequencesClientListener.class, listener);
	}
}
