import java.util.EventListener;

public interface SequencesClientListener extends EventListener {
	public void serverConnected();

	public void serverDisconnected();
}
