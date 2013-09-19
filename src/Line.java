import java.awt.Graphics;
import java.awt.geom.Point2D;

public class Line extends Shape {

	private Point2D _p1;
	private Point2D _p2;

	public Line(int nseq, String type, Point2D p1, Point2D p2) {
		super(nseq, type);
		this._p1 = p1;
		this._p2 = p2;
	}

	@Override
	public void draw(Graphics graphics) {
		// TODO Auto-generated method stub

	}

}
