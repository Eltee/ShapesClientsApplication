import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

/**
 * Représente un observateur de l'objet MenuBar.
 * 
 * Chaque observateur sera alerté lors du déclenchement de l'un des évènements
 * de l'objet MenuBar.
 * 
 * @auteur	Hugo Lapointe Di Giacomo
 * @date	19 septembre 2013
 */
public interface MenuBarListener extends ActionListener, ItemListener {
	/**
	 * L'utilisateur demande de se connecter au serveur.
	 */
	public void requestToConnect(ActionEvent e);

	/**
	 * L'utilisateur demande à se déconnecter du serveur.
	 */
	public void requestToDisconnect(ActionEvent e);

	/**
	 * L'utilisateur demande de quitter l'application.
	 */
	public void requestToQuit(ActionEvent e);
}
