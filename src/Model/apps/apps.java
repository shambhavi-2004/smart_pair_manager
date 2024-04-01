package Model.apps;

import java.util.ArrayList;

public class apps implements app_outcome {
    /**
     * Identification comments:
     *   Name: shambhavi patil
     *   Experiment No: 05
     *   Experiment Title: apps
     *   Experiment Date: 12-02-2024
     *   @version 1.0
     *
     *
     * Beginning comments:
     * Filename: apps.java
     * @author:  shambhavi patil
     * Overview: This is the apps class used to created objects for apps Class . In this file we have achieved the following
     * -apps class is a parent class for social_media_app class
     * -The class from which the subclass(i.e social_media_app class) is derived is called a superclass (also a base class or a parent class).
     *
     *   this class has 2 arraylists
     *   app_goals_list and app_mark_str_list
     *   its usage is when we are implementing the methods from interface
     *  * the add methods uses the add method in AL class to add the parameters provided in the add method to app_goals_list and app_mark_str_list respectively
     *  * the remove methods uses the remove method in AL class to remove the parameters provided in the remove method to app_goals_list and app_mark_str_list respectively
     *  * the display function uses the get method in the for loop which is implemented in the method to display all the elements set in the app_goals_list and app_mark_str_list respectively
     * -declaring variables in a class
     * -int app_id;
     * -String app_name;
     * -String app_operating_system;
     * -float app_battery_usage;
     * -String app_security;
     * -performing constructor overloading-constructor overloading can be defined as the concept of having more than one constructor with different parameters so that every constructor can perform a different task.
     * -creating setters
     * -for setting the value of an attribute created for an object
     * -creating getters
     * -for accessing values of an attribute of a particular object
     * -created display function (which calls the all the getters in the class) to display instance data
     * -this apps class is implementing all the methods in app_outcome interface
     * -as we will only be able to create objects of apps class if all the methods in interface are IMPLEMENTED
     */

    //declaring variables of apps class
    int app_id;
    String app_name;
//    String setApp_First_name;
//    String setApp_Last_name;
    String app_operating_system;
//    String app_OS_UpperCase;
    boolean app_voicesearch;
    float app_battery_usage;
    String app_security;
    private static int app_MYcount=0;
    private static int app_goals_count=0;
    private static int app_mark_str_count=0;

    ArrayList<String> app_goals_list = new ArrayList<String>(10);
    ArrayList<String> app_mark_str_list = new ArrayList<String>(10);


    public apps() {
        app_MYcount(getApp_MYcount()+1);
        this.app_id = getApp_MYcount();
    }

    public apps(String app_name, String app_operating_system,boolean app_voicesearch, float app_battery_usage, String app_security) {
        app_MYcount(getApp_MYcount()+1);
        this.app_id = getApp_MYcount();
        this.app_name = app_name.toUpperCase();
        this.app_operating_system = app_operating_system.toUpperCase();
        this.app_voicesearch = app_voicesearch;
        this.app_battery_usage = app_battery_usage;
        this.app_security = app_security;
    }

    public apps(int app_id, String app_name, String app_operating_system, boolean app_voicesearch, float app_battery_usage, String app_security) {
        app_MYcount(getApp_MYcount()+1);
        this.app_id = app_id;
        this.app_name = app_name.toUpperCase();
        this.app_operating_system = app_operating_system.toUpperCase();
//        this.app_OS_UpperCase = app_OS_UpperCase;
        this.app_voicesearch = app_voicesearch;
        this.app_battery_usage = app_battery_usage;
        this.app_security = app_security;
    }

    //creating setters to set the value of variables for a particular instance
    public void setApp_battery_usage(float app_battery_usage) {this.app_battery_usage = app_battery_usage;}
    public void setApp_security(String app_security) {
        this.app_security = app_security;
    }
    public void setApp_voicesearch(boolean app_voicesearch) {
        this.app_voicesearch = app_voicesearch;
    }
    public void setApp_operating_system(String app_operating_system) {this.app_operating_system = app_operating_system;}
    public void setApp_id(int app_id) {this.app_id = app_id;}

