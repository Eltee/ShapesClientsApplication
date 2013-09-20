import java.util.EventListener;
import java.util.EventObject;

/**
 * Représente un observateur de l'objet MenuBar.
 * 
 * Chaque observateur sera alerté lors du déclenchement de l'un des évènements
 * de l'objet MenuBar.
 * 
 * @auteur	Hugo Lapointe Di Giacomo
 * @date	19 septembre 2013
 */
public interface MenuBarListener extends EventListener {
	/**
	 * L'utilisateur demande de se connecter au serveur.
	 */
	public void requestToConnect(EventObject e);

	/**
	 * L'utilisateur demande à se déconnecter du serveur.
	 */
	public void requestToDisconnect(EventObject e);

	/**
	 * L'utilisateur demande de quitter l'application.
	 */
	public void requestToQuit(EventObject e);
}
