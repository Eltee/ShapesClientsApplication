import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	private final Color COLOR_SQUARE = Color.BLUE;
	private final Color COLOR_RECTANGLE = Color.RED;
	private final Color COLOR_CIRCLE = Color.YELLOW;
	private final Color COLOR_ELLIPSE = Color.PINK;
	private final Color COLOR_LINE = Color.GREEN;

	private int _nseq;
	private String _type;
	protected Color _color;

	public Shape(int nseq, String type) {
		this._nseq = nseq;
		this._type = type;
	}

	public abstract void draw(Graphics graphics);

	public static Shape create(String sequence) {		
		// TODO Auto-generated method stub

		return null;
	}
}
