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
 * Filename: EditAppPhonePanel.java
 * @author:  shambhavi patil
 * Overview: This is the EditAppPhonePanel class it extends Jpanel .
 * it is responsible for giving the GUI feel to the edit AppPhone function .
 * it has multiple Jtext fields and a JButton.
 * getters for jtextfields and jbuttons
 * the jtext fields have been initially set to store text (that are attributes of AppPhone class)
 * this will make it easy for the user to understand what kind of text to pass in the textfield ,while editing attributes of an object of AppPhone class
 * there's 2 JButton(which in the controller is registered for listening to actions,such as clicking)
 * editAppPhoneBtn
 * getAppPhoneBtn
 * first the user enters the index, he wants to update this is obtained bt the cntrlr via getter for txt_get_AppPhone_idx defined here and then controller obtains this.
 * and accordingly in controller he obtains data from model and then controller sets the data accordingly in the Jtextfields
 * and then user makes changes in the jtextfields and then via getEditAppPhoneBtn in the controller the new changes are sent back to model by controller who changes accordingly
 *
 */

public class EditAppPhonePanel extends JPanel implements MouseListener {
    JTextField txt_get_appPhone_idx;
    JButton getAppPhoneBtn;


    JTextField txt_app_name;
    JTextField txt_app_operating_system;
    JTextField txt_app_voicesearch;
    JTextField txt_app_battery_usage;
    JTextField txt_app_security;
    JTextField txt_phone_model;
    JTextField txt_phone_company;
    JTextField txt_sim;
    JTextField txt_microprocessor;
    JTextField txt_internet;


    JButton editAppPhoneBtn;

