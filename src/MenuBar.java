import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JMenuBar;
import javax.swing.event.EventListenerList;

/**
 * Représente le menu de de la fenêtre principale.
 * 
 * Offre à l'utilisateur la possibilité de demander de se connecter, se
 * déconnecter ou de quitter l'application. De plus, le menu implémente
 * l'interface PropertyChangeListener afin d'intérargir lorsque l'utilisateur
 * cliquera sur les items du menu.
 * 
 * @auteur Hugo Lapointe Di Giacomo
 * @date 19 septembre 2013
 */
public class MenuBar extends JMenuBar implements PropertyChangeListener {

	private EventListenerList _listenerList;

	/**
	 * Constructeur par défaut.
	 */
	public MenuBar() {

	}

	/**
	 * Retourne tous les observateur du courant objet.
	 * @return
	 */
	public MenuBarListener[] getListeners() {
		return (MenuBarListener[]) this._listenerList
				.getListeners(MenuBarListener.class);
	}

	/**
	 * Se déclenche lorsque l'utilisateur clique sur un item du menu.
	 */
	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		// TODO Implémenter la méthode générée.

	}

	/**
	 * Ajoute un observateur à la liste d'observateurs du menu.
	 * 
	 * @param listener
	 */
	public void addActionListener(MenuBarListener listener) {
		this._listenerList.add(MenuBarListener.class, listener);
	}

	/**
	 * Retire un observateur de la liste d'observateurs du menu.
	 * 
	 * @param listener
	 */
	public void removeActionListener(MenuBarListener listener) {
		this._listenerList.remove(MenuBarListener.class, listener);
	}
}
