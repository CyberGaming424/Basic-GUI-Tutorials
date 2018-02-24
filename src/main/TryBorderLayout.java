package main;

import java.awt.BorderLayout;
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
import javax.swing.border.EmptyBorder;

public class TryBorderLayout extends JFrame {

	private JButton buttonSubmit, buttonClear;
	private JTextField fieldMessage;
	private JTextArea textArea;

	private static final long serialVersionUID = 1L;

	public TryBorderLayout() {
		// Creates the window
		createView();

		// Sets the name of the window to Click Me
		setTitle("Border Layout ");
		// Sets the default close operation aka when you click the X, it will close the
		// program
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Sets the size of the frame
		// setSize();
		setMinimumSize(new Dimension(400, 200));
		// Packs everything into the window
		pack();
		// Make the window open in the center of the screen
		setLocationRelativeTo(null);
		// Sets Resizilbe to false
		setResizable(true);
		// Makes the window visible
		setVisible(true);
	}

	private void createView() {
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel.setLayout(new BorderLayout());
		getContentPane().add(panel);

		// North
		JPanel panelNorth = new JPanel(new BorderLayout());
		panel.add(panelNorth, BorderLayout.NORTH);
		panel.setPreferredSize(new Dimension(300, 150));
		panelNorth.add(new JLabel("Enter a new message: "), BorderLayout.WEST);

		fieldMessage = new JTextField();
		//fieldMessage.setBorder(new EmptyBorder(0, 5, 5, 0));
		panelNorth.add(fieldMessage, BorderLayout.CENTER);

		buttonSubmit = new JButton("Submit");
		buttonSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append(fieldMessage.getText() + "\n");
			}

		});
		panelNorth.add(buttonSubmit, BorderLayout.EAST);
		//

		// Center
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		JScrollPane scrollPane = new JScrollPane(textArea);
		panel.add(scrollPane);
		//

		// South
		JPanel panelSouth = new JPanel();
		panel.add(panelSouth, BorderLayout.SOUTH);

		buttonClear = new JButton("Clear Text");
		buttonClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}

		});
		panelSouth.add(buttonClear);
		//
	}

}
