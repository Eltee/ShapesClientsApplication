import javax.swing.JFrame;

public class MainForm extends JFrame implements SequencesClientListener,
		MenuBarListener {

	private ShapesContainer _shapesContainer;
	private SequencesClient _sequencesClient;
	private MenuBar _menuBar;

	public MainForm() {
		this._shapesContainer = new ShapesContainer();
		this._sequencesClient = new SequencesClient();
		this._menuBar = new MenuBar();

		this._sequencesClient.addActionListener(this);
		this._menuBar.addActionListener(this);
	}

	@Override
	public void requestToConnect() {
		// TODO Auto-generated method stub

	}

	@Override
	public void requestToDisconnect() {
		// TODO Auto-generated method stub

	}

	@Override
	public void requestToQuit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void serverConnected() {
		// TODO Auto-generated method stub

	}

	@Override
	public void serverDisconnected() {
		// TODO Auto-generated method stub

	}

}
