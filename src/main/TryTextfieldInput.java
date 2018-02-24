package main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TryTextfieldInput extends JFrame {

	private JTextField fieldName;
	private JLabel labelMessage;
	private JButton buttonSubmit;

	public TryTextfieldInput() {
		// Creates the window
		createView();

		// Sets the name of the window to Click Me
		setTitle("Text Field Example");
		// Sets the default close operation aka when you click the X, it will close the
		// program
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Sets the size of the frame
		setSize(1000, 1000);
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
		JPanel panel = new JPanel();
		getContentPane().add(panel);

		JLabel label = new JLabel("Enter your name: ");
		panel.add(label);
		fieldName = new JTextField();
		fieldName.setPreferredSize(new Dimension(100, 40));
		panel.add(fieldName);

		buttonSubmit = new JButton("Submit: ");
		buttonSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = fieldName.getText();
				if (name.isEmpty()) {
					labelMessage.setText("Your name can't be nothing can it?");
				} else {
					labelMessage.setText("Hello there " + name + ". How are you?");
				}
			}

		});
		panel.add(buttonSubmit);

		labelMessage = new JLabel("Please enter your name!");
		panel.add(labelMessage);
	}
}
