package Controller;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import Model.*;
import  View.*;

/**
 * Identification comments:
 *   Name: shambhavi patil
 *   Experiment No: 06
 *   Experiment Title: manageapps
 *   Experiment Date: 19-03-2024
 *   @version 1.0
 *
 *
 *
 * Beginning comments:
 * Filename: Controller.java
 * @author:  shambhavi patil
 * Overview: This is the Controller class.
 * In the MVC (Model-View-Controller) architecture, the Controller acts like a middleman between the View, which is what the user sees and interacts with, and the Model, which is the part of the application that handles all the data.
 * Contains variables-
 * Model model;
 * view view;
 * contains constructor
 * which performs the following functions-
 * in the first frame
 * an action listener is added to all buttons in FF of MA,MP,MAP
 * addActionListener:and if any button is triggered it displays the respective frame (which is responsible for displaying all the data of that particular class) and makes the initial frame invisible
 * setLinesBeingDisplayed is set to 5
 * centerInitialSetupApp:this sets up the layout of the 3 frames(made for the 3 classes). it has incorporated  grid layout and in each grid a button is present which holds the data from MODEL accordingly
 * addWindowListener:used for when any of the 3 frames (of any of the 3 classes)are closed then again display the initial first frame
 * setFirstLineToDisplay is set to 0
 * centerUpdatePhone:all the buttons in all 3 frames have been set up by the adding data into them accordingly(via setText)
 * getAddApp_button().addActionListener
 * getAddPhone_button().addActionListener
 * getAddApp_phone_button().addActionListener
 * via actionperformed method(any event) is listened to
 * when the (respective add button in any of the 3 frames is triggered) here it is used to add a new object of the respective class i.e (via view) all the information given by the user(in view) are handled by the controller which then passes that info to model which then uses it to create a new object of that respective class hence now the new changes made in the AL of respective manage class is again made to update  the respective json file
 * addMouseWheelListener:it is responsible for how data is being displayed and retrieved according to the scroll of mouse,via analysis it decides what is the first line to display and then model decides the last line to display,and accordingly the data stored in the AL in Manage class is retrieved accordingly by model,and then this data are passed on to view which displays them accordingly
 *
 *
 */

public class Controller {
    Model model;
    view view;

