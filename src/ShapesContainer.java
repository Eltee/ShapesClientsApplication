import java.awt.Graphics;

import javax.swing.JComponent;

public class ShapesContainer extends JComponent {
	private final int SHAPES_COUNT = 10;

	private Shape[] _shapes;

	public ShapesContainer() {
		this._shapes = new Shape[SHAPES_COUNT];
	}

	public void addShape(Shape shape) {
		this.shiftDownShapes();
		this._shapes[0] = shape;
	}

	public void update(Graphics graphics) {
		// TODO Auto-generated method stub
	}

	private void shiftDownShapes() {
		Shape[] shifted = new Shape[SHAPES_COUNT];

		for (int i = 1; i < SHAPES_COUNT; i++) {
			shifted[i] = this._shapes[i - 1];
		}

		this._shapes = shifted;
	}
}
