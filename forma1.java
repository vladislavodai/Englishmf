package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class forma1 extends JFrame{

    private JPanel rootPanel;
    private JButton lessonsButton;
    private JButton testsButton;
    private JButton gameButton;
    private JButton learnMoreButton;

    public forma1() {
        this.setBounds(100, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(rootPanel);

        lessonsButton.addActionListener(new forma1.ButtonEventListener());

        testsButton.addActionListener(new forma1.ButtonEventListener());

        gameButton.addActionListener(new forma1.ButtonEventListener());

        learnMoreButton.addActionListener(new forma1.ButtonEventListener());

    }
    class ButtonEventListener  implements ActionListener {
        public void actionPerformed (ActionEvent e){
            String message = "";
            message += "Button was pressed\n";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);

        }
    }
}
