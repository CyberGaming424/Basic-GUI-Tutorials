package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BasicJFrame {
	public BasicJFrame(){
		// Creates the window
				JFrame frame = new JFrame();

				// Creates a panel
				JPanel panel = new JPanel();
				// Sets the backround color of the panel to black
				panel.setBackground(Color.BLACK);
				// Adds the panel to the frame
				frame.getContentPane().add(panel);
				// Creates a button
				JButton button = new JButton("This is a button");
				// Adds the button to the panel
				panel.add(button);
				
				// Creates a text field
				JTextField textField = new JTextField();
				// Set the preferred size of the text field
				textField.setPreferredSize(new Dimension(200, 15));
				// Add the text field to the panel
				panel.add(textField);

				// Setting the frame size
				frame.setSize(new Dimension(500, 400));
				// Set the start position
				frame.setLocationRelativeTo(null);
				// Set default close action
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// Set a title
				frame.setTitle("A simple JFrame");
				// Disable resize
				frame.setResizable(false);
				// Sets the frame to visable
				frame.setVisible(true);
	}
}
