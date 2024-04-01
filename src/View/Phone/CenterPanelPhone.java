package View.Phone;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
/**
 * Identification comments:
 *   Name: shambhavi patil
 *   Experiment No: 07
 *   Experiment Title: view
 *   Experiment Date: 12-02-2024
 *   @version 1.0
 *
 *
 *
 * Beginning comments:
 * Filename: CenterPanelPhone.java
 * @author:  shambhavi patil
 * Overview: This is the CenterPanelPhone  class it extends Jpanel .
 * it is responsible for setting up buttons in the grid(of initialpanelPhone)
 * IDENTICAL buttons are created via the usage of for loop
 * these buttons will then be used( for setting up data of app class) this is done by the controller.

 */


public class CenterPanelPhone extends JPanel {
    ArrayList<JButton> buttons = new ArrayList<>();

    public CenterPanelPhone()
    {
        super();
    }

    public void createButtons(int count)
    {
        for (int i = 1; i <= count; i++)
        {
            JButton b = new JButton();
            if (i<=5){
                b.setBackground(Color.BLUE);
                b.setForeground(Color.WHITE);
            }
            else {
                b.setBackground(new Color(60, 208, 156));
            }
            b.setSize(500,50);
            buttons.add(b);
            this.add(b);
            validate();
            repaint();
        }

    }

    public void setButtonText(int button_no, String button_text) {
        buttons.get(button_no).setText(button_text);
    }

    public ArrayList<JButton> getAllButtons()
    {
        return buttons;
    }
}
