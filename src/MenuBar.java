import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JMenuBar;
import javax.swing.event.EventListenerList;

/**
 * Repr�sente le menu de de la fen�tre principale.
 * 
 * Offre � l'utilisateur la possibilit� de demander de se connecter, se
 * d�connecter ou de quitter l'application. De plus, le menu impl�mente
 * l'interface PropertyChangeListener afin d'int�rargir lorsque l'utilisateur
 * cliquera sur les items du menu.
 * 
 * @auteur	Hugo Lapointe Di Giacomo
 * @date	19 septembre 2013
 */
public class MenuBar extends JMenuBar implements PropertyChangeListener {

	private EventListenerList _listeners;

	/**
	 * Se d�clenche lorsque l'utilisateur clique sur un item du menu.
	 */
	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * Ajoute un observateur � la liste d'observateurs du menu.
	 * 
	 * @param listener
	 */
	public void addActionListener(MenuBarListener listener) {
		this._listeners.add(MenuBarListener.class, listener);
	}

	/**
	 * Retire un observateur de la liste d'observateurs du menu.
	 * 
	 * @param listener
	 */
	public void removeActionListener(MenuBarListener listener) {
		this._listeners.remove(MenuBarListener.class, listener);
	}
}
