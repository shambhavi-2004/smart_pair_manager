package Model.phones;

public class phone_template {
    /**
     * Identification comments:
     *   Name: shambhavi patil
     *   Experiment No: 04
     *   Experiment Title: phones
     *   Experiment Date: 23-01-2024
     *   @version 1.0
     *
     *
     * Beginning comments:
     * Filename: phone_template.java
     * @author:  shambhavi patil
     * Overview: This is the phone_template class used to created objects for phone_template Class . In this file we have achieved the following
     * - declaring variables in a class
     * - int template_count;
     * - int temp_id;
     * - String sim;
     * - String microprocessor;
     * - boolean internet;
     * - this is a parent class for phone class.
     * -performing constructor overloading-constructor overloading can be defined as the concept of having more than one constructor with different parameters so that every constructor can perform a different task.
     * -for setting the value of an attribute created for an object
     * -creating getters
     * -for accessing values of an attribute of a particular object
     * -created display function (which calls the all the getters in the class) to display instance data
     */
    private static int template_count = 0;
    int temp_id;
    String sim;
    String microprocessor;
    boolean internet;

    public phone_template() {
        setTemplate_count((getTemplate_count()+1));
        this.temp_id = getTemplate_count();
    }

    public phone_template(String sim, String microprocessor, boolean internet) {
        setTemplate_count((getTemplate_count()+1));
        this.temp_id = getTemplate_count();
        this.sim = sim;
        this.microprocessor = microprocessor;
        this.internet = internet;
    }

    public phone_template(int temp_id, String sim, String microprocessor, boolean internet) {
        this.temp_id = temp_id;
        this.sim = sim;
        this.microprocessor = microprocessor;
        this.internet = internet;
    }

    public static int getTemplate_count() {
        return template_count;
    }

    public static void setTemplate_count(int template_count) {
        phone_template.template_count = template_count;
    }

    public int getTemp_id() {
        return temp_id;
    }

    public void setTemp_id(int temp_id) {
        this.temp_id = temp_id;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getMicroprocessor() {
        return microprocessor;
    }

    public void setMicroprocessor(String microprocessor) {
        this.microprocessor = microprocessor;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }
    void display(){
        System.out.println(getMicroprocessor()+" "+getSim()+" "+isInternet());
    }
}
