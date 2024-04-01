package Model.real_phone;


import Model.apps.*;

import Model.Displayable;
import Model.phones.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Identification comments:
 *   Name: shambhavi patil
 *   Experiment No: 07
 *   Experiment Title: Manage_Real_Phone
 *   Experiment Date: 12-02-2024
 *   @version 1.0
 *
 *
 *
 * Beginning comments:
 * Filename: Manage_Real_Phone.java
 * @author:  shambhavi patil
 * Overview: This is the managePhone classimplementing displayable and Filehandling phone abstract class.
 * has a AL phone,AL apps,AL app_phone and an objectmapper class's object used for using differenct methods in it's class to read a json file and write into the same
 * it's constructor calls the readPhoneJsonFile method
 * provides implementation for both readRealJsonFile and writeRealJsonFile which will then read a json file into an AL and write into a json file from an AL
 *
 * there's a read method that helps to convert all the json node in the json file passed to an app_phone object and these are added to the real_phone AL
 * there's a write method that takes a real_phone arr and the file path as the parameter and then the real_phone objects are converted to json node
 * implementation of displayable interface
 * we have to define body of muliple setters and getters
 * first line to display-first line which will be displayed will be passed as parameter into getlines method(setters and getters)
 * last line to display-last line which will be displayed will be passed as parameter into getlines method(setters and getters)
 * line to highlight-we set a particular integer of our choice which will be used to access the object at respective position in phone
 * lines being displayed-decided by first and last lines to display
 * interface abstract methods
 * getline-helps to get data at line at respective index in real_phone AL and store those values in app_details AL

 * getlines-helps to get data at lines between(first and last index)in real_phone AL and store those values in app_subset AL
 * getheaders-an AL is made out of all the name of inst vars of app_phone class
 * gettable-returns real_phone AL
 */

public class Manage_Real_Phone extends File_Handling_real_phone implements Displayable {



    ArrayList<apps> real_json = new ArrayList<apps>();

    ArrayList<phone> phone = new ArrayList<phone>();


//this isnt wriiten into the json
    ArrayList<app_phone> real_phone = new ArrayList<app_phone>();

    ArrayList<real_json> real_json1 = new ArrayList<real_json>();

    managePhone mp=new managePhone();
    manageApp ma=new manageApp();


    ObjectMapper objectMapper = new ObjectMapper();

    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    int highlightedLine;

