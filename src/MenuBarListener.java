import java.util.EventListener;
import java.util.EventObject;

/**
 * Repr�sente un observateur de l'objet MenuBar.
 * 
 * Chaque observateur sera alert� lors du d�clenchement de l'un des �v�nements
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
	 * L'utilisateur demande � se d�connecter du serveur.
	 */
	public void requestToDisconnect(EventObject e);

	/**
	 * L'utilisateur demande de quitter l'application.
	 */
	public void requestToQuit(EventObject e);
}
