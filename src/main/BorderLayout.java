package main;

import javax.swing.JFrame;

public class BorderLayout extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public BorderLayout() {
		// Creates the window
				createView();

				// Sets the name of the window to Click Me
				setTitle("Border Layout ");
				// Sets the default close operation aka when you click the X, it will close the
				// program
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				// Sets the size of the frame
				// Packs everything into the window
				pack();
				// Make the window open in the center of the screen
				setLocationRelativeTo(null);
				// Sets Resizilbe to false
				setResizable(false);
				// Makes the window visible
				setVisible(true);
	}

	private void createView() {
		// TODO Auto-generated method stub
		
	}

}