    public EditAppPhonePanel()
    {

        txt_app_name = new JTextField();
        txt_app_operating_system = new JTextField();
        txt_app_voicesearch = new JTextField();
        txt_app_battery_usage = new JTextField();
        txt_app_security = new JTextField();
        txt_phone_model = new JTextField();
        txt_phone_company = new JTextField();
        txt_sim = new JTextField();
        txt_microprocessor = new JTextField();
        txt_internet = new JTextField();

        editAppPhoneBtn = new JButton("Edit AppPhone");
        editAppPhoneBtn.setBackground(Color.BLACK);
        editAppPhoneBtn.setForeground(Color.WHITE);
        editAppPhoneBtn.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        editAppPhoneBtn.addMouseListener(this);

        txt_get_appPhone_idx = new JTextField();

        getAppPhoneBtn = new JButton("Get app phone to Edit");
        getAppPhoneBtn.setBackground(Color.BLACK);
        getAppPhoneBtn.setForeground(Color.WHITE);
        getAppPhoneBtn.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        getAppPhoneBtn.addMouseListener(this);


        txt_app_name.setText("txt_app_name");
        txt_app_name.setHorizontalAlignment(JLabel.CENTER);
        txt_app_operating_system.setText("txt_app_operating_system");
        txt_app_operating_system.setHorizontalAlignment(JLabel.CENTER);
        txt_app_voicesearch.setText("txt_app_voicesearch");
        txt_app_voicesearch.setHorizontalAlignment(JLabel.CENTER);
        txt_app_battery_usage.setText("txt_app_battery_usage");
        txt_app_battery_usage.setHorizontalAlignment(JLabel.CENTER);
        txt_app_security.setText("txt_app_security");
        txt_app_security.setHorizontalAlignment(JLabel.CENTER);
        txt_phone_model.setText("txt_phone_model");
        txt_phone_model.setHorizontalAlignment(JLabel.CENTER);
        txt_phone_company.setText("txt_phone_company");
        txt_phone_company.setHorizontalAlignment(JLabel.CENTER);
        txt_sim.setText("txt_sim");
        txt_sim.setHorizontalAlignment(JLabel.CENTER);
        txt_microprocessor.setText("txt_microprocessor");
        txt_microprocessor.setHorizontalAlignment(JLabel.CENTER);
        txt_internet.setText("txt_internet");
        txt_internet.setHorizontalAlignment(JLabel.CENTER);


        txt_get_appPhone_idx.setText("get app phone id");
        txt_get_appPhone_idx.setHorizontalAlignment(JLabel.CENTER);

        setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));

        add(txt_get_appPhone_idx);
        add(getAppPhoneBtn);




        add(txt_app_name);
        add(txt_app_operating_system);
        add(txt_app_voicesearch);
        add(txt_app_battery_usage);
        add(txt_app_security);
        add(txt_phone_model);
        add(txt_phone_company);
        add(txt_sim);
        add(txt_microprocessor);
        add(txt_internet);

        add(editAppPhoneBtn);
    }

    public JTextField getTxt_get_appPhone_idx() {
        return txt_get_appPhone_idx;
    }

    public void setTxt_get_appPhone_idx(JTextField txt_get_appPhone_idx) {
        this.txt_get_appPhone_idx = txt_get_appPhone_idx;
    }

    public JButton getGetAppPhoneBtn() {
        return getAppPhoneBtn;
    }

    public void setGetAppPhoneBtn(JButton getAppPhoneBtn) {
        this.getAppPhoneBtn = getAppPhoneBtn;
    }

    public JTextField getTxt_app_name() {
        return txt_app_name;
    }

    public void setTxt_app_name(JTextField txt_app_name) {
        this.txt_app_name = txt_app_name;
    }

    public JTextField getTxt_app_operating_system() {
        return txt_app_operating_system;
    }

    public void setTxt_app_operating_system(JTextField txt_app_operating_system) {
        this.txt_app_operating_system = txt_app_operating_system;
    }

    public JTextField getTxt_app_voicesearch() {
        return txt_app_voicesearch;
    }

    public void setTxt_app_voicesearch(JTextField txt_app_voicesearch) {
        this.txt_app_voicesearch = txt_app_voicesearch;
    }

    public JTextField getTxt_app_battery_usage() {
        return txt_app_battery_usage;
    }

    public void setTxt_app_battery_usage(JTextField txt_app_battery_usage) {
        this.txt_app_battery_usage = txt_app_battery_usage;
    }

    public JTextField getTxt_app_security() {
        return txt_app_security;
    }

    public void setTxt_app_security(JTextField txt_app_security) {
        this.txt_app_security = txt_app_security;
    }

    public JTextField getTxt_phone_model() {
        return txt_phone_model;
    }

    public void setTxt_phone_model(JTextField txt_phone_model) {
        this.txt_phone_model = txt_phone_model;
    }

    public JTextField getTxt_phone_company() {
        return txt_phone_company;
    }

    public void setTxt_phone_company(JTextField txt_phone_company) {
        this.txt_phone_company = txt_phone_company;
    }

    public JTextField getTxt_sim() {
        return txt_sim;
    }

    public void setTxt_sim(JTextField txt_sim) {
        this.txt_sim = txt_sim;
    }

    public JTextField getTxt_microprocessor() {
        return txt_microprocessor;
    }

    public void setTxt_microprocessor(JTextField txt_microprocessor) {
        this.txt_microprocessor = txt_microprocessor;
    }

    public JTextField getTxt_internet() {
        return txt_internet;
    }

    public void setTxt_internet(JTextField txt_internet) {
        this.txt_internet = txt_internet;
    }

    public JButton getEditAppPhoneBtn() {
        return editAppPhoneBtn;
    }

    public void setEditAppPhoneBtn(JButton editAppPhoneBtn) {
        this.editAppPhoneBtn = editAppPhoneBtn;
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
        if (e.getSource()==getAppPhoneBtn){
            getAppPhoneBtn.setBackground(Color.blue);
        }
        if (e.getSource()==editAppPhoneBtn){
            editAppPhoneBtn.setBackground(Color.blue);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==getAppPhoneBtn){
            getAppPhoneBtn.setBackground(Color.black);
        }
        if (e.getSource()==editAppPhoneBtn){
            editAppPhoneBtn.setBackground(Color.black);
        }
    }
}
