package ua.voytovych.gui;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class GridLayoutDemo extends LayoutDefaultButtons {

	public void useLayout(JPanel panel) {
		panel.setLayout(new GridLayout(0, 5, 4, 4));
	}

}
