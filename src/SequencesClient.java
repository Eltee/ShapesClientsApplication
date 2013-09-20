import java.util.EventObject;

import javax.swing.SwingWorker;
import javax.swing.event.EventListenerList;

/**
 * Représente le client TCP qui récupère les séquences.
 * 
 * Gère les connexions ainsi que les appels au serveur.
 * 
 * @auteur Hugo Lapointe Di Giacomo
 * @date 19 septembre 2013
 */
public class SequencesClient {

	private final int DELAY = 1000;

	private boolean _isConnected;

	private SwingWorker _swingWorker;
	private EventListenerList _listenerList;

	/**
	 * Constructeur par défaut.
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
	 * Démarre la connexion au serveur.
	 * 
	 * Initie le travail de fond (SwingWorker) permettant de tester l'existance
	 * de la connexion au serveur.
	 * 
	 * @param dns
	 */
	public void start(String dns) {
		EventObject e = new EventObject(this);

		// Alerte les observateur que la connexion au serveur a été créée.
		for (SequencesClientListener listener : this.getListeners()) {
			listener.serverConnected(e);
		}

		this._swingWorker = new SwingWorker() {
			@Override
			protected Object doInBackground() throws Exception {
				while (true) {
					Thread.sleep(DELAY);

					// TODO Implémenter la tâche de fond du client TCP.
					// TODO Implémenter la prise en charge d'une déconnexion
					// involontaire.
				}
			}
		};
	}

	/**
	 * Met fin à la connexion au serveur.
	 */
	public void stop() {
		// TODO Implémenter la méthode générée.
	}

	/**
	 * Retourne une séquence.
	 * 
	 * @return
	 * @throws Exception
	 */
	public String getSequence() throws Exception {
		if (!this.isConnected()) {
			throw new Exception("The connection must be started.");
		}

		// TODO Implémenter la méthode générée.

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
	 * Ajoute un observateur à la liste d'observateurs du client.
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
