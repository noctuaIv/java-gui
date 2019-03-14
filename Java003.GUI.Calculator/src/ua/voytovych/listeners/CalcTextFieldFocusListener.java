package ua.voytovych.listeners;

import java.awt.event.FocusEvent;
import java.awt.Color;
import java.awt.event.FocusListener;

import ua.voytovych.gui.MyJTextField;
import ua.voytovych.gui.TestGUI;

public class CalcTextFieldFocusListener implements FocusListener {

    private MyJTextField field;

    public CalcTextFieldFocusListener(MyJTextField field) {
        this.field = field;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (field.getText().trim().equals(TestGUI.INPUT_NUMBER)) {
            field.setText("");
            field.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (field.getText().trim().equals("")) {
            field.setText(TestGUI.INPUT_NUMBER);
            field.setForeground(Color.GRAY);
        }
    }
}