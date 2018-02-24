package main;

import javax.swing.SwingUtilities;

public class GeneralGUIBuilding {

	public static void main(String[] args) {
		// BasicJFrame basic = new BasicJFrame();
		// Correct way to call the frame
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// ActionListeners listener = new ActionListeners();
				// BasicJFrame basic = new BasicJFrame()
				// TryTextfieldInput text = new TryTextfieldInput();
				//TryTextArea textArea = new TryTextArea();
				BorderLayout layout = new BorderLayout();
			}

		});
	}

}
