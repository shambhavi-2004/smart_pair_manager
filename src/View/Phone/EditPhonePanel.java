package View.Phone;

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
 * Filename: EditPhonePanel.java
 * @author:  shambhavi patil
 * Overview: This is the EditPhonePanel class it extends Jpanel .
 * it is responsible for giving the GUI feel to the edit Phone function .
 * it has multiple Jtext fields and a JButton.
 * getters for jtextfields and jbuttons
 * the jtext fields have been initially set to store text (that are attributes of Phone class)
 * this will make it easy for the user to understand what kind of text to pass in the textfield ,while editing attributes of an object of Phone class
 * there's 2 JButton(which in the controller is registered for listening to actions,such as clicking)
 * editPhoneBtn
 * getPhoneBtn
 * first the user enters the index, he wants to update this is obtained bt the cntrlr via getter for txt_get_Phone_idx defined here and then controller obtains this.
 * and accordingly in controller he obtains data from model and then controller sets the data accordingly in the Jtextfields
 * and then user makes changes in the jtextfields and then via getEditPhoneBtn in the controller the new changes are sent back to model by controller who changes accordingly
 *
 */


public class EditPhonePanel extends JPanel implements MouseListener {
    JTextField txt_get_phone_idx;
    JButton getPhoneBtn;


    JTextField txt_phone_model;
    JTextField txt_phone_company;
    JTextField txt_sim;
    JTextField txt_microprocessor;
    JTextField txt_internet;


    JButton editPhoneBtn;

    public EditPhonePanel()
    {

        txt_phone_model = new JTextField();
        txt_phone_company = new JTextField();
        txt_sim = new JTextField();
        txt_microprocessor = new JTextField();
        txt_internet = new JTextField();

        editPhoneBtn = new JButton("Edit Phone");
        editPhoneBtn.setBackground(Color.BLACK);
        editPhoneBtn.setForeground(Color.WHITE);
        editPhoneBtn.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        editPhoneBtn.addMouseListener(this);

        txt_get_phone_idx = new JTextField();
        getPhoneBtn = new JButton("Get phone to Edit");
        getPhoneBtn.setBackground(Color.BLACK);
        getPhoneBtn.setForeground(Color.WHITE);
        getPhoneBtn.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        getPhoneBtn.addMouseListener(this);


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



        txt_get_phone_idx.setText("get phone id");
        txt_get_phone_idx.setHorizontalAlignment(JLabel.CENTER);


        add(txt_get_phone_idx);
        add(getPhoneBtn);

        setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));

        add(txt_phone_model);
        add(txt_phone_company);
        add(txt_sim);
        add(txt_microprocessor);
        add(txt_internet);
        add(editPhoneBtn);
    }

    public JTextField getTxt_get_phone_idx() {
        return txt_get_phone_idx;
    }

    public void setTxt_get_phone_idx(JTextField txt_get_phone_idx) {
        this.txt_get_phone_idx = txt_get_phone_idx;
    }

    public JButton getGetPhoneBtn() {
        return getPhoneBtn;
    }

    public void setGetPhoneBtn(JButton getPhoneBtn) {
        this.getPhoneBtn = getPhoneBtn;
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

    public JButton getEditPhoneBtn() {
        return editPhoneBtn;
    }

    public void setEditPhoneBtn(JButton editPhoneBtn) {
        this.editPhoneBtn = editPhoneBtn;
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
        if(e.getSource()==editPhoneBtn){
            editPhoneBtn.setBackground(Color.RED);
        }
        if(e.getSource()==getPhoneBtn){
            getPhoneBtn.setBackground(Color.RED);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==editPhoneBtn){
            editPhoneBtn.setBackground(Color.black);
        }
        if(e.getSource()==getPhoneBtn){
            getPhoneBtn.setBackground(Color.black);
        }
    }
}
