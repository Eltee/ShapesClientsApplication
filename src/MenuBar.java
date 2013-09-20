import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.EventListenerList;

/**
 * Repr�sente le menu de de la fen�tre principale.
 * 
 * Offre � l'utilisateur la possibilit� de demander de se connecter, se
 * d�connecter ou de quitter l'application. De plus, le menu impl�mente
 * l'interface PropertyChangeListener afin d'int�rargir lorsque l'utilisateur
 * cliquera sur les items du menu.
 * 
 * @auteur Hugo Lapointe Di Giacomo
 * @date 19 septembre 2013
 */
public class MenuBar extends JMenuBar implements PropertyChangeListener {

	private EventListenerList _listenerList;

	/**
	 * Constructeur par d�faut.
	 */
	public MenuBar() {
		JMenu fileMenu = new JMenu("File");
		JMenuItem quitItem = new JMenuItem("Quit");
		fileMenu.add(quitItem);
		add(fileMenu);

		JMenu serverMenu = new JMenu("server");
		JMenuItem connectItem = new JMenuItem("Connect...");
		JMenuItem disconnectItem = new JMenuItem("Disconnect");
		serverMenu.add(connectItem);
		serverMenu.add(disconnectItem);
		add(serverMenu);

		JMenu helpMenu = new JMenu("?");
		JMenuItem aboutItem = new JMenuItem("About...");
		helpMenu.add(aboutItem);
		add(helpMenu);
	}

	/**
	 * Retourne tous les observateur du courant objet.
	 * 
	 * @return
	 */
	public MenuBarListener[] getListeners() {
		return (MenuBarListener[]) this._listenerList
				.getListeners(MenuBarListener.class);
	}

	/**
	 * Se d�clenche lorsque l'utilisateur clique sur un item du menu.
	 */
	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		// TODO Impl�menter la m�thode g�n�r�e.

	}

	/**
	 * Ajoute un observateur � la liste d'observateurs du menu.
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
