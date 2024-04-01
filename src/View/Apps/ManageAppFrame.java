package View.Apps;

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
 * Filename: ManageAppFrame.java
 * @author:  shambhavi patil
 * Overview: This is the ManageAppFrame  class it extends JFrame .
 * as frame is the main part in gui
 * it is responsible for the InitialPanelApp(responsible for all other sub panels)in java being a frame
 * contains getter for attribute which is main panel:InitialPanelApp

 */


public class ManageAppFrame extends JFrame {
    InitialPanelApp app_ip;

    public ManageAppFrame()
    {
        super("Manage App DashBoard");

        app_ip = new InitialPanelApp();
        add(app_ip);




        pack();
        setSize(500, 500);
    }


    public InitialPanelApp getApp_ip() {
        return app_ip;
    }
}
