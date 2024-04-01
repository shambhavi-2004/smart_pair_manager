package Model.apps;


import Model.real_phone.Manage_Real_Phone;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import Model.Displayable;


import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
/**
 * Identification comments:
 *   Name: shambhavi patil
 *   Experiment No: 06
 *   Experiment Title: manageapps
 *   Experiment Date: 03-03-2024
 *   @version 1.0
 *
 *
 *
 * Beginning comments:
 * Filename: manageApp.java
 * @author:  shambhavi patil
 * Overview: This is the manageAPP classimplementing displayable and FilehandlingApps abstract class.
 * has a AL apps and an objectmapper class's object used for using differenct methods in it's class to read a json file and write into the same
 * it's constructor calls the readAppsJsonFile method
 * provides implementation for both readAppsJsonFile and writeAppsJsonFile which will then read a json file into an AL and write into a json file from an AL
 * implementation of displayable interface
 * we have to define body of multiple setters and getters
 * first line to display-first line which will be displayed will be passed as parameter into getlines method(setters and getters)
 * last line to display-last line which will be displayed will be passed as parameter into getlines method(setters and getters)
 * line to highlight-we set a particular integer of our choice which will be used to access the object at respective position in apps
 * lines being displayed-decided by first and last lines to display
 *
 * interface abstract methods
 * setphonetable-parameter passed is an AL having apps objects and ref var phone points to that AL
 * getline-helps to get data at line at respective index in apps AL and store those values in app_details AL

 * getlines-helps to get data at lines between(first and last index)in apps AL and store those values in app_subset AL
 * getheaders-an AL is made out of all the name of inst vars of apps class
 * getphonetable-returns AL created having  String Al as elements
 */


public class manageApp extends FileHandlingApps implements Displayable {

    ArrayList<apps> apps = new ArrayList<apps>();



    ObjectMapper objectMapper = new ObjectMapper();

    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    int highlightedLine;

    public manageApp() {
        readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");
    }

    public ArrayList<apps> readAppsJsonFile(String file_path) {

        try {//JSON's primary use is transfering objects over the network in a compact format.
            //for getting particular fields(elements) from that json file
            //Use the readTree() method of the ObjectMapper class to get the root node of the JSON tree.
            JsonNode rootNode = objectMapper.readTree(new File(file_path));
            // Iterate through JSON array
            if (rootNode.isArray()) {
                apps.clear();
                for (JsonNode node : rootNode) {
                    String app_name = node.get("app_name").asText();
                    String OS = node.get("app_operating_system").asText();
                    boolean vsc = node.get("app_voicesearch").asBoolean();
                    float battery = node.get("app_battery_usage").asLong();
                    String app_security = node.get("app_security").asText();
                    apps apps1 = new apps(app_name, OS.toUpperCase(), vsc, battery, app_security);
                    apps.add(apps1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return apps;
    }

    public void writeAppsJsonFile(String file_path, ArrayList<apps> apps) throws IOException {

//        System.out.println("Successfully updated the apps JSON file.");
        objectMapper.writeValue(Paths.get("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json").toFile(), apps);
    }


    public void setAppsTable(ArrayList<apps> appArrayList) {
        this.apps = appArrayList;
    }

    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList<String>();
        headers.add("app_name");
        headers.add("app_os");
        headers.add("voice_search");
        headers.add("battery");
        headers.add("app_security");

        return headers;
    }

    @Override
    public ArrayList<String> getLine(int line) {
        ArrayList<String> app_details = new ArrayList<String>();

        app_details.add(apps.get(line).getApp_name());
        app_details.add(apps.get(line).getApp_operating_system());
        app_details.add(String.valueOf(apps.get(line).getApp_voicesearch()));
        app_details.add(String.valueOf(apps.get(line).getApp_battery_usage()));
        app_details.add(apps.get(line).getApp_security());

        return app_details;
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> app_subset = new ArrayList<ArrayList<String>>();

        for (int i = firstLine; i <= lastLine; i++) {
            app_subset.add(getLine(i));
        }
        return app_subset;
    }

    @Override
    public int getFirstLineToDisplay() {
        return firstLineIndex;
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

    public ArrayList<apps> getTable() {
        readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");
        return apps;
    }

    public void addNewApp(String app_name, String app_OS, boolean app_vsc, float app_batt_usage, String app_security) throws IOException {
        readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");
        apps temp_app = new apps(app_name, app_OS, app_vsc, app_batt_usage, app_security);
        apps.add(temp_app);

        writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json", apps);
        readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");



    }
    public void editNewApp(int edit_app_idx,String app_name,String app_operating_system,boolean app_voicesearch,float app_battery_usage,String app_security) throws IOException {
        readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");
        apps.get(edit_app_idx).setApp_name(app_name);
        apps.get(edit_app_idx).setApp_security(app_security);
        apps.get(edit_app_idx).setApp_operating_system(app_operating_system);
        apps.get(edit_app_idx).setApp_voicesearch(app_voicesearch);
        apps.get(edit_app_idx).setApp_battery_usage(app_battery_usage);

        writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json",apps);
    }

    public void deleteApp(int edit_app_idx) throws IOException {
        readAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json");
        apps.remove(edit_app_idx);
        writeAppsJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\apps\\app.json",apps);


    }
}