    public Manage_Real_Phone(){
        manageApp ma = new manageApp();
        real_json = ma.getTable();
        managePhone mp = new managePhone();
        phone = mp.getTable();
        readRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json");
    }
    @Override
    public ArrayList<app_phone> readRealJsonFile(String file_path) {
        try {
            manageApp ma = new manageApp();
            real_json = ma.getTable();//write just writes into json file and in menudriven it has updated the respective class file so in case of any change in real_json is only d
            managePhone mp = new managePhone();
            phone = mp.getTable();

            JsonNode rootNode = objectMapper.readTree(new File(file_path));

            // Iterate through JSON array
            if (rootNode.isArray()) {

                real_json1.clear();

                real_phone.clear();
                int p=0;
                for (JsonNode node : rootNode) {

                    int price = node.get("price").asInt();
                    String imei = node.get("imei").asText();


                    apps a_temp_obj = null;
                    phone p_temp_obj = null;

                    String app_name=real_json.get(p).getApp_name();
                    String phone_company=phone.get(p).getPhone_company();
                    a_temp_obj=real_json.get(p);
                    p_temp_obj=phone.get(p);
                    real_json rj_temp=new real_json(imei,price,phone_company,app_name);
                    real_json1.add(rj_temp);
                    app_phone ap_temp = new app_phone(a_temp_obj,p_temp_obj,price,imei);
                    real_phone.add(ap_temp);
                    p++;


                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return real_phone;
    }
    public void writeRealJsonFile(String file_path, ArrayList<app_phone> real_al) throws IOException {


        ArrayList<ArrayList<String>> real_to_be_written = new ArrayList<ArrayList<String>>();
        real_to_be_written.clear();
        ArrayList<real_json> row = new ArrayList<real_json>();
        row.clear();



        for(int i = 0; i < real_al.size(); i++)
        {
//            System.out.println(real_al.size());
            String p_comp = real_al.get(i).getP_temp().getPhone_company();
            String a_name = real_al.get(i).getA_temp().getApp_name();
            String imei = real_al.get(i).getImei();
            int price = real_al.get(i).getPrice();

            real_json obj=new real_json(imei,price,p_comp,a_name);
            row.add(obj);
        }
        Object[] arr=real_to_be_written.toArray();
        objectMapper.writeValue(Paths.get("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json").toFile(), row);



    }
    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList<String>();
        headers.add("app_obj");
        headers.add("phone_obj");
        headers.add("price");
        headers.add("imei");

        return headers;
    }



    @Override
    public ArrayList<String> getLine(int line) {
        ArrayList<String> app_details = new ArrayList<String>();


        app_details.add(real_json1.get(line).getApp_name());
        app_details.add(real_json1.get(line).getPhone_company());
        app_details.add(String.valueOf(real_json1.get(line).getPrice()));
        app_details.add(real_json1.get(line).getImei());

//        System.out.println(real_json.get(real_json1.size()-1).getApp_name()+" "+real_json1.get(real_json1.size()-1).getPhone_company()+" "+real_json1.get(real_json1.size()-1).getImei()+" ");



        return app_details;
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> app_subset = new ArrayList<ArrayList<String>>();
        app_subset.clear();

        for (int i = firstLine; i <lastLine; i++) {
            app_subset.add(getLine(i));
        }
        app_subset.add(getLine(lastLine));
        return app_subset;
    }

    @Override
    public int getFirstLineToDisplay(){return firstLineIndex;
    }

    @Override
    public int getLineToHighlight() {
        return highlightedLine;
    }

    @Override
    public int getLastLineToDisplay() {

        setLastLineToDisplay(getFirstLineToDisplay() + getLinesBeingDisplayed() - 1);
        return lastLineIndex;
    }

    @Override
    public int getLinesBeingDisplayed() {
        return linesBeingDisplayed;
    }

    @Override
    public void setFirstLineToDisplay(int firstLine) {
        this.firstLineIndex = firstLine;
    }

    @Override
    public void setLineToHighlight(int highlightedLine) {
        this.highlightedLine = highlightedLine;
    }

    @Override
    public void setLastLineToDisplay(int lastLine) {
        this.lastLineIndex = lastLine;
    }

    @Override
    public void setLinesBeingDisplayed(int numberOfLines) {
        this.linesBeingDisplayed = numberOfLines;
    }

    public ArrayList<app_phone> getTable() {
        readRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json");
        return real_phone;
    }

    public void addNewAppPhone(String app_name,String app_operating_system,String app_security,boolean app_voicesearch,float app_battery_usage, String imei, int price,int phone_model, String phone_company,String sim,String microprocessor,boolean internet) throws IOException {



        readRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json");
        apps temp_apps=new apps(app_name,app_operating_system,app_voicesearch,app_battery_usage,app_security);
        real_json.add(temp_apps);

        phone temp_phone=new phone(sim,microprocessor,internet,phone_model,phone_company);
        phone.add(temp_phone);

        real_phone.add(new app_phone(temp_apps,temp_phone,price,imei));
        System.out.println("CURRENT SIZE OF AP ARRAY"+" "+real_phone.size());



        writeRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json", real_phone);

        ma.writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\real_json.json",real_json);
        mp.writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone);
    }

    public void editNewAppPhone(int edit_AppPhone_idx,int phone_model,String phone_company,String sim,String microprocessor,boolean internet,String app_name,String app_operating_system,boolean app_voicesearch,float app_battery_usage,String app_security) throws IOException {
        readRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json");
        real_phone.get(edit_AppPhone_idx).p_temp.setPhone_model(phone_model);
        real_phone.get(edit_AppPhone_idx).p_temp.setPhone_company(phone_company);
        real_phone.get(edit_AppPhone_idx).p_temp.setSim(sim);
        real_phone.get(edit_AppPhone_idx).p_temp.setMicroprocessor(microprocessor);
        real_phone.get(edit_AppPhone_idx).p_temp.setInternet(internet);

        real_phone.get(edit_AppPhone_idx).a_temp.setApp_name(app_name);
        real_phone.get(edit_AppPhone_idx).a_temp.setApp_security(app_security);
        real_phone.get(edit_AppPhone_idx).a_temp.setApp_operating_system(app_operating_system);
        real_phone.get(edit_AppPhone_idx).a_temp.setApp_voicesearch(app_voicesearch);
        real_phone.get(edit_AppPhone_idx).a_temp.setApp_battery_usage(app_battery_usage);

        real_json.get(edit_AppPhone_idx).setApp_battery_usage(app_battery_usage);
        real_json.get(edit_AppPhone_idx).setApp_voicesearch(app_voicesearch);
        real_json.get(edit_AppPhone_idx).setApp_security(app_security);
        real_json.get(edit_AppPhone_idx).setApp_name(app_name);
        real_json.get(edit_AppPhone_idx).setApp_operating_system(app_operating_system);

        phone.get(edit_AppPhone_idx).setPhone_model(phone_model);
        phone.get(edit_AppPhone_idx).setPhone_company(phone_company);
        phone.get(edit_AppPhone_idx).setInternet(internet);
        phone.get(edit_AppPhone_idx).setSim(sim);
        phone.get(edit_AppPhone_idx).setMicroprocessor(microprocessor);

        ma.writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json",real_json);
        mp.writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone);
        writeRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json",real_phone);
    }

