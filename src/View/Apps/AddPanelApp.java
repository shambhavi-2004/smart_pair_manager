package View.Apps;

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
 * Filename: AddPanelApp.java
 * @author:  shambhavi patil
 * Overview: This is the AddPanelApp  class it extends Jpanel .
 * it is responsible for giving the GUI feel to the add app function .
 * it has multiple Jtext fields and a Jbutton
 * the jtext fields have been initially set to store text (that are attributes of app class)
 * this will make it easy for the user to understand what kind of text to pass in the textfield,while creation of an object of app class
 * there's a JButton(which in the controller is registered for listening to actions,such as clicking)
 * getters for the JTextfields are also presnt,so that view can retrieve whatever data the user has written into the txtField and pass that on to the controller

 */

public class AddPanelApp extends JPanel implements MouseListener {
    JTextField txt_app_name;
    JTextField txt_app_operating_system;
    JTextField txt_app_voicesearch;
    JTextField txt_app_battery_usage;
    JTextField txt_app_security;

    JButton AddApp_button;

    public AddPanelApp()
    {
        txt_app_name = new JTextField();
        txt_app_operating_system = new JTextField();
        txt_app_voicesearch = new JTextField();
        txt_app_battery_usage = new JTextField();
        txt_app_security = new JTextField();

        AddApp_button = new JButton("Add app");
        AddApp_button.setBackground(Color.BLACK);
        AddApp_button.setForeground(Color.WHITE);
        AddApp_button.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        AddApp_button.addMouseListener(this);

        txt_app_name.setText("app_name");
        txt_app_name.setHorizontalAlignment(JLabel.CENTER);

        txt_app_operating_system.setText("app_operating_system");
        txt_app_operating_system.setHorizontalAlignment(JLabel.CENTER);

        txt_app_voicesearch.setText("app_voicesearch");
        txt_app_voicesearch.setHorizontalAlignment(JLabel.CENTER);

        txt_app_battery_usage.setText("app_battery_usage");
        txt_app_battery_usage.setHorizontalAlignment(JLabel.CENTER);

        txt_app_security.setText("app_security");
        txt_app_security.setHorizontalAlignment(JLabel.CENTER);


        setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));


        add(txt_app_name);
        add(txt_app_operating_system);
        add(txt_app_voicesearch);
        add(txt_app_battery_usage);
        add(txt_app_security);
        add(AddApp_button);



    }

    public JTextField getTxt_app_name() {
        return txt_app_name;
    }

    public JTextField getTxt_app_operating_system() {
        return txt_app_operating_system;
    }

    public JTextField getTxt_app_voicesearch() {
        return txt_app_voicesearch;
    }

    public JTextField getTxt_app_battery_usage() {
        return txt_app_battery_usage;
    }

    public JTextField getTxt_app_security() {
        return txt_app_security;
    }

    public JButton getAddApp_button() {
        return AddApp_button;
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
        if (e.getSource()==AddApp_button){
            AddApp_button.setBackground(Color.MAGENTA);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==AddApp_button){
            AddApp_button.setBackground(Color.BLACK);
        }

    }
}
