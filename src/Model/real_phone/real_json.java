package Model.real_phone;
/**
 * Identification comments:
 *   Name: shambhavi patil
 *   Experiment No: 07
 *   Experiment Title: real_json
 *   Experiment Date: 12-02-2024
 *   @version 1.0
 *
 *
 *
 * Beginning comments:
 * Filename: real_json .java
 * @author:  shambhavi patil
 * Overview: This is the real_json  class  .
 * this was mainly create so as to be able get a suitable AL  to write into a json file.
 * so that proper key value pair generation happens
 * contains only the attributes of app_phone class
 * String imei;
 * int price;
 * String phone_company;
 * String app_name;

 */

public class real_json {
    String imei;
    int price;
    String phone_company;
    String app_name;

    public real_json(String imei, int price, String phone_company, String app_name) {
        this.imei = imei;
        this.price = price;
        this.phone_company = phone_company;
        this.app_name = app_name;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhone_company() {
        return phone_company;
    }

    public void setPhone_company(String phone_company) {
        this.phone_company = phone_company;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }
}
