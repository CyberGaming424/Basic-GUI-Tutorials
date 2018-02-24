package main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TryTextArea extends JFrame {

	private JTextArea textArea;
	private JButton buttonClear;

	private JTextField fieldMessage;
	private JButton buttonSubmit;

	public TryTextArea() {
		// Creates the window
		createView();

		// Sets the name of the window to Click Me
		setTitle("Text Field Example");
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
		JPanel panel = new JPanel();
		getContentPane().add(panel);

		JLabel label = new JLabel("Enter some text: ");
		panel.add(label);

		fieldMessage = new JTextField(12);
		panel.add(fieldMessage);

		buttonSubmit = new JButton("Submit");
		buttonSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String message = fieldMessage.getText();
				textArea.append(message + "\n");
				fieldMessage.setText("");
			}

		});
		panel.add(buttonSubmit);

		textArea = new JTextArea();
		textArea.setEditable(false);

		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setPreferredSize(new Dimension(350, 90));

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setPreferredSize(new Dimension(350, 100));
		panel.add(scrollPane);

		buttonClear = new JButton("Clear Text Area");
		buttonClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}

		});
		panel.add(buttonClear);
	}
}
