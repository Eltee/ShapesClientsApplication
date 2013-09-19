import java.util.EventListener;

/**
 * Représente un observateur de l'objet SequencesClient.
 * 
 * Chaque observateur sera alerté lors du déclenchement de l'un des évènements
 * de l'objet SequencesClient.
 * 
 * @auteur	Hugo Lapointe Di Giacomo
 * @date	19 septembre 2013
 */
public interface SequencesClientListener extends EventListener {
	/**
	 * Se déclenche lorsque la connexion au serveur est crée.
	 */
	public void serverConnected();

	/**
	 * Se déclenche lorsque la connexion au serveur est interrompue.
	 */
	public void serverDisconnected();
}
