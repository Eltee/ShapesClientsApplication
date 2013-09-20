import java.awt.Color;
import java.awt.Graphics;

/**
 * Représente une forme graphique.
 * 
 * La classe est abstraite car elle ne représente pas une forme exacte.
 * 
 * @auteur	Hugo Lapointe Di Giacomo
 * @date	19 septembre 2013
 */
public abstract class Shape {
	private final Color COLOR_SQUARE = Color.BLUE;
	private final Color COLOR_RECTANGLE = Color.RED;
	private final Color COLOR_CIRCLE = Color.YELLOW;
	private final Color COLOR_ELLIPSE = Color.PINK;
	private final Color COLOR_LINE = Color.GREEN;

	private int _nseq;
	private String _type;
	protected Color _color;

	/**
	 * Constructeur par défaut.
	 * 
	 * @param nseq
	 * @param type
	 */
	public Shape(int nseq, String type) {
		this._nseq = nseq;
		this._type = type;
	}

	/**
	 * Dessines la forme dans le canvas passé.
	 * 
	 * @param g
	 */
	public abstract void paint(Graphics g);

	/**
	 * Crée une forme à partir d'une séquence retournée par le serveur.
	 * 
	 * @param sequence
	 * @return
	 */
	public static Shape create(String sequence) {
		// TODO Implémenter la méthode générée.

		return null;
	}
}
