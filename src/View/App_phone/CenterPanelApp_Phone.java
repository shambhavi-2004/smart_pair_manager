package View.App_phone;

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
 * Filename: CenterPanelApp_Phone.java
 * @author:  shambhavi patil
 * Overview: This is the CenterPanelApp_Phone  class it extends Jpanel .
 * it is responsible for setting up buttons in the grid(of initialpanelApp_Phone)
 * IDENTICAL buttons are created via the usage of for loop
 * these buttons will then be used( for setting up data of App_Phone class) this is done by the controller.

 */

public class CenterPanelApp_Phone extends JPanel {
    ArrayList<JButton> buttons = new ArrayList<>();

    public CenterPanelApp_Phone()
    {
        super();
    }

    public void createButtons(int count)
    {
        for (int i = 1; i <= count; i++)
        {

            JButton b = new JButton();
            if (i<=4){
                b.setBackground(Color.RED);
                b.setForeground(Color.cyan);
            }
            else {
                b.setBackground(new Color(108, 241, 41));
            }

            b.setSize(100,100);
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
