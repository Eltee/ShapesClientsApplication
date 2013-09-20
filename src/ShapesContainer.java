import java.awt.Graphics;

import javax.swing.JComponent;

/**
 * Représente le composant qui contiendra les formes graphiques envoyés par le
 * serveur.
 * 
 * Hérite de la classe JComponent représentant un composant graphique dans
 * l'environnement Java.
 * 
 * @auteur Hugo Lapointe Di Giacomo
 * @date 19 septembre 2013
 */
public class ShapesContainer extends JComponent {
	private final int SHAPES_COUNT = 10;

	private Shape[] _shapes;

	/**
	 * Constructeur par défaut.
	 */
	public ShapesContainer() {
		this._shapes = new Shape[SHAPES_COUNT];
	}

	/**
	 * Ajoute une forme au composant.
	 * 
	 * @param shape
	 */
	public void addShape(Shape shape) {
		this.shiftDownShapes();
		this._shapes[0] = shape;
	}

	/**
	 * Dessine le contenu du composant à l'écran.
	 */
	public void paintComponent(Graphics g) {

		// Dessine chaque forme contenues dans le conposant.
		for (int i = 0; i < SHAPES_COUNT; i++) {

			// Desinne la forme dans le canvas du composant.
			this._shapes[i].paint(g);
		}
	}

	/**
	 * Décale les formes afin de toujours garder les 10 dernières formes
	 * ajoutées.
	 */
	private void shiftDownShapes() {
		Shape[] shifted = new Shape[SHAPES_COUNT];

		for (int i = 1; i < SHAPES_COUNT; i++) {
			shifted[i] = this._shapes[i - 1];
		}

		this._shapes = shifted;
	}
}