    public static void app_MYcount(int app_count) {
        apps.app_MYcount = app_count;
    }
    //creating getters to access the value of variables for a particular instance


    public static void setApp_goals_count(int app_goals_count) {
        apps.app_goals_count = app_goals_count;
    }

    public static void setApp_mark_str_count(int app_mark_str_count) {
        apps.app_mark_str_count = app_mark_str_count;
    }

    public int getApp_id() {
        return app_id;
    }
    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public float getApp_battery_usage() {
        return app_battery_usage;
    }
    public String getApp_security() {
        return app_security;
    }
    public boolean getApp_voicesearch(){
        return app_voicesearch;
    }
    public String getApp_operating_system() {
        return app_operating_system;
    }
    public String getApp_name() {
        return app_name;
    }

    public static int getApp_MYcount() {
        return app_MYcount;
    }

    public static int getApp_goals_count() {
        return app_goals_count;
    }

    public static int getApp_mark_str_count() {
        return app_mark_str_count;
    }

//    public void setApp_First_name(String setApp_First_name) {
//        this.setApp_First_name=setApp_First_name.toUpperCase();
//    }
//
//    public String getSetApp_First_name() {
//        return setApp_First_name;
//    }
//
//    public void setApp_Last_name(String setApp_Last_name) {
//        this.setApp_Last_name=setApp_Last_name.toUpperCase();
//    }
//
//    public String getSetApp_Last_name() {
//        return setApp_Last_name;
//    }

//    public void setApp_OS_UpperCase(String app_OS_UpperCase) {
//        this.app_OS_UpperCase = app_OS_UpperCase.toUpperCase();
//    }
//
//    public String getApp_OS_UpperCase() {
//        return app_OS_UpperCase;
//    }

    //display function:to display instance data
    public void display(){
//        System.out.println(getApp_id()+" "+getSetApp_First_name()+" "+getSetApp_Last_name()+" "+ getApp_OS_UpperCase()+" "+getApp_security()+" "+getApp_battery_usage() +" "+getApp_voicesearch());
        System.out.println(getApp_id()+" "+getApp_name()+" "+getApp_security()+" "+getApp_battery_usage() +" "+getApp_voicesearch());

    }

    @Override
    public void add_app_goals(String objective) {
        System.out.println("Clearly define what you want your app to achieve");

        app_goals_list.add(objective);
        System.out.println("your goal is set");
        setApp_goals_count(getApp_goals_count()+1);
    }

    @Override
    public void remove_app_goals(int objective_no) {
        if((objective_no < 5) && (objective_no >= 0)){
            app_goals_list.remove(objective_no);
            System.out.println("you goal is successfully removed");
            setApp_goals_count(getApp_goals_count()-1);

        }
        else{
            System.out.println("sorry!your app goals were never set");
        }
    }

    @Override
    public void display_app_goals() {
        for (int i = 0; i <app_goals_list.size() ; i++) {
            String s = app_goals_list.get(i);
            System.out.println(s);
        }
    }

    @Override
    public void add_app_mark_str(String outcome) {

        if(app_mark_str_list.size()<=5){
            app_mark_str_list.add(outcome);
            System.out.println("your marketing strategy is set");
            setApp_mark_str_count(getApp_mark_str_count()+1);
        }
        else
        {
            System.out.println("5 apps have already set their  marketing strategy plans. Cannot add more");
        }
    }

    @Override
    public void remove_app_mark_str(int outcome_no) {
        if((outcome_no <= 5) && (outcome_no >= 0)){
            app_mark_str_list.remove(outcome_no);
            System.out.println("you marketing strategy plan is successfully removed");
            setApp_mark_str_count(getApp_mark_str_count()-1);

        }
        else{
            System.out.println("sorry!your marketing strategy plans were never set");
        }

    }

    @Override
    public void display_app_mark_str() {
        for (int i = 0; i <app_mark_str_list.size(); i++) {
            String m = app_mark_str_list.get(i);
            System.out.println(m);
        }

    }

}
