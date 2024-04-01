package View.App_phone;


import javax.swing.*;
import java.awt.*;

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
 * Filename: ManageApp_PhoneFrame.java
 * @author:  shambhavi patil
 * Overview: This is the ManageApp_PhoneFrame  class it extends JFrame .
 * as frame is the main part in gui
 * it is responsible for the InitialPanelApp_Phone(responsible for all other sub panels)in java being a frame
 * contains getter for attribute which is main panel:InitialPanelApp

 */


public class ManageApp_PhoneFrame extends JFrame {
    InitialPanelApp_Phone app_phone_ip;



    public ManageApp_PhoneFrame()
    {
        super("Manage App Phone DashBoard");
        app_phone_ip = new InitialPanelApp_Phone();
        add(app_phone_ip);

        setBackground(Color.ORANGE);


        pack();
        setSize(1000, 1000);
    }

    public InitialPanelApp_Phone getApp_phone_ip() {
        return app_phone_ip;
    }

    public void setApp_phone_ip(InitialPanelApp_Phone app_phone_ip) {
        this.app_phone_ip = app_phone_ip;
    }
}
