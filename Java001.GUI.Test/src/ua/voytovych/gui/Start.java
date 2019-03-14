package ua.voytovych.gui;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;

import com.jtattoo.plaf.aero.AeroLookAndFeel;

public class Start {

	public static void main(String[] args) {

		// MyJButton button1 = new MyJButton("Button");
		// MyJPanel panel = new MyJPanel("Panel", 100, 100, button1);
		// MyJFrame frame = new MyJFrame("Frame", 200, 200, panel);

		try {
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			// UIManager.setLookAndFeel(new MetalLookAndFeel());
			// UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			UIManager.setLookAndFeel(new AeroLookAndFeel());
			// }
			// catch (ClassNotFoundException e) {
			// e.printStackTrace();
			// } catch (InstantiationException e) {
			// e.printStackTrace();
			// } catch (IllegalAccessException e) {
			// e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JFrame.setDefaultLookAndFeelDecorated(true);

		JFrame frame = new JFrame("Test Frame");
		// frame.setIconImage(new ImageIcon("c:\\temp\\mac.png").getImage());
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		FlowLayout fl = new FlowLayout();
		frame.setLayout(fl);

		JButton button = new JButton("Test Button");
		button.setSize(300, 200);

		JPanel panel = new JPanel(fl);
		panel.setBorder(BorderFactory.createEtchedBorder());
		panel.setSize(300, 300);
		panel.add(button);

		frame.getContentPane().add(panel);

	}

}
