package View.App_phone;


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
 * Filename: InitialPanelApp_Phone.java
 * @author:  shambhavi patil
 * Overview: This is the InitialPanelApp_Phone  class it extends Jpanel .
 * it is responsible for handling all the panels,like center ,add,edit and delete
 * contains getters for all attributes which are sub-panels
 * when constructor is called a InitialPanelApp_Phone panel is created which is a panel responsible for holding all other sub panels in it
 * basically the controller will always need to call the getters defined here for it for being able to faciliate in the CRUD processes

 */

public class InitialPanelApp_Phone extends JPanel {
    private CenterPanelApp_Phone cpap;
    private AddPanelApp_Phone apap;
    private EditAppPhonePanel eapp;
    private DeleteAppPhonePanel dapp;


    public InitialPanelApp_Phone() {
        super();
        cpap = new CenterPanelApp_Phone();
        add(cpap);
        apap = new AddPanelApp_Phone();
        add(apap);
        eapp=new EditAppPhonePanel();
        add(eapp);
        dapp=new DeleteAppPhonePanel();
        add(dapp);
        setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));


    }

    public CenterPanelApp_Phone getCpap() {
        return cpap;
    }

    public void setCpap(CenterPanelApp_Phone cpap) {
        this.cpap = cpap;
    }

    public AddPanelApp_Phone getApap() {
        return apap;
    }

    public void setApap(AddPanelApp_Phone apap) {
        this.apap = apap;
    }

    public EditAppPhonePanel getEapp() {
        return eapp;
    }

    public void setEapp(EditAppPhonePanel eapp) {
        this.eapp = eapp;
    }

    public DeleteAppPhonePanel getDapp() {
        return dapp;
    }

    public void setDapp(DeleteAppPhonePanel dapp) {
        this.dapp = dapp;
    }
}
