package Model;

import Model.apps.manageApp;
import Model.phones.managePhone;
import Model.real_phone.Manage_Real_Phone;

/**
 * Identification comments:
 *   Name: shambhavi patil
 *   Experiment No: 05
 *   Experiment Title: Model
 *   Experiment Date: 12-02-2024
 *   @version 1.0
 *
 *
 * Beginning comments:
 * Filename: Model.java
 * @author:  shambhavi patil
 * Overview: This is the Model class used to store data and logic required to run the application
its attribute mab is responsible for managing the data i.e it reads data from json,and writes into json and also it provides data to controller which then gives it to display
basically it decides what can be displayed in the GUI
 */


public class Model {
    manageApp ma;
    managePhone mp;
    Manage_Real_Phone mrp;


    public Model() {
        ma = new manageApp();
        mp = new managePhone();
        mrp =new Manage_Real_Phone();
    }

    public manageApp getMa() {
        return ma;
    }

    public void setMa(manageApp ma) {
        this.ma = ma;
    }

    public managePhone getMp() {
        return mp;
    }

    public void setMp(managePhone mp) {
        this.mp = mp;
    }

    public Manage_Real_Phone getMrp() {
        return mrp;
    }

    public void setMrp(Manage_Real_Phone mrp) {
        this.mrp = mrp;
    }
}
