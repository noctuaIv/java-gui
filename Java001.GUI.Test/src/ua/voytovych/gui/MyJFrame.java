package ua.voytovych.gui;

import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {

	public MyJFrame(String title, int width, int height) {
		super(title);
		super.setSize(width, height);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLayout(new FlowLayout());
		super.setVisible(true);
	}

	public MyJFrame(String title, int width, int height, Component comp) {
		this(title, width, height);
		super.getContentPane().add(comp);
	}

}
