package javaBot;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Yodisc on 2017-01-24.
 */
public class GUI {
    private JButton clickToStartButton;
    private JPanel panel1;
    private JCheckBox acceptTermsOfStartingCheckBox;
    private JCheckBox spamKeysCheckBox;

    public GUI() {
        clickToStartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (spamKeysCheckBox.isSelected() && acceptTermsOfStartingCheckBox.isSelected()){

                    JOptionPane.showMessageDialog(null, "Please select one!");


                } else if (spamKeysCheckBox.isSelected()){

                    spamkeys.spam();

                } else if (acceptTermsOfStartingCheckBox.isSelected()){

                    sine.drawSin();

                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("masterListener v1.0.0");
        frame.setContentPane(new GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}
