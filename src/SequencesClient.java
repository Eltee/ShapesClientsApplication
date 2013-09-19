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
		// TODO Impl�menter l'alerte aux observateur que le serveur s'est connect�.
		
		this._swingWorker = new SwingWorker() {
			@Override
			protected Object doInBackground() throws Exception {
				while(true) {
					Thread.sleep(DELAY);
					
					// TODO Impl�menter la t�che de fond du client TCP.
				}
			}
		};
	}

	public void stop() {
		// TODO Impl�menter la m�thode g�n�r�e.
	}

	public String getSequence() {
		// TODO Impl�menter la m�thode g�n�r�e.

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
