package Model.phones;

import java.util.ArrayList;

/**
 * Identification comments:
 *   Name: shambhavi patil
 *   Experiment No: 05
 *   Experiment Title: phones
 *   Experiment Date: 12-02-2024
 *   @version 1.0
 *
 *
 *
 * Beginning comments:
 * Filename: phone.java
 * @author:  shambhavi patil
 * Overview: This is the phone class used to created objects for phone Class . In this file we have achieved the following
 * - phone class is a child class which inherits all the properties of the parent class(phone_template class)
 *
 * this class has 2 arraylists
 * phone_difflist and phone_revlist
 * its usage is when we are implementing the methods from interface
 * the add methods uses the add method in AL class to add the parameters provided in the add method to phone_difflist and phone_revlist respectively
 * the remove methods uses the remove method in AL class to remove the parameters provided in the remove method to phone_difflist and phone_revlist respectively
 * the display function uses the get method in the for loop which is implemented in the method to display all the elements set in the phone_difflist and phone_revlist respectively
 * - declaring variables in a class
 * - int phone_model;
 * - int phone_id;
 * - String phone_company;
 * -performing constructor overloading-constructor overloading can be defined as the concept of having more than one constructor with different parameters so that every constructor can perform a different task.
 * -all constructors implement the super keyword which in turn calls the parent class's constructor
 * -for setting the value of an attribute created for an object
 * -creating getters
 * -for accessing values of an attribute of a particular object
 * -created display function (which calls the all the getters in the class) to display instance data
 * -this function calls the display function of the parent class using super keyword
 * -this phone class is implementing all the methods in phone_additional interface
 * -as we will only be able to create objects of phone class if all the methods in interface are IMPLEMENTED
 */


public class phone extends phone_template implements phone_additional {

    //declaring variables of phone class
    int phone_model;
    int phone_id;
    String phone_company;
//    String phone_company_uppercase;
    private static int phone_MYcount=0;
    private static int phone_diff_count=0;
    private static int phone_review_count=0;

    ArrayList<String> phone_diff_list = new ArrayList<>();
    ArrayList<String> phone_review_list = new ArrayList<>();

    public static int getPhone_diff_count() {
        return phone_diff_count;
    }

    public static void setPhone_diff_count(int phone_diff_count) {
        phone.phone_diff_count = phone_diff_count;
    }

    public static int getPhone_review_count() {
        return phone_review_count;
    }

    public static void setPhone_review_count(int phone_review_count) {
        phone.phone_review_count = phone_review_count;
    }

    public phone() {
        setPhone_MYcount(getPhone_MYcount()+1);
        this.phone_id =getPhone_MYcount();
    }

    public phone(String sim, String microprocessor, boolean internet, int phone_model, String phone_company) {
        super(sim, microprocessor, internet);
        setPhone_MYcount(getPhone_MYcount()+1);
        this.phone_id =getPhone_MYcount();
        this.phone_model = phone_model;
        this.phone_company = phone_company.toUpperCase();
    }

    public phone(int temp_id, String sim, String microprocessor, boolean internet, int phone_model, int phone_id, String phone_company) {
        super(temp_id, sim, microprocessor, internet);
        this.phone_model = phone_model;
        this.phone_id = phone_id;
        this.phone_company = phone_company.toUpperCase();
//        this.phone_company_uppercase = phone_company_uppercase;
    }

    //creating setters to set the value of variables for a particular instance
    public void setPhone_company(String phone_company) {this.phone_company = phone_company;}
    public void setPhone_id(int phone_id) {
        this.phone_id = phone_id;
    }
    public void setPhone_model(int phone_model) {
        this.phone_model = phone_model;
    }


    public static void setPhone_MYcount(int phone_MYcount) {
        phone.phone_MYcount = phone_MYcount;
    }

    //creating getters to access the value of variables for a particular instance
    public String getPhone_company() {
        return phone_company;
    }
    public int getPhone_id() {
        return phone_id;
    }
    public int getPhone_model() {
        return phone_model;
    }

//    public String getPhone_company_uppercase() {
//        return phone_company_uppercase;
//    }

    public static int getPhone_MYcount() {
        return phone_MYcount;
    }

    //display function:to display instance data
    public void display(){
        super.display();
        System.out.println(getPhone_company()+" "+getPhone_model());
    }

    @Override
    public void add_differentiation_feature(String outcome) {
        if(phone_diff_count<=5){
            phone_diff_list.add(outcome);
            System.out.println("your difffrentiation criteria is set");
            setPhone_diff_count(getPhone_diff_count()+1);
        }
        else
        {
            System.out.println("5 phones have already set their differentiability goals. Cannot add more");
        }
    }

    @Override
    public void remove_differentiation_feature(int objective_no) {
        if((objective_no <= 5) && (objective_no >= 0)){
            phone_diff_list.remove(objective_no);
            System.out.println("your differentiation strategy plan is successfully removed");
            setPhone_diff_count(getPhone_diff_count()-1);

        }
        else{
            System.out.println("sorry!your differentiation features were never set");
        }

    }

    @Override
    public void display_differentiation_feature() {
        for (int i = 0; i <phone_diff_list.size() ; i++) {
            String m = phone_diff_list.get(i);
            System.out.println(m);
        }

    }

    @Override
    public void add_review(String outcome) {
        if(phone_review_count<5){
            phone_review_list.add(outcome);
            System.out.println("your review is set");
            setPhone_diff_count(getPhone_diff_count()+1);
        }
        else
        {
            System.out.println("5 reviews have already been set. Cannot add more");
        }
    }

    @Override
    public void remove_review(int outcome_no) {
        if((outcome_no < 5) && (outcome_no >= 0)){
            phone_review_list.remove(outcome_no);
            System.out.println("your review is successfully removed");
            setPhone_review_count(getPhone_review_count()+1);

        }
        else{
            System.out.println("sorry!your reviews were never set");
        }
    }

    @Override
    public void display_review() {
        for (int i = 0; i <phone_review_list.size() ; i++) {
            String m = phone_review_list.get(i);
            System.out.println(m);
        }
    }
}