    public Controller(Model m, view v)
    {
        model = m;
        view = v;

        view.getFf().getManageAppBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("app Button Clicked");
                view.getFf().setVisible(false);
                view.getMaf().setVisible(true);
            }
        });

        view.getFf().getManagePhoneBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("phone Button Clicked");
                view.getFf().setVisible(false);
                view.getMpf().setVisible(true);
            }
        });

        view.getFf().getManageAppPhoneBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("app phone Button Clicked");
                view.getFf().setVisible(false);
                view.getMapf().setVisible(true);
            }
        });


        model.getMa().setLinesBeingDisplayed(5);
        view.centerInitialSetupApp(model.getMa().getLinesBeingDisplayed(),model.getMa().getHeaders().size());

        model.getMp().setLinesBeingDisplayed(5);
        view.centerInitialSetupPhone(model.getMp().getLinesBeingDisplayed(),model.getMp().getHeaders().size());

        model.getMrp().setLinesBeingDisplayed(5);
        view.centerInitialSetupAppPhone(model.getMrp().getLinesBeingDisplayed(),model.getMrp().getHeaders().size());

        view.getMaf().addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                view.getFf().setVisible(true);
            }
        });

        view.getMpf().addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                view.getFf().setVisible(true);
            }
        });

        view.getMapf().addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                view.getFf().setVisible(true);
            }
        });

        model.getMa().setFirstLineToDisplay(0);
        view.centerUpdateApp(model.getMa().getLines(model.getMa().getFirstLineToDisplay(),model.getMa().getLastLineToDisplay()),model.getMa().getHeaders());


        model.getMp().setFirstLineToDisplay(0);
        view.centerUpdatePhone(model.getMp().getLines(model.getMp().getFirstLineToDisplay(),model.getMp().getLastLineToDisplay()),model.getMp().getHeaders());

        model.getMrp().setFirstLineToDisplay(0);
        view.centerUpdateAppPhone(model.getMrp().getLines(model.getMrp().getFirstLineToDisplay(),model.getMrp().getLastLineToDisplay()),model.getMrp().getHeaders());




        view.getMaf().getApp_ip().getApa().getAddApp_button().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt_app_name = view.getMaf().getApp_ip().getApa().getTxt_app_name().getText();
                String txt_app_operating_system = view.getMaf().getApp_ip().getApa().getTxt_app_operating_system().getText();
                String txt_app_voicesearch= view.getMaf().getApp_ip().getApa().getTxt_app_voicesearch().getText();
                String txt_app_battery_usage= view.getMaf().getApp_ip().getApa().getTxt_app_battery_usage().getText();
                String txt_app_security = view.getMaf().getApp_ip().getApa().getTxt_app_security().getText();
                try {
                    model.getMa().addNewApp(txt_app_name,txt_app_operating_system,Boolean.parseBoolean(txt_app_voicesearch),Float.parseFloat(txt_app_battery_usage),txt_app_security);

                    model.getMrp().addapp(txt_app_name,txt_app_operating_system,Boolean.parseBoolean(txt_app_voicesearch),Float.parseFloat(txt_app_battery_usage),txt_app_security);

//                    model.getMp().addNewPhone(0,"null",null,null,false);
////
//                    model.getMrp().addNewAppPhone(txt_app_name,txt_app_operating_system,txt_app_security,Boolean.parseBoolean(txt_app_voicesearch),Float.parseFloat(txt_app_battery_usage),"null",0,0,"null",null,null,false);

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        view.getMaf().getApp_ip().getEap().getGetAppBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Get App Details Clicked");
                String txt_app_idx = view.getMaf().getApp_ip().getEap().getTxt_get_app_idx().getText();
                model.getMa().readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");

                String app_name = model.getMa().getTable().get(Integer.parseInt(txt_app_idx)).getApp_name();
                String app_operating_system = model.getMa().getTable().get(Integer.parseInt(txt_app_idx)).getApp_operating_system();
                boolean app_voicesearch = model.getMa().getTable().get(Integer.parseInt(txt_app_idx)).getApp_voicesearch();
                float app_battery_usage = model.getMa().getTable().get(Integer.parseInt(txt_app_idx)).getApp_battery_usage();
                String app_security = model.getMa().getTable().get(Integer.parseInt(txt_app_idx)).getApp_security();

                view.getMaf().getApp_ip().getEap().getTxt_app_name().setText(app_name);
                view.getMaf().getApp_ip().getEap().getTxt_app_operating_system().setText(app_operating_system);
                view.getMaf().getApp_ip().getEap().getTxt_app_voicesearch().setText(String.valueOf(app_voicesearch));
                view.getMaf().getApp_ip().getEap().getTxt_app_battery_usage().setText(String.valueOf(app_battery_usage));
                view.getMaf().getApp_ip().getEap().getTxt_app_security().setText(app_security);

            }
        });

        view.getMaf().getApp_ip().getEap().getEditAppBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Edit App Button Clicked");
                String txt_app_idx = view.getMaf().getApp_ip().getEap().getTxt_get_app_idx().getText();
                String txt_app_name = view.getMaf().getApp_ip().getEap().getTxt_app_name().getText();
                String txt_app_operating_system = view.getMaf().getApp_ip().getEap().getTxt_app_operating_system().getText();
                String txt_app_voicesearch = view.getMaf().getApp_ip().getEap().getTxt_app_voicesearch().getText();
                String txt_app_battery_usage = view.getMaf().getApp_ip().getEap().getTxt_app_battery_usage().getText();
                String txt_app_security = view.getMaf().getApp_ip().getEap().getTxt_app_security().getText();
                try {
                    model.getMa().editNewApp(Integer.parseInt(txt_app_idx),txt_app_name,txt_app_operating_system,Boolean.parseBoolean(txt_app_voicesearch),Float.parseFloat(txt_app_battery_usage),txt_app_security);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        view.getMaf().getApp_ip().getDap().getDeleteAppBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Delete app Button Clicked");
                String txt_app_idx = view.getMaf().getApp_ip().getDap().getTxt_del_app_id().getText();
                if (model.getMa().getTable().size()<=5){
                    view.getMaf().getApp_ip().getDap().getTxt_del_app_id().setText("NOT POSSIBLE");
                }
                try {
//                    model.getMrp().deleteApp(Integer.parseInt(txt_app_idx));
//                    model.getMa().deleteApp(Integer.parseInt(txt_app_idx));
                    if (model.getMrp().getTable().size()<=5){
                        view.getMaf().getApp_ip().getDap().getTxt_del_app_id().setText("not possible");
                    }
                    else {
                        model.getMrp().deleteApp(Integer.parseInt(txt_app_idx));

                    }
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });



        view.getMpf().getPhone_ip().getApp().getAddPhone_button().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt_phone_model = view.getMpf().getPhone_ip().getApp().getTxt_phone_model().getText();
                String txt_phone_company = view.getMpf().getPhone_ip().getApp().getTxt_phone_company().getText();
                String txt_sim= view.getMpf().getPhone_ip().getApp().getTxt_sim().getText();
                String txt_microprocessor= view.getMpf().getPhone_ip().getApp().getTxt_microprocessor().getText();
                String txt_internet = view.getMpf().getPhone_ip().getApp().getTxt_internet().getText();
                try {
                    model.getMp().addNewPhone(Integer.parseInt(txt_phone_model),txt_phone_company,txt_sim,txt_microprocessor,Boolean.parseBoolean(txt_internet));
                    model.getMrp().addphone(Integer.parseInt(txt_phone_model),txt_phone_company,txt_sim,txt_microprocessor,Boolean.parseBoolean(txt_internet));



                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        view.getMpf().getPhone_ip().getEpp().getGetPhoneBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Get Phone Details Clicked");
                String txt_phone_idx = view.getMpf().getPhone_ip().getEpp().getTxt_get_phone_idx().getText();
                model.getMp().readPhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json");

                int phone_model = model.getMp().getTable().get(Integer.parseInt(txt_phone_idx)).getPhone_model();
                String phone_company = model.getMp().getTable().get(Integer.parseInt(txt_phone_idx)).getPhone_company();
                String sim = model.getMp().getTable().get(Integer.parseInt(txt_phone_idx)).getSim();
                String microprocessor = model.getMp().getTable().get(Integer.parseInt(txt_phone_idx)).getMicroprocessor();
                boolean internet = model.getMp().getTable().get(Integer.parseInt(txt_phone_idx)).isInternet();

                view.getMpf().getPhone_ip().getEpp().getTxt_phone_company().setText(phone_company);
                view.getMpf().getPhone_ip().getEpp().getTxt_phone_model().setText(String.valueOf(phone_model));
                view.getMpf().getPhone_ip().getEpp().getTxt_sim().setText(sim);
                view.getMpf().getPhone_ip().getEpp().getTxt_microprocessor().setText(microprocessor);
                view.getMpf().getPhone_ip().getEpp().getTxt_internet().setText(String.valueOf(internet));

            }
        });

        view.getMpf().getPhone_ip().getEpp().getEditPhoneBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Edit Phone Button Clicked");
                String txt_phone_idx = view.getMpf().getPhone_ip().getEpp().getTxt_get_phone_idx().getText();
                String txt_phone_model = view.getMpf().getPhone_ip().getEpp().getTxt_phone_model().getText();
                String txt_phone_company = view.getMpf().getPhone_ip().getEpp().getTxt_phone_company().getText();
                String txt_sim = view.getMpf().getPhone_ip().getEpp().getTxt_sim().getText();
                String txt_microprocessor = view.getMpf().getPhone_ip().getEpp().getTxt_microprocessor().getText();
                String txt_internet = view.getMpf().getPhone_ip().getEpp().getTxt_internet().getText();
                try {
                    model.getMp().editNewPhone(Integer.parseInt(txt_phone_idx),Integer.parseInt(txt_phone_model),txt_phone_company,txt_sim,txt_microprocessor, Boolean.parseBoolean(txt_internet));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        view.getMpf().getPhone_ip().getDpp().getDeletePhoneBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Delete phone Button Clicked");
                String txt_phone_idx = view.getMpf().getPhone_ip().getDpp().getTxt_del_phone_id().getText();
                if (model.getMp().getTable().size()<=5){
                    view.getMpf().getPhone_ip().getDpp().getTxt_del_phone_id().setText("NOT POSSIBLE");
                }
                try {
//                    model.getMrp().deletePhone();
//                    model.getMrp().deletePhone(Integer.parseInt(txt_phone_idx));
//                    model.getMp().deletePhone(Integer.parseInt(txt_phone_idx));
                    if (model.getMrp().getTable().size()<=5){
                        view.getMpf().getPhone_ip().getDpp().getTxt_del_phone_id().setText("not possible");
                    }
                    else {
                        model.getMrp().deletePhone(Integer.parseInt(txt_phone_idx));

                    }
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });


        view.getMapf().getApp_phone_ip().getApap().getAddApp_phone_button().addActionListener(new ActionListener() {
            int i =1;
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt_imei=view.getMapf().getApp_phone_ip().getApap().getTxt_imei().getText();
                String txt_price=view.getMapf().getApp_phone_ip().getApap().getTxt_price().getText();

                String txt_phone_model = view.getMapf().getApp_phone_ip().getApap().getTxt_phone_model().getText();
                String txt_phone_company = view.getMapf().getApp_phone_ip().getApap().getTxt_phone_company().getText();
                String txt_sim= view.getMapf().getApp_phone_ip().getApap().getTxt_sim().getText();
                String txt_microprocessor= view.getMapf().getApp_phone_ip().getApap().getTxt_microprocessor().getText();
                String txt_internet = view.getMapf().getApp_phone_ip().getApap().getTxt_internet().getText();

                String txt_app_name = view.getMapf().getApp_phone_ip().getApap().getTxt_app_name().getText();
                String txt_app_operating_system = view.getMapf().getApp_phone_ip().getApap().getTxt_app_operating_system().getText();
                String txt_app_voicesearch= view.getMapf().getApp_phone_ip().getApap().getTxt_app_voicesearch().getText();
                String txt_app_battery_usage= view.getMapf().getApp_phone_ip().getApap().getTxt_app_battery_usage().getText();
                String txt_app_security = view.getMapf().getApp_phone_ip().getApap().getTxt_app_security().getText();

                try {
                    model.getMrp().addNewAppPhone(txt_app_name,txt_app_operating_system,txt_app_security,Boolean.parseBoolean(txt_app_voicesearch),Float.parseFloat(txt_app_battery_usage),txt_imei,Integer.parseInt(txt_price),Integer.parseInt(txt_phone_model),txt_phone_company,txt_sim,txt_microprocessor,Boolean.parseBoolean(txt_internet));
              } catch (IOException ex) {
                    throw new RuntimeException(ex);

                }

            }

        });

        view.getMapf().getApp_phone_ip().getEapp().getGetAppPhoneBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Get App Phone Details Clicked");
                String txt_AppPhone_idx = view.getMapf().getApp_phone_ip().getEapp().getTxt_get_appPhone_idx().getText();
                model.getMrp().readRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json");

                int phone_model = model.getMrp().getTable().get(Integer.parseInt(txt_AppPhone_idx)).getP_temp().getPhone_model();
                String phone_company = model.getMrp().getTable().get(Integer.parseInt(txt_AppPhone_idx)).getP_temp().getPhone_company();
                String sim = model.getMrp().getTable().get(Integer.parseInt(txt_AppPhone_idx)).getP_temp().getSim();
                String microprocessor = model.getMrp().getTable().get(Integer.parseInt(txt_AppPhone_idx)).getP_temp().getMicroprocessor();
                boolean internet = model.getMrp().getTable().get(Integer.parseInt(txt_AppPhone_idx)).getP_temp().isInternet();

                String app_name = model.getMrp().getTable().get(Integer.parseInt(txt_AppPhone_idx)).getA_temp().getApp_name();
                String app_operating_system = model.getMrp().getTable().get(Integer.parseInt(txt_AppPhone_idx)).getA_temp().getApp_operating_system();
                boolean app_voicesearch = model.getMrp().getTable().get(Integer.parseInt(txt_AppPhone_idx)).getA_temp().getApp_voicesearch();
                float app_battery_usage = model.getMrp().getTable().get(Integer.parseInt(txt_AppPhone_idx)).getA_temp().getApp_battery_usage();
                String app_security = model.getMrp().getTable().get(Integer.parseInt(txt_AppPhone_idx)).getA_temp().getApp_security();

                view.getMapf().getApp_phone_ip().getEapp().getTxt_app_name().setText(app_name);
                view.getMapf().getApp_phone_ip().getEapp().getTxt_app_operating_system().setText(app_operating_system);
                view.getMapf().getApp_phone_ip().getEapp().getTxt_app_voicesearch().setText(String.valueOf(app_voicesearch));
                view.getMapf().getApp_phone_ip().getEapp().getTxt_app_battery_usage().setText(String.valueOf(app_battery_usage));
                view.getMapf().getApp_phone_ip().getEapp().getTxt_app_security().setText(app_security);

                view.getMapf().getApp_phone_ip().getEapp().getTxt_phone_company().setText(phone_company);
                view.getMapf().getApp_phone_ip().getEapp().getTxt_phone_model().setText(String.valueOf(phone_model));
                view.getMapf().getApp_phone_ip().getEapp().getTxt_sim().setText(sim);
                view.getMapf().getApp_phone_ip().getEapp().getTxt_microprocessor().setText(microprocessor);
                view.getMapf().getApp_phone_ip().getEapp().getTxt_internet().setText(String.valueOf(internet));

            }
        });

        view.getMapf().getApp_phone_ip().getEapp().getEditAppPhoneBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Edit App Phone Button Clicked");
                String txt_appPhone_idx = view.getMapf().getApp_phone_ip().getEapp().getTxt_get_appPhone_idx().getText();
                String txt_phone_model = view.getMapf().getApp_phone_ip().getEapp().getTxt_phone_model().getText();
                String txt_phone_company = view.getMapf().getApp_phone_ip().getEapp().getTxt_phone_company().getText();
                String txt_sim = view.getMapf().getApp_phone_ip().getEapp().getTxt_sim().getText();
                String txt_microprocessor = view.getMapf().getApp_phone_ip().getEapp().getTxt_microprocessor().getText();
                String txt_internet = view.getMapf().getApp_phone_ip().getEapp().getTxt_internet().getText();

                String txt_app_name = view.getMapf().getApp_phone_ip().getEapp().getTxt_app_name().getText();
                String txt_app_operating_system = view.getMapf().getApp_phone_ip().getEapp().getTxt_app_operating_system().getText();
                String txt_app_voicesearch = view.getMapf().getApp_phone_ip().getEapp().getTxt_app_voicesearch().getText();
                String txt_app_battery_usage = view.getMapf().getApp_phone_ip().getEapp().getTxt_app_battery_usage().getText();
                String txt_app_security = view.getMapf().getApp_phone_ip().getEapp().getTxt_app_security().getText();
                try {
                    model.getMrp().editNewAppPhone(Integer.parseInt(txt_appPhone_idx),Integer.parseInt(txt_phone_model),txt_phone_company,txt_sim,txt_microprocessor, Boolean.parseBoolean(txt_internet),txt_app_name,txt_app_operating_system,Boolean.parseBoolean(txt_app_voicesearch),Float.parseFloat(txt_app_battery_usage),txt_app_security);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        view.getMapf().getApp_phone_ip().getDapp().getDeleteAppPhoneBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Delete app phone Button Clicked");
                String txt_AppPhone_idx = view.getMapf().getApp_phone_ip().getDapp().getTxt_del_app_phone_id().getText();
                if (model.getMrp().getTable().size()<=5){
                    view.getMapf().getApp_phone_ip().getDapp().getTxt_del_app_phone_id().setText("NOT POSSIBLE");
                }
                try {
                    model.getMrp().deleteAppPhone(Integer.parseInt(txt_AppPhone_idx));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        view.getMaf().getApp_ip().getCpa().addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int units = e.getUnitsToScroll();
                System.out.println(units);
                int current_first_line = model.getMa().getFirstLineToDisplay();
                int current_last_line = model.getMa().getLastLineToDisplay();
                int no_of_apps = model.getMa().getTable().size();
                int no_of_display_lines = model.getMa().getLinesBeingDisplayed();
                if(units <= 0 && current_first_line == 0)
                {
                    model.getMa().setFirstLineToDisplay(0);
                }
                else if(units <= 0 && current_first_line > 0)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line <= 0)
                    {
                        model.getMa().setFirstLineToDisplay(0);
                    }
                    else
                    {
                        model.getMa().setFirstLineToDisplay(new_first_line);
                    }
                }
                else if(units > 0 && current_last_line == no_of_apps-1)
                {
                    model.getMa().setFirstLineToDisplay(current_first_line);
                }
                else if (units > 0 && current_last_line < no_of_apps-1)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line > no_of_apps - no_of_display_lines)
                    {
                        new_first_line = no_of_apps-no_of_display_lines;
                        model.getMa().setFirstLineToDisplay(new_first_line);
                    }
                    else
                    {
                        model.getMa().setFirstLineToDisplay(new_first_line);
                    }
                }

                view.centerUpdateApp(model.getMa().getLines(model.getMa().getFirstLineToDisplay(), model.getMa().getLastLineToDisplay()), model.getMa().getHeaders());
            }
        });

        view.getMpf().getPhone_ip().getCpp().addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int units = e.getUnitsToScroll();
                System.out.println(units);
                int current_first_line = model.getMp().getFirstLineToDisplay();
                int current_last_line = model.getMp().getLastLineToDisplay();
                int no_of_phones = model.getMp().getTable().size();
                int no_of_display_lines = model.getMp().getLinesBeingDisplayed();
                if(units <= 0 && current_first_line == 0)
                {
                    model.getMp().setFirstLineToDisplay(0);
                }
                else if(units <= 0 && current_first_line > 0)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line <= 0)
                    {
                        model.getMp().setFirstLineToDisplay(0);
                    }
                    else
                    {
                        model.getMp().setFirstLineToDisplay(new_first_line);
                    }
                }
                else if(units > 0 && current_last_line == no_of_phones-1)
                {
                    model.getMp().setFirstLineToDisplay(current_first_line);
                }
                else if (units > 0 && current_last_line < no_of_phones-1)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line > no_of_phones - no_of_display_lines)
                    {
                        new_first_line = no_of_phones-no_of_display_lines;
                        model.getMp().setFirstLineToDisplay(new_first_line);
                    }
                    else
                    {
                        model.getMp().setFirstLineToDisplay(new_first_line);
                    }
                }

                view.centerUpdatePhone(model.getMp().getLines(model.getMp().getFirstLineToDisplay(), model.getMp().getLastLineToDisplay()), model.getMp().getHeaders());
            }
        });

        view.getMapf().getApp_phone_ip().getCpap().addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {

                int units = e.getUnitsToScroll();
                int current_first_line = model.getMrp().getFirstLineToDisplay();
                System.out.println("current_first_line"+" "+current_first_line);
//                model.getMrp().setLastLineToDisplay(model.getMrp().getTable().size()-1);
                int current_last_line = model.getMrp().getLastLineToDisplay();
                System.out.println("current_last_line"+" "+current_last_line);
                int no_of_AppPhones = model.getMrp().getTable().size();
                int no_of_display_lines = model.getMrp().getLinesBeingDisplayed();
                if(units <= 0 && current_first_line == 0)
                {
                    model.getMrp().setFirstLineToDisplay(0);

                }
                else if(units <= 0 && current_first_line > 0)
                {
                    int new_first_line = current_first_line + units;

                    if(new_first_line <= 0)
                    {
                        model.getMrp().setFirstLineToDisplay(0);
                    }
                    else
                    {
                        model.getMrp().setFirstLineToDisplay(new_first_line);
                    }
                }
                else if(units > 0 && current_last_line == no_of_AppPhones-1)
                {
                    model.getMrp().setFirstLineToDisplay( current_first_line);
                }
                else if (units > 0 && current_last_line < no_of_AppPhones-1)
                {
                    int new_first_line = current_first_line + units;
                    if(new_first_line > no_of_AppPhones - no_of_display_lines)
                    {
                        new_first_line = no_of_AppPhones-no_of_display_lines;
                        model.getMrp().setFirstLineToDisplay(new_first_line);

                    }
                    else
                    {
                        model.getMrp().setFirstLineToDisplay(new_first_line);

                    }
                }

                System.out.println("final_current_first_line"+" "+current_first_line);


                view.centerUpdateAppPhone(model.getMrp().getLines(model.getMrp().getFirstLineToDisplay(), model.getMrp().getLastLineToDisplay()), model.getMrp().getHeaders());

            }
        });








    }

}
