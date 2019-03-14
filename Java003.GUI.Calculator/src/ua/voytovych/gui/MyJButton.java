package ua.voytovych.gui;

import javax.swing.JButton;

public class MyJButton extends JButton {

	public MyJButton(String title) {
		super.setText(title);
	}

	public MyJButton(String title, int width, int height) {
		this(title);
		super.setSize(width, height);
	}

}