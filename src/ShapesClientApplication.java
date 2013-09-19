import javax.swing.SwingUtilities;

/**
 * Représente l'application.
 */
public class ShapesClientApplication {

	/**
	 * Est appelée lors de la créer de l'application en mémoire.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Démarre le traitement graphique en parallèle.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				// Affiche la fenêtre principale.
				(new MainForm()).setVisible(true);
			}
		});

	}

}
