import java.util.EventListener;

public interface MenuBarListener extends EventListener{
	public void requestToConnect();

	public void requestToDisconnect();

	public void requestToQuit();
}
