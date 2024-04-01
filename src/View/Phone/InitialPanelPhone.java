package View.Phone;

import View.Apps.AddPanelApp;
import View.Apps.CenterPanelApp;

import javax.swing.*;
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
 * Filename: InitialPanelPhone.java
 * @author:  shambhavi patil
 * Overview: This is the InitialPanelPhone  class it extends Jpanel .
 * it is responsible for handling all the panels,like center ,add,edit and delete
 * contains getters for all attributes which are sub-panels
 * when constructor is called a InitialPanelPhone panel is created which is a panel responsible for holding all other sub panels in it
 * basically the controller will always need to call the getters defined here for it for being able to faciliate in the CRUD processes

 */

public class InitialPanelPhone extends JPanel {
    private CenterPanelPhone cpp;
    private AddPanelPhone app;
    private EditPhonePanel epp;
    private DeletePhonePanel dpp;

    public InitialPanelPhone() {
        super();
        cpp = new CenterPanelPhone();
        add(cpp);
        app = new AddPanelPhone();
        add(app);
        epp=new EditPhonePanel();
        add(epp);
        dpp=new DeletePhonePanel();
        add(dpp);
        setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
    }

    public CenterPanelPhone getCpp() {
        return cpp;
    }

    public void setCpp(CenterPanelPhone cpp) {
        this.cpp = cpp;
    }

    public AddPanelPhone getApp() {
        return app;
    }

    public void setApp(AddPanelPhone app) {
        this.app = app;
    }
    public EditPhonePanel getEpp() {
        return epp;
    }

    public void setEpp(EditPhonePanel epp) {
        this.epp = epp;
    }

    public DeletePhonePanel getDpp() {
        return dpp;
    }

    public void setDpp(DeletePhonePanel dpp) {
        this.dpp = dpp;
    }


}
