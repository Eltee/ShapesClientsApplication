import java.awt.Graphics;
import java.awt.geom.Point2D;

public class Ellipse extends Shape {

	private Point2D _center;
	private int _radiusX;
	private int _radiusY;

	public Ellipse(int nseq, String type, Point2D center, int radius) {
		super(nseq, type);
		this._center = center;
		this._radiusX = radius;
		this._radiusY = radius;
	}

	public Ellipse(int nseq, String type, Point2D center, int radiusX,
			int radiusY) {
		super(nseq, type);
		this._center = center;
		this._radiusX = radiusX;
		this._radiusY = radiusY;
	}

	@Override
	public void draw(Graphics graphics) {
		// TODO Auto-generated method stub

	}
}
