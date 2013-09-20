import java.awt.Graphics;
import java.awt.geom.Point2D;

/**
 * Représente un rectangle.
 * 
 * Hérite de la classe Shape représentant une forme graphique.
 * 
 * @auteur	Hugo Lapointe Di Giacomo
 * @date	19 septembre 2013
 */
public class Rectangle extends Shape {

	private Point2D _p1;
	private Point2D _p2;

	/**
	 * Constrcteur par défaut.
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
	 * Dessine le rectangle dans le canvas passé.
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.fillRect(
				(int)this._p1.getX(),
				(int)this._p1.getY(),
				(int)(this._p2.getX() - this._p1.getX()),
				(int)(this._p2.getY() - this._p1.getY())
		);
	}

}
