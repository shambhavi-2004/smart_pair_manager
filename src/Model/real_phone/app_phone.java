package Model.real_phone;

import Model.apps.*;
import Model.phones.*;

/**
 * Identification comments:
 *   Name: shambhavi patil
 *   Experiment No: 07
 *   Experiment Title: app_phones
 *   Experiment Date: 12-02-2024
 *   @version 1.0
 *
 *
 *
 * Beginning comments:
 * Filename: phone.java
 * @author:  shambhavi patil
 * Overview: This is the app_phone class used to created objects for app_phone Class . In this file we have achieved the following
 * - it has two inst vars pointing to object of apps class and phone class
 * will be used to istore data of 2 different types in one place
 * one app_phone can only have one phone pointing to it
 * and one app pointing to it
 * the display function uses the get method in the for loop which is implemented in the method to display all the elements set in the phone_difflist and phone_revlist respectively
 * - declaring variables in a class
 * - int price;
 * - String imei;
 * - creating setters
 * -for setting the value of an attribute created for an object
 * -creating getters
 * -for accessing values of an attribute of a particular object
 * -created display function (which calls the all the getters in the class) to display instance data
 * -this function calls the display function of the parent class using super keyword
 * -this phone class is implementing all the methods in phone_additional interface
 * -as we will only be able to create objects of phone class if all the methods in interface are IMPLEMENTED
 */

public class app_phone {
    apps a_temp;
    phone p_temp;
    int price;
    String imei;

    public app_phone(apps a_temp, phone p_temp, int price, String imei) {
        this.a_temp = a_temp;
        this.p_temp = p_temp;
        this.price = price;
        this.imei = imei;
    }

    public apps getA_temp() {
        return a_temp;
    }

    public void setA_temp(apps a_temp) {
        this.a_temp = a_temp;
    }

    public phone getP_temp() {
        return p_temp;
    }

    public void setP_temp(phone p_temp) {
        this.p_temp = p_temp;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
    public void display(){
        System.out.println(getImei()+" "+getPrice()+" "+getA_temp().getApp_name()+" "+getP_temp().getPhone_company());
    }


}
