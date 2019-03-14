package ua.voytovych.gui;

import java.awt.Rectangle;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AbsoluteLayoutDemo extends LayoutDefaultButtons {

	JPanel panel;

	public void useLayout(JPanel panel) {
		panel.setLayout(null);
	}

	public void addButtonsToPanel(JPanel panel, int buttonCount) {
		ButtonListener bl = new ButtonListener(panel);
		panel = panel;
		JButton button1 = new JButton("Button1");
		button1.setSize(100, 100);
		button1.setBounds(new Rectangle(150, 200, 170, 20));

		// button1.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// JOptionPane.showConfirmDialog(panel, "Test Message");
		//
		// }
		// });

		button1.addActionListener(bl);
		button1.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unused")
			public void mouseCliked(final MouseEvent e) {
				super.mouseClicked(e);
			}
		});

		JButton button2 = new JButton("Button2");
		button1.setBounds(new Rectangle(100, 100, 150, 30));

		button2.addActionListener(bl);

		panel.add(button1);
		panel.add(button2);
	}

	// class ButtonListener implements ActionListener {
	//
	// @Override
	// public void actionPerformed(ActionEvent e) {
	// JOptionPane.showConfirmDialog(panel, "Test Message");
	//
	// }
	//
	// }

}
