package View;

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
 * Filename: FirstFrame.java
 * @author:  shambhavi patil
 * Overview: This is the FirstFrame  class it extends JFrame .
 * it is the first frame that is dispalyed when the programme is run
 * it contains a panel(firstpanel) which contains 3 buttons
 * certain functionalities of the default JButton are changed
 * in the controller they all buttons are called via getters and are registered to a actionlistener so when user clicks this button ,this event is then passed on to view which now displays the ManageFRame
 * Jbuttons are made more unique than the default JButton
 * now this class implents MouseListener,and all the buttons are registered to it,so now when the cursor enters or exits any of the buttons the background color of the buttons are changed accordingly
 *

 */

public class FirstFrame extends JFrame implements MouseListener {

    JButton manageAppBtn;
    JButton managePhoneBtn;
    JButton manageAppPhoneBtn;
    JPanel firstPanel;

    ImageIcon img1=new ImageIcon("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\View\\app (1).png");
    ImageIcon img2=new ImageIcon("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\View\\phone (1).png");
    ImageIcon img3=new ImageIcon("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\View\\app_phone (1).png");



    FirstFrame()
    {
        super("Main DashBoard");
        manageAppBtn = new JButton("Manage app");
        manageAppBtn.setBorder(BorderFactory.createRaisedBevelBorder());
        manageAppBtn.setIcon(img1);
        manageAppBtn.setFocusable(false);
        manageAppBtn.setIconTextGap(5);
        manageAppBtn.setBackground(new Color(114, 234, 245));
        manageAppBtn.setFont(new Font("MV Boli",Font.BOLD,15));

        managePhoneBtn = new JButton("Manage phone");
        managePhoneBtn.setBorder(BorderFactory.createRaisedBevelBorder());
        managePhoneBtn.setIcon(img2);
        managePhoneBtn.setFocusable(false);
        managePhoneBtn.setIconTextGap(5);
        managePhoneBtn.setBackground(new Color(114, 234, 245));
        managePhoneBtn.setFont(new Font("MV Boli",Font.BOLD,15));

        manageAppPhoneBtn = new JButton("Manage app_phone");
        manageAppPhoneBtn.setBorder(BorderFactory.createRaisedBevelBorder());
        manageAppPhoneBtn.setIcon(img3);
        manageAppPhoneBtn.setFocusable(false);
        manageAppPhoneBtn.setIconTextGap(5);
        manageAppPhoneBtn.setBackground(new Color(114, 234, 245));
        manageAppPhoneBtn.setFont(new Font("MV Boli",Font.BOLD,15));

        managePhoneBtn.addMouseListener(this);
        manageAppBtn.addMouseListener(this);
        manageAppPhoneBtn.addMouseListener(this);


        firstPanel = new JPanel();
        firstPanel.setLayout(new GridLayout(3,1,0,0));
        firstPanel.add(manageAppBtn);
        firstPanel.add(managePhoneBtn);
        firstPanel.add(manageAppPhoneBtn);
        firstPanel.setOpaque(true);

        add(firstPanel);
        setTitle("pcc project");


        pack();
        setSize(1000, 1000);
        setVisible(true);
    }

    public JButton getManageAppBtn() {
        return manageAppBtn;
    }


    public JButton getManagePhoneBtn() {
        return managePhoneBtn;
    }


    public JButton getManageAppPhoneBtn() {
        return manageAppPhoneBtn;
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
        if (e.getSource()==manageAppBtn){
            manageAppBtn.setBackground(new Color(88, 135, 178));
        }
        if (e.getSource()==managePhoneBtn){
            managePhoneBtn.setBackground(new Color(88, 135, 178));
        }
        if (e.getSource()==manageAppPhoneBtn){
            manageAppPhoneBtn.setBackground(new Color(88, 135, 178));
        }



    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==manageAppBtn){
            manageAppBtn.setBackground(new Color(114, 234, 245));
        }
        if (e.getSource()==managePhoneBtn){
            managePhoneBtn.setBackground(new Color(114, 234, 245));
        }
        if (e.getSource()==manageAppPhoneBtn){
            manageAppPhoneBtn.setBackground(new Color(114, 234, 245));
        }


    }
}
