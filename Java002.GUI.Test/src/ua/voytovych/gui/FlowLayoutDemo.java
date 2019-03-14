package ua.voytovych.gui;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class FlowLayoutDemo extends LayoutDefaultButtons {

	public void useLayout(JPanel panel) {
		panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
	}
}
