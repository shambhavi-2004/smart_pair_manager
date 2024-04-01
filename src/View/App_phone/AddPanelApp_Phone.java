package View.App_phone;

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
 * Filename: AddPanelApp_Phone.java
 * @author:  shambhavi patil
 * Overview: This is the AddPanelApp_Phone  class it extends Jpanel .
 * it is responsible for giving the GUI feel to the add App_Phone function .
 * it has multiple Jtext fields and a Jbutton
 * the jtext fields have been initially set to store text (that are attributes of app class)
 * this will make it easy for the user to understand what kind of text to pass in the textfield,while creation of an object of App_Phone class
 * there's a JButton(which in the controller is registered for listening to actions,such as clicking)
 * getters for the JTextfields are also presnt,so that view can retrieve whatever data the user has written into the txtField and pass that on to the controller

 */

public class AddPanelApp_Phone extends JPanel implements MouseListener {
    JTextField txt_app_name;
    JTextField txt_app_operating_system;
    JTextField txt_app_voicesearch;
    JTextField txt_app_battery_usage;
    JTextField txt_app_security;
    JTextField txt_imei;
    JTextField txt_price;
    JTextField txt_phone_model;
    JTextField txt_phone_company;
    JTextField txt_sim;
    JTextField txt_microprocessor;
    JTextField txt_internet;

    JButton AddApp_phone_button;

    public AddPanelApp_Phone()
    {
        txt_app_name = new JTextField();
        txt_app_operating_system = new JTextField();
        txt_app_voicesearch = new JTextField();
        txt_app_battery_usage = new JTextField();
        txt_app_security = new JTextField();
        txt_imei = new JTextField();
        txt_price = new JTextField();
        txt_phone_model = new JTextField();
        txt_phone_company = new JTextField();
        txt_sim = new JTextField();
        txt_microprocessor = new JTextField();
        txt_internet = new JTextField();


        AddApp_phone_button = new JButton("Add app phone");
        getAddApp_phone_button().setBackground(Color.BLACK);
        getAddApp_phone_button().setForeground(Color.WHITE);
        getAddApp_phone_button().setAlignmentX(JLabel.CENTER_ALIGNMENT);
        getAddApp_phone_button().addMouseListener(this);

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

        txt_imei.setText("imei");
        txt_imei.setHorizontalAlignment(JLabel.CENTER);

        txt_price.setText("price");
        txt_price.setHorizontalAlignment(JLabel.CENTER);

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





        add(txt_app_name);
        add(txt_app_operating_system);
        add(txt_app_voicesearch);
        add(txt_app_battery_usage);
        add(txt_app_security);
        add(txt_imei);
        add(txt_price);
        add(txt_phone_model);
        add(txt_phone_company);
        add(txt_sim);
        add(txt_microprocessor);
        add(txt_internet);


        add(AddApp_phone_button);
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

    public JTextField getTxt_imei() {
        return txt_imei;
    }

    public JTextField getTxt_price() {
        return txt_price;
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

    public JButton getAddApp_phone_button() {
        return AddApp_phone_button;
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
        if (e.getSource()==AddApp_phone_button){
            AddApp_phone_button.setBackground(Color.blue);
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==AddApp_phone_button){
            AddApp_phone_button.setBackground(Color.BLACK);
        }
    }
}
