package View.Apps;

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
 * Filename: InitialPanelApp.java
 * @author:  shambhavi patil
 * Overview: This is the InitialPanelApp  class it extends Jpanel .
 * it is responsible for handling all the panels,like center ,add,edit and delete
 * contains getters for all attributes which are sub-panels
 * when constructor is called a InitialPanelApp panel is created which is a panel responsible for holding all other sub panels in it
 * basically the controller will always need to call the getters defined here for it for being able to faciliate in the CRUD processes

 */


public class InitialPanelApp extends JPanel {
    private CenterPanelApp cpa;
    private AddPanelApp apa;
    private EditAppPanel eap;
    private DeleteAppPanel dap;



    public InitialPanelApp() {
        super();
        cpa = new CenterPanelApp();
        add(cpa);
        apa = new AddPanelApp();
        add(apa);
        eap=new EditAppPanel();
        add(eap);
        dap=new DeleteAppPanel();
        add(dap);

        setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));

    }

    public CenterPanelApp getCpa() {
        return cpa;
    }


    public AddPanelApp getApa() {
        return apa;
    }

    public EditAppPanel getEap() {
        return eap;
    }


    public DeleteAppPanel getDap() {
        return dap;
    }


}
