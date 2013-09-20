import java.awt.Graphics;
import java.awt.geom.Point2D;

/**
 * Représente une ligne.
 * 
 * Hérite de la classe Shape représentant une forme graphique.
 * 
 * @auteur	Hugo Lapointe Di Giacomo
 * @date	19 septembre 2013
 */
public class Line extends Shape {

	private Point2D _p1;
	private Point2D _p2;

	/**
	 * Constructeur par défaut.
	 * 
	 * @param nseq
	 * @param type
	 * @param p1
	 * @param p2
	 */
	public Line(int nseq, String type, Point2D p1, Point2D p2) {
		super(nseq, type);
		this._p1 = p1;
		this._p2 = p2;
	}

	/**
	 * Dessine la ligne dans le canvas passé.
	 */
	@Override
	public void paint(Graphics g) {
		// TODO Implémenter la méthode générée.

	}

}
