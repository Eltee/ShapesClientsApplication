import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JMenuBar;
import javax.swing.event.EventListenerList;

public class MenuBar extends JMenuBar implements PropertyChangeListener {

	private EventListenerList _listeners;

	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void addActionListener(MenuBarListener listener) {
		this._listeners.add(MenuBarListener.class, listener);
	}

	public void removeActionListener(MenuBarListener listener) {
		this._listeners.remove(MenuBarListener.class, listener);
	}
}
