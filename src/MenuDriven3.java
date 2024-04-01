import Model.apps.*;
import Model.phones.*;
import  Model.real_phone.*;



import java.io.IOException;

import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;


import com.fasterxml.jackson.databind.ObjectMapper;



public class MenuDriven3 {
    /**
     * Identification comments:
     *   Name: shambhavi patil
     *   Experiment No: 07
     *   Experiment Title: MenuDrivenProgramme
     *   Experiment Date: 12-02-2024
     *   @version 1.0
     *
     *
     * Beginning comments:
     * Filename: main.java
     * @author:  shambhavi patil
     * Overview: This is the main class used to execute a menu-driven programme . In this file we have achieved the following
     * - this programme involves a do while loop,and implements the use of a switch case
     * - using app_countto ensure proper implementation of 4 and 5(type apps,type phone,type social_media_apps) according to respective array(type apps,type phone)
     * - creating array_list (of type-phone class and apps class)
     * - primarily includes reading and writing into a json file accordingly
     * - using a switch case,to perform some functions(according to user's choice)
     * - case 1: initially a json file is read into apps_al so ensuring the next object creation to start after the index after all the already created objects of apps class's index which are present in app class
     * - case 2: (firstly the json file is read into apps_al so as to get all created objects into a single place and then easily access them via arraylist)deals with displaying of info of object(of type app) at a particular index in arraylist ,using display function(for object in array at particular index)
     * - case 3: (firstly the json file is read into apps_al so as to get all created objects into a single place and then easily access them via arraylist)deals with displaying of info of all objects(of type app) yet created in array ,by using for loop and iterating upto app_count(i.e upto the index of app array till which instantiation of an app object has happened),and using display function(for object in array upto particular  index (i.e app_count))
     * - case 4: deals with the value of instance variable of app_operating_system ,according to the value a unique message is displayed
     * - case 5: (USER'S CHOICE) deals with the value of instance variable of app_battery_usage ,to create a more efficient app,with the help of loops and conditional statements,now user must set a new value for instance var dealing with battery usage(that doesn't exceed LIMIT:2.5)
     * - case 6: initially a json file is read into phone_al so ensuring the next object creation to start after the index after all the already created objects of phone class's index which are present in phone class
     * - case 7: (firstly the json file is read into phone_al so as to get all created objects into a single place and then easily access them via arraylist)deals with displaying of info of object(of type phone) at a particular index in array ,using display function(for object in array at particular index)
     * - case 8: (firstly the json file is read into phone_al so as to get all created objects into a single place and then easily access them via arraylist)deals with displaying of info of all objects(of type phone) yet created in array ,by using for loop and iterating upto phones_count(i.e upto the index of phone array till which instantiation of an phone object has happened),and using display function(for object in array upto particular index (i.e phones_count))
     * - case 9: (runtime exceptions have been handled via try catch block)(done via writing into json file to update the necessary changes made into the phone_al) which are in accordance with the changes made in phone_al(via respective index)
     * - case 10: (done via writing into json file to update the necessary changes made into the apps_al) which are in accordance with the changes made in apps_al(via respective index)
     * - case 11: (runtime exceptions have been handled via try catch block)(done via writing into json file to update the necessary changes made into the apps_al) the object at respective index is removed from apps_al and hence from apps.json also
     * - case 12: (done via writing into json file to update the necessary changes made into the phone_al) the object at respective index is removed from phone_al and hence from phone.json also
     * - case 13: (runtime exceptions have been handled via try catch block)used to create an object of app_phone and finally read in into json file
     * - case 14: used to delete an object in real AL
     * - case 15: used to display all elements in real AL
     * - case 16: used to come out of loop(i.e condition of while becomes false)
     * - case default: default case executed when choice entered is not equal to any case's value
     * - while in do-while (ensures until it's condition is true),the loop keeps on running
     */

