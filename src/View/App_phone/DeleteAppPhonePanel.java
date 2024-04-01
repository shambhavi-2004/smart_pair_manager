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
 * Filename: DeleteAppPhonePanel.java
 * @author:  shambhavi patil
 * Overview: This is the DeleteAppPhonePanel  class it extends Jpanel .
 * it is responsible for giving the GUI feel to the delete AppPhone function .
 * it has Jtext field and a JButton.
 * the jtext fields have been initially set to store text (txt_AppPhone_id)
 * here the idx of the AppPhone which we want to delete is passed
 * there's a JButton(which in the controller is registered for listening to actions,such as clicking)
 * after the user updates jtxtField with an idx,the JButton is clicked by him and in the controller via cntrl the update is made in model
 */
public class DeleteAppPhonePanel extends JPanel implements MouseListener {
    JTextField txt_del_app_phone_id;
    JButton deleteAppPhoneBtn;

    public DeleteAppPhonePanel()
    {

        txt_del_app_phone_id = new JTextField();
        deleteAppPhoneBtn = new JButton("Delete app phone");
        deleteAppPhoneBtn.addMouseListener(this);
        deleteAppPhoneBtn.setBackground(Color.BLACK);
        deleteAppPhoneBtn.setForeground(Color.WHITE);

        txt_del_app_phone_id.setText("txt_app_phone_id");
        txt_del_app_phone_id.setSize(200,50);




        add(txt_del_app_phone_id);
        add(deleteAppPhoneBtn);



    }

    public JTextField getTxt_del_app_phone_id() {
        return txt_del_app_phone_id;
    }

    public void setTxt_del_app_phone_id(JTextField txt_del_app_phone_id) {
        this.txt_del_app_phone_id = txt_del_app_phone_id;
    }

    public JButton getDeleteAppPhoneBtn() {
        return deleteAppPhoneBtn;
    }

    public void setDeleteAppPhoneBtn(JButton deleteAppPhoneBtn) {
        this.deleteAppPhoneBtn = deleteAppPhoneBtn;
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
        if (e.getSource()==deleteAppPhoneBtn){
            deleteAppPhoneBtn.setBackground(Color.blue);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==deleteAppPhoneBtn){
            deleteAppPhoneBtn.setBackground(Color.black);
        }
    }
}
