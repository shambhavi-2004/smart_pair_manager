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
 * Filename: DeleteAppPanel.java
 * @author:  shambhavi patil
 * Overview: This is the DeleteAppPanel  class it extends Jpanel .
 * it is responsible for giving the GUI feel to the delete app function .
 * it has Jtext field and a JButton.
 * the jtext fields have been initially set to store text (txt_app_id)
 * here the idx of the app which we want to delete is passed
 * there's a JButton(which in the controller is registered for listening to actions,such as clicking)
 * after the user updates txtField with an idx,the JButton is clicked by him and in the controller via cntrl the update is made in model
 */

public class DeleteAppPanel extends JPanel  implements MouseListener {
    JTextField txt_del_app_id;
    JButton deleteAppBtn;

    public DeleteAppPanel()
    {

        txt_del_app_id = new JTextField();
        deleteAppBtn = new JButton("Delete app");
        deleteAppBtn.setBackground(Color.BLACK);
        deleteAppBtn.setForeground(Color.WHITE);
        deleteAppBtn.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        deleteAppBtn.addMouseListener(this);

        txt_del_app_id.setText("txt_app_id");
        txt_del_app_id.setSize(200,50);



        add(txt_del_app_id);
        add(deleteAppBtn);
    }

    public JTextField getTxt_del_app_id() {
        return txt_del_app_id;
    }

    public JButton getDeleteAppBtn() {
        return deleteAppBtn;
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
        if (e.getSource()==deleteAppBtn){
            deleteAppBtn.setBackground(Color.MAGENTA);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==deleteAppBtn){
            deleteAppBtn.setBackground(Color.BLACK);
        }
    }
}
