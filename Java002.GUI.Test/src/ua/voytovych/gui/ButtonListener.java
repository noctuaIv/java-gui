package ua.voytovych.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ButtonListener implements ActionListener {

	private JPanel panel;

	public ButtonListener(JPanel panel) {
		super();
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton button = (JButton) e.getSource();
			JOptionPane.showConfirmDialog(panel, "Test message from " + button.getText());
		}
		// System.out.println(e.getSource());
		// JOptionPane.showConfirmDialog(panel, "Test Message");

	}

}
