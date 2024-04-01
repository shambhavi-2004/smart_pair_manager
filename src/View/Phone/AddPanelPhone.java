package View.Phone;

import View.Apps.AddPanelApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
 * Filename: AddPanelPhone.java
 * @author:  shambhavi patil
 * Overview: This is the AddPanelPhone  class it extends Jpanel .
 * it is responsible for giving the GUI feel to the add phone function .
 * it has multiple Jtext fields and a Jbutton
 * the jtext fields have been initially set to store text (that are attributes of phone class)
 * this will make it easy for the user to understand what kind of text to pass in the textfield,while creation of an object of phone class
 * there's a JButton(which in the controller is registered for listening to actions,such as clicking)
 * getters for the JTextfields are also presnt,so that view can retrieve whatever data the user has written into the txtField and pass that on to the controller

 */

public class AddPanelPhone extends JPanel implements MouseListener {
    JTextField txt_phone_model;
    JTextField txt_phone_company;
    JTextField txt_sim;
    JTextField txt_microprocessor;
    JTextField txt_internet;


    JButton AddPhone_button;

    public AddPanelPhone()
    {
        txt_phone_model = new JTextField();
        txt_phone_company = new JTextField();
        txt_sim = new JTextField();
        txt_microprocessor = new JTextField();
        txt_internet = new JTextField();

        AddPhone_button = new JButton("Add phone");
        AddPhone_button.setBackground(Color.BLACK);
        AddPhone_button.setForeground(Color.WHITE);
        AddPhone_button.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        AddPhone_button.addMouseListener(this);

        txt_phone_model.setText("phone_model");
        txt_phone_model.setHorizontalAlignment(JLabel.CENTER);


        txt_phone_company.setText("phone_company");
        txt_phone_company.setHorizontalAlignment(JLabel.CENTER);

        txt_sim.setText("sim");
        txt_sim.setHorizontalAlignment(JLabel.CENTER);

        txt_microprocessor.setText("microprocessor");
        txt_microprocessor.setHorizontalAlignment(JLabel.CENTER);

        txt_internet.setText("internet");
        txt_internet.setHorizontalAlignment(JLabel.CENTER);


        setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));

        add(txt_phone_model);
        add(txt_phone_company);
        add(txt_sim);
        add(txt_microprocessor);
        add(txt_internet);

        add(AddPhone_button);
    }

    public JTextField getTxt_phone_model() {
        return txt_phone_model;
    }

    public JTextField getTxt_phone_company() {
        return txt_phone_company;
    }

    public JTextField getTxt_sim() {
        return txt_sim;
    }

    public JTextField getTxt_microprocessor() {
        return txt_microprocessor;
    }

    public JTextField getTxt_internet() {
        return txt_internet;
    }

    public JButton getAddPhone_button() {
        return AddPhone_button;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==AddPhone_button){
            AddPhone_button.setBackground(Color.RED);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==AddPhone_button){
            AddPhone_button.setBackground(Color.BLACK);
        }
    }
}