    public static void main(String[] args) throws IOException {
        int app_count = 0;
        int phones_count = 0;


        ArrayList<apps> apps_al=new ArrayList<apps>();

        manageApp ms2 = new manageApp();
        apps_al = ms2.readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");
        ObjectMapper mapper1 = new ObjectMapper();


        int apps_al_position = 0;



        ArrayList<phone> phone_al=new ArrayList<phone>();
        managePhone ms1 = new managePhone();
        phone_al = ms1.readPhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json");
        ObjectMapper mapper2 = new ObjectMapper();

        int phone_al_position = 0;


        ArrayList<app_phone> real = new ArrayList<app_phone>();
        Manage_Real_Phone rp1 = new Manage_Real_Phone();
        real=rp1.readRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json");
        real = rp1.getTable();



        //Creating a Scanner Object to take input
        Scanner sc = new Scanner(System.in);


        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("hi");
            System.out.println("1. Add An app");
            System.out.println("2. View App Details");
            System.out.println("3. View All App Details");
            System.out.println("4. for fun fact of the app's OS");
            System.out.println("5. battery usage limiter for your app");
            System.out.println("6. Add your phone");
            System.out.println("7. View phone Details");
            System.out.println("8. View All phone Details");
            System.out.println("9. enter details of phone to be updated");
            System.out.println("10. enter details of phone to be deleted");
            System.out.println("11. enter details of app to be updated");
            System.out.println("12. enter details of app to be deleted");
            System.out.println("13. Add an app_phone");
            System.out.println("14. Delete an app_phone");
            System.out.println("15. Display All app_phone");
            System.out.println("16. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    apps_al = ms2.readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");
                    System.out.println("Hi!");
                    System.out.println("How do you want to perform the following tasks:");
                    System.out.println("generate your id AND filling the app details");
                    System.out.println("1. Auto Generate Id and don't add other Details");
                    System.out.println("2. Auto Generate Id and add all other Details");
                    System.out.println("3. Provide app Id as well as other details");
                    System.out.print("Enter your choice: ");
                    int filling_choice = sc.nextInt();
                    sc.nextLine();
                    if (filling_choice == 1) {
                        apps_al.add(new apps());
                        app_count++;
                    } else if (filling_choice == 2) {

                        System.out.println("Enter your app's name ");
                        String app_name = sc.nextLine().toUpperCase();

                        System.out.println("Enter App's O.S.: ");
                        String OS = sc.nextLine();
                        String OS_UPPER_CASE=OS.toUpperCase();

                        System.out.println("Enter App's Voice Search: ");
                        boolean vsc = sc.nextBoolean();

                        System.out.println("Enter battery usage: ");
                        float battery_usage = sc.nextFloat();
                        sc.nextLine();

                        System.out.println("Enter APP's security: ");
                        String security = sc.nextLine();
                        apps_al.add(new apps(app_name, OS, vsc, battery_usage, security));
                        app_count++;
                    } else if (filling_choice == 3) {
                        System.out.println("manual ID generation is a bit tedious!!");
                        System.out.println("do you really want to continue with manual ID generation");
                        System.out.println("1:yes,i want to continue");
                        System.out.println("2:no,i don't want to continue");
                        int condition = sc.nextInt();
                        sc.nextLine();
                        if (condition == 2) {
                            choice = 1;
                            break;
                        }
                        if (condition == 1) {
                            System.out.println("Enter app Id: ");
                            int app_id = sc.nextInt();
                            sc.nextLine();
                            for (int i = 0; i < app_count; i++) {
                                while(apps_al.get(i).getApp_id()==app_id){
                                    System.out.println("the ID which has been inputted already exists");
                                    System.out.println("pls enter ID again");
                                    System.out.println("ID value should be above 100");
                                    app_id= sc.nextInt();
                                    sc.nextLine();

                                }

                            }


                            System.out.println("Enter your app's name ");
                            String app_name = sc.nextLine().toUpperCase();


                            System.out.println("Enter App's O.S.: ");
                            String OS = sc.nextLine();
                            String OS_UPPER_CASE=OS.toUpperCase();

                            System.out.println("Enter App's Voice Search: ");
                            boolean vsc = sc.nextBoolean();
                            System.out.println("Enter battery usage: ");
                            float battery_usage = sc.nextFloat();
                            sc.nextLine();
                            System.out.println("Enter APP's security: ");
                            String security = sc.nextLine();

                            apps_al.add(new apps(app_id, app_name, OS, vsc, battery_usage, security));
                            app_count++;
                        }

                    }
                    ms2.writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json",apps_al);
                    ms2.readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");
                    break;


                case 2:
                    apps_al = ms2.readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");
                    System.out.print("Enter app Index to Display: ");
                    int app_idx = sc.nextInt();
                    sc.nextLine();
                    apps_al.get(app_idx).display();
                    break;
                case 3:
                    apps_al = ms2.readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");
                    for(int i = 0; i < apps_al.size(); i++)
                    {
                        apps_al.get(i).display();
                    }
                    break;
                case 4:
                    System.out.println("so you wanna hear a fun fact!");
                    System.out.println("Enter App's Array Position Index: ");
                    int index_app = sc.nextInt();
                    sc.nextLine();
                    if (apps_al.get(index_app).getApp_operating_system().equals("linux")) {
                        System.out.println("You can install Linux on as many computers as you like without paying a cent for software or server licensing");

                    } else if (apps_al.get(index_app).getApp_operating_system().equals("windows")) {
                        System.out.println("‘Windows Nashville’, ‘Windows Cairo’ and ‘Windows Neptune’, these are the three unreleased versions of Windows.");
                    } else if (apps_al.get(index_app).getApp_operating_system().equals("macOS")) {
                        System.out.println("The First Portable Mac Weighed 16 Pounds.");
                    } else {
                        System.out.println("since your OS isn't present in our list");
                        System.out.println("here is a random OS fact!!");
                        System.out.println("The MS-DOS is not the first operating system. The first OS was XENIX OS.");
                    }
                    break;

                case 5:
                    System.out.println("Enter App's Array Position Index: ");
                    int index_app_batt = sc.nextInt();
                    float appBatteryUsage =apps_al.get(index_app_batt).getApp_battery_usage();
                    if (appBatteryUsage < 2.5) {
                        System.out.println("that is a good effort towards a bright future");

                    } else {
                        while (appBatteryUsage > 2.5) {
                            System.out.println("pls consume less battery");
                            System.out.println("Enter new battery usage value");
                            float battery = sc.nextFloat();
                            apps_al.get(index_app_batt).setApp_battery_usage(battery);
                            float new_batt = apps_al.get(index_app_batt).getApp_battery_usage();
                            if (new_batt < 2.5) {
                                System.out.println("thanks,pls take care of your enviroment!");
                                appBatteryUsage = new_batt;
                            }
                        }

                    }

                    break;

                case 6:
                    ms1.readPhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json");
                    System.out.println("Hi!");
                    System.out.println("How do you want to perform the following tasks:");
                    System.out.println("generate your id AND filling the app details");
                    System.out.println("1. Auto Generate Id and don't add other Details");
                    System.out.println("2. Auto Generate Id and add all other Details");
                    System.out.println("3. Provide phone Id as well as other details");
                    System.out.print("Enter your choice: ");
                    int filling_choice1 = sc.nextInt();
                    sc.nextLine();
                    if (filling_choice1 == 1) {
                        phone_al.add(new phone());
                        phones_count++;
                    }else if (filling_choice1 == 2) {

                        System.out.println("Enter your phone's name ");
                        String phone_company = sc.nextLine().toUpperCase();

                        System.out.println("Enter Phone's model: ");
                        int model = sc.nextInt();
                        sc.nextLine();

                        System.out.println("enter phone's sim");
                        String sim=sc.nextLine();

                        System.out.println("enter type of microprocessor of phone");
                        String mpc=sc.nextLine();

                        System.out.println("is internet access facility available");
                        boolean internet=sc.nextBoolean();

                        phone_al.add(new phone(sim,mpc,internet,model,phone_company));
                        phones_count++;
                    }else if (filling_choice1 == 3) {
                        System.out.println("manual ID generation is a bit tedious!!");
                        System.out.println("do you really want to continue with manual ID generation");
                        System.out.println("1:yes,i want to continue");
                        System.out.println("2:no,i don't want to continue");
                        int condition = sc.nextInt();
                        sc.nextLine();
                        if (condition == 2) {
                            choice = 1;
                            break;
                        }
                        if (condition == 1) {
                            System.out.println("Enter phone Id: ");
                            int phone_id = sc.nextInt();
                            sc.nextLine();
                            for (int i = 0; i <phone_al.size(); i++) {
                                while(phone_al.get(i).getPhone_id()==phone_id){
                                    System.out.println("the ID which has been inputted already exists");
                                    System.out.println("pls enter ID again");
                                    System.out.println("ID value should be above 100");
                                    phone_id= sc.nextInt();
                                    sc.nextLine();

                                }

                            }
                            System.out.println("Enter phone template Id: ");
                            int temp_id = sc.nextInt();
                            sc.nextLine();
                            sc.nextLine();
                            for (int i = 0; i < phones_count; i++) {
                                while(phone_al.get(i).getTemp_id()==temp_id){
                                    System.out.println("the ID which has been inputted already exists");
                                    System.out.println("pls enter ID again");
                                    System.out.println("ID value should be above 100");
                                    phone_id= sc.nextInt();
                                    sc.nextLine();

                                }
                            }


                            System.out.println("Enter your phone's name ");
                            String phone_company = sc.nextLine().toUpperCase();

                            System.out.println("Enter Phone's model: ");
                            int model = sc.nextInt();
                            sc.nextLine();
                            System.out.println("enter phone's sim");
                            String sim=sc.nextLine();

                            System.out.println("enter type of microprocessor of phone");
                            String mpc=sc.nextLine();

                            System.out.println("is internet access facility available");
                            boolean internet=sc.nextBoolean();

                            phone_al.add(new phone(temp_id,sim,mpc,internet,model,phone_id,phone_company));
                            phones_count++;
                        }


                    }
                    ms1.writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone_al);

