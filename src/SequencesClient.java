import javax.swing.SwingWorker;
import javax.swing.event.EventListenerList;

public class SequencesClient {

	private final int DELAY = 1000;

	private boolean _isConnected;

	private SwingWorker _swingWorker;
	private EventListenerList _listeners;

	public SequencesClient() {
		this._listeners = new EventListenerList();
	}

	public void start(String dns) {
		// TODO Implémenter l'alerte aux observateur que le serveur s'est connecté.
		
		this._swingWorker = new SwingWorker() {
			@Override
			protected Object doInBackground() throws Exception {
				while(true) {
					Thread.sleep(DELAY);
					
					// TODO Implémenter la tâche de fond du client TCP.
				}
			}
		};
	}

	public void stop() {
		// TODO Implémenter la méthode générée.
	}

	public String getSequence() {
		// TODO Implémenter la méthode générée.

		return null;
	}

	public boolean isConnected() {

		return this._isConnected;
	}

	public void addActionListener(SequencesClientListener listener) {
		this._listeners.add(SequencesClientListener.class, listener);
	}

	public void removeActionListener(SequencesClientListener listener) {
		this._listeners.remove(SequencesClientListener.class, listener);
	}
}
