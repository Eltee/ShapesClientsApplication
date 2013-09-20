import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 * Repr�sente une ellipse.
 * 
 * H�rite de la classe Shape repr�sentant une forme graphique.
 * 
 * @auteur Hugo Lapointe Di Giacomo
 * @date 19 septembre 2013
 */
public class Ellipse extends Shape {

	private Point2D _center;
	private int _radiusX;
	private int _radiusY;

	/**
	 * Constructeur permettant d'instancier un cerle.
	 * 
	 * @param nseq
	 * @param type
	 * @param center
	 * @param radius
	 */
	public Ellipse(int nseq, String type, Point2D center, int radius) {
		super(nseq, type);
		this._center = center;
		this._radiusX = radius;
		this._radiusY = radius;
	}

	/**
	 * Consctructeur permettant d'instancier une ellipse.
	 * 
	 * @param nseq
	 * @param type
	 * @param center
	 * @param radiusX
	 * @param radiusY
	 */
	public Ellipse(int nseq, String type, Point2D center, int radiusX,
			int radiusY) {
		super(nseq, type);
		this._center = center;
		this._radiusX = radiusX;
		this._radiusY = radiusY;
	}

	/**
	 * Dessine l'ellipse dans le canvas pass�.
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		// Dessine la forme.
		g.fillOval(
				(int) this._center.getX() - this._radiusX,
				(int) this._center.getY() - this._radiusY, 
				(int) 2	* this._radiusX, 
				(int) 2 * this._radiusY
		);
	}
}
