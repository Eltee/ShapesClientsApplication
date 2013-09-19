import java.awt.Graphics;
import java.awt.geom.Point2D;

/**
 * Représente une ellipse.
 * 
 * Hérite de la classe Shape représentant une forme graphique.
 * 
 * @auteur	Hugo Lapointe Di Giacomo
 * @date	19 septembre 2013
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
	 * Dessine l'ellipse dans le canvas passé.
	 */
	@Override
	public void draw(Graphics graphics) {
		// TODO Auto-generated method stub

	}
}
