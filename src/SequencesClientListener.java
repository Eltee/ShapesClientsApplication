import java.util.EventListener;

/**
 * Repr�sente un observateur de l'objet SequencesClient.
 * 
 * Chaque observateur sera alert� lors du d�clenchement de l'un des �v�nements
 * de l'objet SequencesClient.
 * 
 * @auteur	Hugo Lapointe Di Giacomo
 * @date	19 septembre 2013
 */
public interface SequencesClientListener extends EventListener {
	/**
	 * Se d�clenche lorsque la connexion au serveur est cr�e.
	 */
	public void serverConnected();

	/**
	 * Se d�clenche lorsque la connexion au serveur est interrompue.
	 */
	public void serverDisconnected();
}
