package Model.phones;

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
 *   Experiment No: 05
 *   Experiment Title: phones
 *   Experiment Date: 12-02-2024
 *   @version 1.0
 *
 *
 *
 * Beginning comments:
 * Filename: managePhone.java
 * @author:  shambhavi patil
 * Overview: This is the managePhone classimplementing displayable and Filehandling phone abstract class.
 * has a AL phone and an objectmapper class's object used for using differenct methods in it's class to read a json file and write into the same
 * it's constructor calls the readPhoneJsonFile method
 * provides implementation for both readPhoneJsonFile and writePhoneJsonFile which will then read a json file into an AL and write into a json file from an AL
 * implementation of displayable interface
 * we have to define body of muliple setters and getters
 * first line to display-first line which will be displayed will be passed as parameter into getlines method(setters and getters)
 * last line to display-last line which will be displayed will be passed as parameter into getlines method(setters and getters)
 * line to highlight-we set a particular integer of our choice which will be used to access the object at respective position in phone
 * lines being displayed-decided by first and last lines to display
 * interface abstract methods
 * setphonetable-parameter passed is an AL having phone objects and ref var phone points to that AL
 * getline-helps to get data at line at respective index in phone AL and store those values in phone_details AL

 * getlines-helps to get data at lines between(first and last index)in phone AL and store those values in phone_subset AL
 * getheaders-an AL is made out of all the name of inst vars of phone class
 * getphonetable-returns AL created having  String Al as elements
 */

public class managePhone extends FileHandlingPhone implements Displayable {

    ArrayList<phone> phone = new ArrayList<phone>();

    ObjectMapper objectMapper = new ObjectMapper();

    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    int highlightedLine;

    public managePhone(){
        readPhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json");
    }
    public ArrayList<phone> readPhoneJsonFile(String file_path)
    {
        try {

            JsonNode rootNode = objectMapper.readTree(new File(file_path));

            // Iterate through JSON array
            if (rootNode.isArray()) {
                phone.clear();
                for (JsonNode node : rootNode) {
                    String sim = node.get("sim").asText();
                    String microprocessor = node.get("microprocessor").asText();
                    boolean internet = node.get("internet").asBoolean();
                    int phone_model = node.get("phone_model").asInt();
                    String phone_company = node.get("phone_company").asText().toUpperCase();
                    phone phone1 = new phone(sim,microprocessor,internet,phone_model,phone_company);
                    phone.add(phone1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return phone;
    }
    public void writePhoneJsonFile(String file_path, ArrayList<phone> phones) throws IOException {
        objectMapper.writeValue(Paths.get("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json").toFile(), phones);
    }

    public void setPhoneTable(ArrayList<phone> phoneArrayList) {
        this.phone = phoneArrayList;
    }

    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList<String>();
        headers.add("sim");
        headers.add("microprocessor");
        headers.add("internet");
        headers.add("phone_model");
        headers.add("phone_company");

        return headers;
    }
    @Override
    public ArrayList<String> getLine(int line) {
        ArrayList<String> phone_details = new ArrayList<String>();

        phone_details.add(phone.get(line).getSim());
        phone_details.add(phone.get(line).getMicroprocessor());
        phone_details.add(String.valueOf(phone.get(line).isInternet()));
        phone_details.add(String.valueOf(phone.get(line).getPhone_model()));
        phone_details.add(phone.get(line).getPhone_company());




        return phone_details;
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> phone_subset = new ArrayList<ArrayList<String>>();

        for (int i = firstLine; i <= lastLine; i++) {
            phone_subset.add(getLine(i));
        }
        return phone_subset;
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

    public ArrayList<phone> getTable() {
        readPhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json");
        return phone;
    }
    public void addNewPhone(int phone_model, String phone_company, String sim, String microprocessor, boolean internet) throws IOException {
        readPhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json");
        phone temp_phone = new phone(sim,microprocessor,internet,phone_model,phone_company);
        phone.add(temp_phone);
        writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone);

    }
    public void editNewPhone(int edit_phone_idx,int phone_model,String phone_company,String sim,String microprocessor,boolean internet) throws IOException {
        readPhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json");
        phone.get(edit_phone_idx).setPhone_model(phone_model);
        phone.get(edit_phone_idx).setPhone_company(phone_company);
        phone.get(edit_phone_idx).setSim(sim);
        phone.get(edit_phone_idx).setMicroprocessor(microprocessor);
        phone.get(edit_phone_idx).setInternet(internet);


        writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone);
    }

    public void deletePhone(int edit_phone_idx) throws IOException {
        readPhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json");
        phone.remove(edit_phone_idx);
        writePhoneJsonFile("C:\\Users\\shambhavi\\IdeaProjects\\pcc\\src\\Model\\phones\\phone.json",phone);
    }



}
