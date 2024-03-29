package ua.voytovych.gui;

import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MyJPanel extends JPanel {

	public MyJPanel(String name, int width, int height) {
		super.setSize(width, height);
		super.setName(name);
		super.setBorder(BorderFactory.createEtchedBorder());
	}

	public MyJPanel(String name, int width, int height, Component comp) {
		this(name, width, height);
		super.add(comp);
	}

	public MyJPanel(String name, int width, int height, LayoutManager layout) {
		this(name, width, height);
		super.setLayout(layout);
	}

	public MyJPanel(String name, int width, int height, LayoutManager layout, Component comp) {
		this(name, width, height);
		super.setLayout(layout);
		super.add(comp);
	}

}