                    break;

                case 7:
                    phone_al = ms1.readPhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json");
                    System.out.print("Enter phone Index to Display: ");
                    int phn_idx = sc.nextInt();
                    sc.nextLine();
                    phone_al.get(phn_idx).display();
                    break;
                case 8:
                    phone_al = ms1.readPhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json");
                    for(int i = 0; i < phone_al.size(); i++)
                    {
                        phone_al.get(i).display();
                    }
                    break;

                case 9:
                    System.out.print("Enter phone Index to Update: ");
                    int phone_idx = sc.nextInt();
                    sc.nextLine();
                    int change_choice;
                    do {
                        System.out.println("1. Change sim");
                        System.out.println("2. Change microprocessor");
                        System.out.println("3. Change internet");
                        System.out.println("4. Change phone_model");
                        System.out.println("5. Change company");
                        System.out.println("6. Exit Update");

                        System.out.print("Enter your choice: ");
                        change_choice = sc.nextInt();
                        sc.nextLine();
                        switch (change_choice){
                            case 1:
                                System.out.print("Enter phone sim: ");
                                String sim = sc.nextLine();
                                phone_al.get(phone_idx).setSim(sim);
                                ms1.writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone_al);
                                break;
                            case 2:
                                System.out.print("Enter phone microprocessor: ");
                                String mp = sc.nextLine();
                                phone_al.get(phone_idx).setMicroprocessor(mp);
                                ms1.writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone_al);
                                break;
                            case 3:
                                System.out.print("Enter phone internet: ");
                                boolean internet= sc.nextBoolean();
                                phone_al.get(phone_idx).setInternet(internet);
                                ms1.writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone_al);
                                break;
                            case 4:
                                int model=0;
                                try{
                                    System.out.print("Enter phone model: ");
                                    model = sc.nextInt();
                                    sc.nextLine();
                                }catch (InputMismatchException e){
                                    try{
                                        model=0;
                                        throw new excep();
                                    } catch (excep ex) {
                                        System.out.println(ex.getMessage());;
                                    }
                                }

                                phone_al.get(phone_idx).setPhone_model(model);
                                ms1.writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone_al);
                                break;

                            case 5:
                                System.out.print("Enter phone company: ");
                                String cmpny = sc.nextLine();
                                phone_al.get(phone_idx).setPhone_company(cmpny);
                                ms1.writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone_al);

                                break;
                            default:
                                System.out.println("Invalid choice. Try again.");
                                break;
                        }
                    } while (change_choice != 6);
                    phone_al=ms1.readPhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json");

                    break;
                case 10:
                    System.out.print("Enter phone Index to be Deleted: ");
                    int phone_idx_delete = sc.nextInt();
                    sc.nextLine();
                    String phone_company = phone_al.get(phone_idx_delete).getPhone_company();
                    int model = phone_al.get(phone_idx_delete).getPhone_model();
                    System.out.println("phone Deleted company : "+phone_company+ " "+"model:"+model);
                    phone_al.remove(phone_idx_delete);
                    ms1.writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone_al);
                    break;
                case 11:
                    System.out.print("Enter app Index to Update: ");
                    int app_idx1 = sc.nextInt();
                    sc.nextLine();
                    int choice_to_change;
                    do {
                        System.out.println("1. Change app Name");
                        System.out.println("2. Change app OS");
                        System.out.println("3. Change app vsc");
                        System.out.println("4. Change battery usage");
                        System.out.println("5. Change app security");
                        System.out.println("6. Exit Update");

                        System.out.print("Enter your choice: ");
                        choice_to_change = sc.nextInt();
                        sc.nextLine();
                        switch (choice_to_change){
                            case 1:
                                System.out.print("Enter app Name: ");
                                String app_name = sc.nextLine();
                                apps_al.get(app_idx1).setApp_name(app_name);
                                ms2.writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json",apps_al);

                                break;
                            case 2:
                                System.out.print("Enter app OS: ");
                                String app_OS = sc.nextLine();
                                apps_al.get(app_idx1).setApp_operating_system(app_OS.toUpperCase());
                                ms2.writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json",apps_al);
                                break;
                            case 3:
                                System.out.print("Enter voice search facility: ");
                                Boolean app_vsc = sc.nextBoolean();
                                apps_al.get(app_idx1).setApp_voicesearch(app_vsc);
                                ms2.writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json",apps_al);
                                break;
                            case 4:
                                System.out.print("Enter app battery usage: ");
                                float app_batt=0;
                                try{
                                    app_batt = sc.nextFloat();
                                    sc.nextLine();
                                }catch (InputMismatchException e){
                                    try {
                                        app_batt=1;
                                        throw new excep();
                                    } catch (excep ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                }
                                apps_al.get(app_idx1).setApp_battery_usage(app_batt);
                                ms2.writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json",apps_al);
                                break;

                            case 5:
                                System.out.print("Enter app security: ");
                                String app_scrt = sc.nextLine();
                                apps_al.get(app_idx1).setApp_security(app_scrt);
                                ms2.writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json",apps_al);
                                break;

                            default:
                                System.out.println("Invalid choice. Try again.");
                                break;
                        }
                    } while (choice_to_change != 6);
                    real=rp1.readRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json");

                    break;
                case 12:
                    System.out.print("Enter app Index to be Deleted: ");
                    int app_idx_delete = sc.nextInt();
                    sc.nextLine();
                    String app_name = apps_al.get(app_idx_delete).getApp_name();
                    System.out.println("app Deleted name : "+app_name);
                    apps_al.remove(app_idx_delete);
                    ms2.writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json",apps_al);
                    break;
                case 13:
                    apps_al = ms2.readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");
                    phone_al = ms1.readPhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json");
                    real=rp1.readRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json");
                    System.out.print("Enter IMEI: ");
                    String imei = sc.nextLine();
                    System.out.print("Enter price: ");
                    int price = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter your app's name ");
                    String app_name1 = sc.nextLine().toUpperCase();
                    System.out.println("Enter App's O.S.: ");
                    String OS = sc.nextLine().toUpperCase();
                    System.out.println("Enter App's Voice Search: ");
                    boolean vsc = sc.nextBoolean();


                    System.out.print("Enter app battery usage: ");
                    float battery_usage=0;
                    try{
                        battery_usage = sc.nextFloat();
                        sc.nextLine();
                    }catch (InputMismatchException e){
                        try {
                            battery_usage=1;
                            throw new excep();
                        } catch (excep ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    sc.nextLine();


                    System.out.println("Enter APP's security: ");
                    String security = sc.nextLine();
                    apps a1=new apps(app_name1, OS, vsc, battery_usage, security);
                    apps_al.add(a1);



                    System.out.println("Enter your phone's name ");
                    String phone_company1 = sc.nextLine().toUpperCase();

                    int model1=0;
                    try{
                        System.out.print("Enter phone model: ");
                        model1 = sc.nextInt();
                        sc.nextLine();
                    }catch (InputMismatchException e){
                        try{
                            model1=0;
                            throw new excep();
                        } catch (excep ex) {
                            System.out.println(ex.getMessage());;
                        }
                    }
                    sc.nextLine();

                    System.out.println("enter phone's sim");
                    String sim=sc.nextLine();
                    System.out.println("enter type of microprocessor of phone");
                    String mpc=sc.nextLine();
                    System.out.println("is internet access facility available");
                    boolean internet=sc.nextBoolean();
                    phone p1=new phone(sim,mpc,internet,model1,phone_company1);
                    phone_al.add(p1);


                    app_phone ap = new app_phone(a1,p1,price,imei);
                    real.add(ap);
                    ms2.writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json",apps_al);
                    ms1.writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone_al);
                    rp1.writeRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json",real);
                    break;
                case 14:

                    phone_al = ms1.readPhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json");
                    apps_al = ms2.readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");

                    System.out.print("Enter phone company to delete: ");
                    String phone_comp=sc.nextLine();

                    int p=0;
                    for (int i=0; i<real.size();i++)
                    {
                        if(Objects.equals(phone_comp, phone_al.get(i).getPhone_company()))
                        {
                            real.remove(i);
                            System.out.println("app_phone removed successfully");
                            break;
                        }
                        p++;
                    }
                    if(p==phone_al.size()){
                        System.out.println("company not present");
                    }

                    rp1.writeRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json",real);
                    break;
                case 15:
                    System.out.println(real.size());
                    phone_al=ms1.readPhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json");
                    apps_al=ms2.readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");
                    for (int i = 0; i < real.size(); i++) {
                        real.get(i).display();
                    }
                    break;

                default:
                    // invalid choice
                    System.out.println("Invalid choice, please try again.");
                    break;
            }

        } while (choice != 16);


    }

}
