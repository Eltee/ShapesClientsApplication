import javax.swing.SwingUtilities;

/**
 * Repr�sente l'application.
 */
public class ShapesClientApplication {

	/**
	 * Est appel�e lors de la cr�er de l'application en m�moire.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// D�marre le traitement graphique en parall�le.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				MainForm form = new MainForm();
				form.setVisible(true);
			}
		});

	}

}
