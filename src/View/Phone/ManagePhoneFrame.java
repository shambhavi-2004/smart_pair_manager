package View.Phone;


import javax.swing.*;
import java.awt.*;

public class ManagePhoneFrame extends JFrame {
    InitialPanelPhone phone_ip;


    public ManagePhoneFrame()
    {
        super("Manage Phone DashBoard");
        phone_ip = new InitialPanelPhone();
        add(phone_ip);


        pack();
        setSize(1000, 1000);
    }

    public InitialPanelPhone getPhone_ip() {
        return phone_ip;
    }

    public void setPhone_ip(InitialPanelPhone phone_ip) {
        this.phone_ip = phone_ip;
    }
}
