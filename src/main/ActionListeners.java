package main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionListeners extends JFrame {

	private static final long serialVersionUID = 1L;

	// Initiates the two buttons used
	private JButton buttonCounter, buttonReset;
	// Initiates the label/text field
	JLabel labelCount;

	// Keeps track of how many times you have clicked
	private int clicks = 0;

	// The constructor used to run this class
	public ActionListeners() {
		// Creates the window
		createView();

		// Sets the name of the window to Click Me
		setTitle("Click Me");
		// Sets the default close operation aka when you click the X, it will close the program
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Packs everything into the window
		pack();
		// Make the window open in the center of the screen
		setLocationRelativeTo(null);
		// Makes the screen nonresizable
		setResizable(false);
		// Makes the window visible
		setVisible(true);
	}

	private void createView() {
		JPanel panel = new JPanel();
		getContentPane().add(panel);

		labelCount = new JLabel();
		labelCount.setPreferredSize(new Dimension(200, 30));
		panel.add(labelCount);
		updateCounter();

		buttonCounter = new JButton("Click me");
		buttonCounter.addActionListener(new ButtonActionListener());
		panel.add(buttonCounter);

		buttonReset = new JButton("Reset");
		buttonReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clicks = 0;
				updateCounter();
			}

		});
		panel.add(buttonReset);
	}

	// Updates the counter label
	private void updateCounter() {
		labelCount.setText("Clicked " + clicks + " times");
	}
	
	// One way to make an action listener
	private class ButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			clicks++;
			updateCounter();
		}

	}

}
