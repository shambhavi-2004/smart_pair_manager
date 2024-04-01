package View;

import Model.real_phone.Manage_Real_Phone;
import View.App_phone.ManageApp_PhoneFrame;
import View.Apps.ManageAppFrame;
import View.Phone.ManagePhoneFrame;

import java.awt.*;
import java.util.ArrayList;


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
 * Filename: view.java
 * @author:  shambhavi patil
 * Overview: This is the view  class  .
 * it manages the view part of MVC arch
 * it manages all the parts of the view hence it is responsible for how it  is being dispalyed
 * controller uses this to give data to model from the components of view or vice versa
 * when the constructor is called all the frames are instantiated,but onlt FF appears as it is the only one that is initially visible
 * centerInitialSetup-this is responsible for seeting up the panel(centrepanel)which holds the button(in grid lyt)
 * centerupdate-it is responsible for setting up text in the buttons,this is used by the controller which fetched data from the model and then sets it up in view accordingly(button_txt is responsible for storing the data which is given to it via model)

 */


public class view {
    FirstFrame ff;
    ManageAppFrame maf;
    ManagePhoneFrame mpf;
    ManageApp_PhoneFrame mapf;


    public view()
    {
        ff = new FirstFrame();
        maf = new ManageAppFrame();
        mpf = new ManagePhoneFrame();
        mapf=new ManageApp_PhoneFrame();
    }

    public void centerInitialSetupApp(int linesBeingDisplayed, int size) {
        maf.getApp_ip().getCpa().setLayout(new GridLayout(linesBeingDisplayed+1,size));
        maf.getApp_ip().getCpa().createButtons((linesBeingDisplayed+1) * size);
    }

    public void centerInitialSetupPhone(int linesBeingDisplayed, int size) {
        mpf.getPhone_ip().getCpp().setLayout(new GridLayout(linesBeingDisplayed+1,size));
        mpf.getPhone_ip().getCpp().createButtons((linesBeingDisplayed+1) * size);
    }



    public void centerInitialSetupAppPhone(int linesBeingDisplayed, int size) {
        mapf.getApp_phone_ip().getCpap().setLayout(new GridLayout(linesBeingDisplayed+1,size));
        mapf.getApp_phone_ip().getCpap().createButtons((linesBeingDisplayed+1) * size);
    }

    public void centerUpdateApp(ArrayList<ArrayList<String>> lines, ArrayList<String> headers) {
        for (int i = 0; i < headers.size(); i++)
        {
            maf.getApp_ip().getCpa().getAllButtons().get(i).setText(headers.get(i));
        }

        for (int app_row_no = 0; app_row_no < lines.size(); app_row_no++)
        {
            for (int app_col_no = 0; app_col_no < headers.size(); app_col_no++)
            {
                int button_no = app_row_no * headers.size() + headers.size() + app_col_no;
                String button_txt = lines.get(app_row_no).get(app_col_no);

                maf.getApp_ip().getCpa().getAllButtons().get(button_no).setText(button_txt);
            }
        }
    }

    public void centerUpdatePhone(ArrayList<ArrayList<String>> lines, ArrayList<String> headers) {
        for (int i = 0; i < headers.size(); i++)
        {
            mpf.getPhone_ip().getCpp().getAllButtons().get(i).setText(headers.get(i));
        }

        for (int phone_row_no = 0; phone_row_no < lines.size(); phone_row_no++)
        {
            for (int phone_col_no = 0; phone_col_no < headers.size(); phone_col_no++)
            {
                int button_no = phone_row_no * headers.size() + headers.size() + phone_col_no;
                String button_txt = lines.get(phone_row_no).get(phone_col_no);

                mpf.getPhone_ip().getCpp().getAllButtons().get(button_no).setText(button_txt);
            }
        }
    }

    public void centerUpdateAppPhone(ArrayList<ArrayList<String>> lines, ArrayList<String> headers) {

        for (int i = 0; i < headers.size(); i++)
        {
            mapf.getApp_phone_ip().getCpap().getAllButtons().get(i).setText(headers.get(i));
        }
        Manage_Real_Phone mrp=new Manage_Real_Phone();
        mrp.readRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json");

        for (int app_phone_row_no = 0; app_phone_row_no < lines.size(); app_phone_row_no++)
        {
            for (int app_phone_col_no = 0; app_phone_col_no < headers.size(); app_phone_col_no++)
            {
                int button_no = app_phone_row_no * headers.size() + headers.size() + app_phone_col_no;
                String button_txt = lines.get(app_phone_row_no).get(app_phone_col_no);

                mapf.getApp_phone_ip().getCpap().getAllButtons().get(button_no).setText(button_txt);
            }
        }

    }


    public void setFf(FirstFrame ff) {
        this.ff = ff;
    }

    public FirstFrame getFf() {
        return ff;
    }

    public ManageAppFrame getMaf() {
        return maf;
    }

    public void setMaf(ManageAppFrame maf) {
        this.maf = maf;
    }

    public ManagePhoneFrame getMpf() {
        return mpf;
    }

    public void setMpf(ManagePhoneFrame mpf) {
        this.mpf = mpf;
    }

    public ManageApp_PhoneFrame getMapf() {
        return mapf;
    }

    public void setMapf(ManageApp_PhoneFrame mapf) {
        this.mapf = mapf;
    }
}
