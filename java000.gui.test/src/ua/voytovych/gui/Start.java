package ua.voytovych.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Start {

	public static void main(String[] args) {

		MyJButton button1 = new MyJButton("Button");
		MyJPanel panel = new MyJPanel("Panel", 100, 100, button1);
		MyJFrame frame = new MyJFrame("Frame", 200, 200, panel);

		// JFrame frame = new JFrame();
		// frame.setSize(400, 400);
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setVisible(true);
		//
		// FlowLayout fl = new FlowLayout();
		// frame.setLayout(fl);
		//
		// JButton button = new JButton("Test Button");
		// button.setSize(300, 200);
		// frame.add(button);

	}

}