    public void deleteAppPhone(int edit_AppPhone_idx) throws IOException {
        if (real_phone.size()>5){
        readRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json");
        real_phone.remove(edit_AppPhone_idx);
        writeRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json",real_phone);
        real_json.remove(edit_AppPhone_idx);
        phone.remove(edit_AppPhone_idx);
        ma.writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json",real_json);
        mp.writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone);}
        else {
            System.out.println("NOT POSSSIBLE");
        }
    }
    public void deletePhone(int edit_Phone_idx) throws IOException{
        if (phone.size()>5){
            readRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json");
            ma.readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");
            mp.readPhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json");
            real_phone.remove(edit_Phone_idx);
            writeRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json",real_phone);


            phone.remove(edit_Phone_idx);
            mp.writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone);

            real_json.remove(edit_Phone_idx);
//            real_phone.remove(edit_Phone_idx);
//            writeRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json",real_phone);
            ma.writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json",real_json);
        }
        else {

            System.out.println("NOT POSSSIBLE");
        }
    }

    public void deleteApp(int edit_Phone_idx) throws IOException{
        if (real_json.size()>5){
            readRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json");
            ma.readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");
            mp.readPhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json");
            real_phone.remove(edit_Phone_idx);

//            real_json.remove(edit_Phone_idx);
            writeRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json",real_phone);
            real_json.remove(edit_Phone_idx);

            ma.writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json",real_json);

            phone.remove(edit_Phone_idx);
//            real_phone.remove(edit_Phone_idx);
//            writeRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json",real_phone);
            mp.writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone);
        }
        else {
            System.out.println("NOT POSSSIBLE");
        }
    }


    public void addapp(String app_name, String app_OS, boolean app_vsc, float app_batt_usage, String app_security) throws IOException {
        readRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json");
        phone phone1=new phone("null","null",false,0,"null");
        phone.add(phone1);
        mp.writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone);

        apps app1=new apps(app_name,app_OS,app_vsc,app_batt_usage,app_security);
        app_phone ap=new app_phone(app1,phone1,0,"null");
        real_phone.add(ap);

        writeRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json",real_phone);


    }
    public void addphone(int phone_model, String phone_company,String sim,String microprocessor,boolean internet) throws IOException {
        readRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json");
        apps app1=new apps("null","null",false,0,"null");
        real_json.add(app1);
        ma.writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json",real_json);

        phone phone1=new phone(sim,microprocessor,internet,phone_model,phone_company);
        app_phone ap=new app_phone(app1,phone1,0,"null");
        real_phone.add(ap);

        writeRealJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\real_phone\\real.json",real_phone);


    }





}

