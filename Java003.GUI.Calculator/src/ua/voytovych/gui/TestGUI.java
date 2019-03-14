package ua.voytovych.gui;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;

import ua.voytovych.listeners.CalcButtonActionListener;
import ua.voytovych.listeners.CalcTextFieldFocusListener;
import ua.voytovych.listeners.ChangeSkinActionListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class TestGUI {

	public static final String INPUT_NUMBER = "Enter the number";

	private MyJButton btnAdd;
	private MyJButton btnSubtract;
	private MyJButton btnDivide;
	private MyJButton btnMultiply;
	private MyJButton btnDefaultSkin;
	private MyJButton btnChangeSkin;

	private JLabel labelNumber1;
	private JLabel labelNumber2;
	private JLabel labelResult;

	private MyJTextField jtxtNumber1;
	private MyJTextField jtxtNumber2;
	private MyJTextField jtxtResult;

	private MyJPanel panel1;
	private MyJPanel panel2;
	private MyJPanel panel3;

	private MyJFrame frame;

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new AeroLookAndFeel());
		} catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE, null, ex);
		}

		JFrame.setDefaultLookAndFeelDecorated(true);

		TestGUI testGUI = new TestGUI();

		testGUI.createLabels();
		testGUI.createTextFields();
		testGUI.createButtons();
		testGUI.createPanels();
		testGUI.createFrame();

	}

	private void createLabels() {
		labelNumber1 = new JLabel("Number 1");
		labelNumber2 = new JLabel("Number 2");
		labelResult = new JLabel("Result");
	}

	private void createTextFields() {
		jtxtNumber1 = new MyJTextField(INPUT_NUMBER, 10);
		jtxtNumber2 = new MyJTextField(INPUT_NUMBER, 10);

		jtxtResult = new MyJTextField(15, Color.RED);
		jtxtResult.setEditable(false);
		jtxtResult.setFocusable(false);

		addTextFieldListeners();

	}

	private void createButtons() {
		btnAdd = new MyJButton("Addition");
		btnSubtract = new MyJButton("Subtraction");
		btnDivide = new MyJButton("Division");
		btnMultiply = new MyJButton("Multiplication");
		btnChangeSkin = new MyJButton("Change scin");
		btnChangeSkin = new MyJButton("Scin-1");
		btnDefaultSkin = new MyJButton("Scin-2");

		addButtonListeners();
	}

	private void createPanels() {
		panel1 = new MyJPanel("panel1", 100, 100);
		panel1.setPreferredSize(new Dimension(200, 50));
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

		panel2 = new MyJPanel("panel2", 100, 100);
		panel2.setPreferredSize(new Dimension(200, 50));
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));

		panel3 = new MyJPanel("panel3", 100, 100);
		panel3.setPreferredSize(new Dimension(200, 50));
		panel3.setLayout(new FlowLayout(FlowLayout.LEFT));

		panel1.add(labelNumber1);
		panel1.add(jtxtNumber1);
		panel1.add(labelNumber2);
		panel1.add(jtxtNumber2);

		panel2.add(btnAdd);
		panel2.add(btnSubtract);
		panel2.add(btnMultiply);
		panel2.add(btnDivide);

		panel3.add(labelResult);
		panel3.add(jtxtResult);
		panel3.add(btnChangeSkin);
		panel3.add(btnDefaultSkin);

	}

	private void createFrame() {
		frame = new MyJFrame("Calculator", 430, 200, new BorderLayout(2, 2));
		frame.setMinimumSize(new Dimension(430, 200));

		frame.setResizable(false);

		frame.getContentPane().add(panel1, BorderLayout.NORTH);
		frame.getContentPane().add(panel2, BorderLayout.CENTER);
		frame.getContentPane().add(panel3, BorderLayout.SOUTH);

		addChangeSkinListeners();

		frame.setVisible(true);

	}

	private void addButtonListeners() {
		CalcButtonActionListener bl = new CalcButtonActionListener(jtxtNumber1, jtxtNumber2, jtxtResult);

		btnAdd.addActionListener(bl);
		btnSubtract.addActionListener(bl);
		btnMultiply.addActionListener(bl);
		btnDivide.addActionListener(bl);
	}

	private void addTextFieldListeners() {
		jtxtNumber1.addFocusListener(new CalcTextFieldFocusListener(jtxtNumber1));
		jtxtNumber2.addFocusListener(new CalcTextFieldFocusListener(jtxtNumber2));
	}

	private void addChangeSkinListeners() {
		btnChangeSkin.addActionListener(new ChangeSkinActionListener(frame, new HiFiLookAndFeel()));
		btnDefaultSkin.addActionListener(new ChangeSkinActionListener(frame, new AeroLookAndFeel()));
	}

}
