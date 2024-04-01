package Model.apps;

public class social_media_apps extends apps {
    /**
     * Identification comments:
     *   Name: shambhavi patil
     *   Experiment No: 04
     *   Experiment Title: apps
     *   Experiment Date: 08-02-2024
     *   @version 1.0
     *
     *
     * Beginning comments:
     * Filename: social_media_apps.java
     * @author:  shambhavi patil
     * Overview: This is the social_media_apps class used to created objects for social_media_apps Class . In this file we have achieved the following
     * -this is a child class which inherits all the properties of it's parent class(i.e apps)
     * -declaring variables in a class
     * -int social_id;
     * -String accessibility;
     * -int users;
     * -String size;
     * -boolean livestreaming;
     * int multi_language_support;
     * -creating setters
     * -performing constructor overloading-constructor overloading can be defined as the concept of having more than one constructor with different parameters so that every constructor can perform a different task.
     * -all constructors implement the super keyword which in turn calls the parent class's constructor
     * -for setting the value of an attribute created for an object
     * -creating getters
     * -for accessing values of an attribute of a particular object
     * -created display function (which calls the all the getters in the class) to display instance data
     * -this function calls the display function of the parent class using super keyword
     */

    private static int social_count = 0;
    int social_id;
    String accessibility;
    int users;
    String size;
    boolean livestreaming;
    int multi_language_support;

    public social_media_apps() {
        setSocial_count(getSocial_count()+1);
        this.social_id = social_count;
    }

    public social_media_apps(String app_name, String app_operating_system, boolean app_voicesearch, float app_battery_usage, String app_security, String accessibility, int users, String size, boolean livestreaming, int multi_language_support) {
        super(app_name, app_operating_system,  app_voicesearch, app_battery_usage, app_security);
        setSocial_count(getSocial_count()+1);
        this.social_id=getSocial_count();
        this.accessibility = accessibility;
        this.users = users;
        this.size = size;
        this.livestreaming = livestreaming;
        this.multi_language_support = multi_language_support;
    }

    public social_media_apps(int app_id,String app_name, String app_operating_system, boolean app_voicesearch, float app_battery_usage, String app_security, int social_id, String accessibility, int users, String size, boolean livestreaming, int multi_language_support) {
        super(app_id,app_name, app_operating_system, app_voicesearch, app_battery_usage, app_security);
        this.social_id = social_id;
        this.accessibility = accessibility;
        this.users = users;
        this.size = size;
        this.livestreaming = livestreaming;
        this.multi_language_support = multi_language_support;
    }

    public static int getSocial_count() {
        return social_count;
    }

    public static void setSocial_count(int social_count) {
        social_media_apps.social_count = social_count;
    }

    public int getSocial_id() {
        return social_id;
    }

    public void setSocial_id(int social_id) {
        this.social_id = social_id;
    }

    public String getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }

    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isLivestreaming() {
        return livestreaming;
    }

    public void setLivestreaming(boolean livestreaming) {
        this.livestreaming = livestreaming;
    }

    public int getMulti_language_support() {
        return multi_language_support;
    }

    public void setMulti_language_support(int multi_language_support) {
        this.multi_language_support = multi_language_support;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(getSocial_id()+" "+getUsers()+" "+getAccessibility()+" "+getMulti_language_support()+" "+getSize());
    }
}
