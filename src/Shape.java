import java.awt.Color;
import java.awt.Graphics;

/**
 * Repr�sente une forme graphique.
 * 
 * La classe est abstraite car elle ne repr�sente pas une forme exacte.
 * 
 * @auteur Hugo Lapointe Di Giacomo
 * @date 19 septembre 2013
 */
public abstract class Shape {
	private final Color COLOR_SQUARE = Color.BLUE;
	private final Color COLOR_RECTANGLE = Color.RED;
	private final Color COLOR_CIRCLE = Color.YELLOW;
	private final Color COLOR_ELLIPSE = Color.PINK;
	private final Color COLOR_LINE = Color.GREEN;

	private int _nseq;
	private String _type;

	/**
	 * Constructeur par d�faut.
	 * 
	 * @param nseq
	 * @param type
	 */
	public Shape(int nseq, String type) {
		this._nseq = nseq;
		this._type = type;
	}

	/**
	 * Dessines la forme dans le canvas pass�.
	 * 
	 * @param g
	 */
	public void paint(Graphics g) {
		
		// Attribue la couleur � la prochaine forme qui sera dessin�.
		switch (this._type) {
		case "SQUARE":
			g.setColor(COLOR_SQUARE);
			break;
		case "RECTANGLE":
			g.setColor(COLOR_RECTANGLE);
			break;
		case "CIRCLE":
			g.setColor(COLOR_CIRCLE);
			break;
		case "ELLIPSE":
			g.setColor(COLOR_ELLIPSE);
			break;
		case "LINE":
			g.setColor(COLOR_LINE);
			break;
		default:
			g.setColor(Color.GRAY);
		}
	}

	/**
	 * Cr�e une forme � partir d'une s�quence retourn�e par le serveur.
	 * 
	 * @param sequence
	 * @return
	 */
	public static Shape create(String sequence) {
		// TODO Impl�menter la m�thode g�n�r�e.

		return null;
	}
}
