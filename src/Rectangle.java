import java.awt.Graphics;
import java.awt.geom.Point2D;

/**
 * Repr�sente un rectangle.
 * 
 * H�rite de la classe Shape repr�sentant une forme graphique.
 * 
 * @auteur	Hugo Lapointe Di Giacomo
 * @date	19 septembre 2013
 */
public class Rectangle extends Shape {

	private Point2D _p1;
	private Point2D _p2;

	/**
	 * Constrcteur par d�faut.
	 * 
	 * @param nseq
	 * @param type
	 * @param p1
	 * @param p2
	 */
	public Rectangle(int nseq, String type, Point2D p1, Point2D p2) {
		super(nseq, type);
		this._p1 = p1;
		this._p2 = p2;
	}

	/**
	 * Dessine le rectangle dans le canvas pass�.
	 */
	@Override
	public void draw(Graphics graphics) {
		// TODO Auto-generated method stub

	}

}
