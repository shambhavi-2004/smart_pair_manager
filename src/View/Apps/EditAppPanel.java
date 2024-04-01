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
 * Filename: EditAppPanel.java
 * @author:  shambhavi patil
 * Overview: This is the EditAppPanel class it extends Jpanel .
 * it is responsible for giving the GUI feel to the edit app function .
 * it has multiple Jtext fields and a JButton.
 * getters for jtextfields and jbuttons
 * the jtext fields have been initially set to store text (that are attributes of app class)
 * this will make it easy for the user to understand what kind of text to pass in the textfield ,while editing attributes of an object of app class
 * there's 2 JButton(which in the controller is registered for listening to actions,such as clicking)
 * editAppBtn
 * getAppBtn
 * first the user enters the index, he wants to update this is obtained via getter for txt_get_app_idx defined here and then controller obtains this.
 * and accordingly in controller he obtains data from model and sets it into the textfields defined here and then controller sets the data accordingly in the Jtextfields
 * and then user makes changes in the jtextfields and then via getEditAppBtn in the controller the new changes are sent back to model by controller who changes accordingly
 *
 */

public class EditAppPanel extends JPanel implements MouseListener {
    JTextField txt_get_app_idx;
    JButton getAppBtn;
    JTextField txt_app_name;
    JTextField txt_app_operating_system;
    JTextField txt_app_voicesearch;
    JTextField txt_app_battery_usage;
    JTextField txt_app_security;
    JButton editAppBtn;

    public EditAppPanel()
    {

        txt_app_name = new JTextField();
        txt_app_operating_system = new JTextField();
        txt_app_voicesearch = new JTextField();
        txt_app_battery_usage = new JTextField();
        txt_app_security = new JTextField();

        editAppBtn = new JButton("Edit App");
        editAppBtn.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        editAppBtn.setBackground(Color.BLACK);
        editAppBtn.setForeground(Color.WHITE);
        editAppBtn.addMouseListener(this);

        txt_get_app_idx = new JTextField();

        getAppBtn = new JButton("Get app to Edit");
        getAppBtn.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        getAppBtn.setBackground(Color.BLACK);
        getAppBtn.setForeground(Color.WHITE);
        getAppBtn.addMouseListener(this);

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



        txt_get_app_idx.setText("get app id");
        txt_get_app_idx.setHorizontalAlignment(JLabel.CENTER);


        setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));

        add(txt_get_app_idx);
        add(getAppBtn);

        add(txt_app_name);
        add(txt_app_operating_system);
        add(txt_app_voicesearch);
        add(txt_app_battery_usage);
        add(txt_app_security);

        add(editAppBtn);
    }

    public JTextField getTxt_get_app_idx() {
        return txt_get_app_idx;
    }

    public void setTxt_get_app_idx(JTextField txt_get_app_idx) {
        this.txt_get_app_idx = txt_get_app_idx;
    }

    public JButton getGetAppBtn() {
        return getAppBtn;
    }

    public void setGetAppBtn(JButton getAppBtn) {
        this.getAppBtn = getAppBtn;
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

    public JButton getEditAppBtn() {
        return editAppBtn;
    }

    public void setEditAppBtn(JButton editAppBtn) {
        this.editAppBtn = editAppBtn;
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
        if (e.getSource()==editAppBtn){
            editAppBtn.setBackground(Color.MAGENTA);
        }
        if (e.getSource()==getAppBtn){
            getAppBtn.setBackground(Color.MAGENTA);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==editAppBtn){
            editAppBtn.setBackground(Color.black);
        }
        if (e.getSource()==getAppBtn){
            getAppBtn.setBackground(Color.black);
        }
    }
}
