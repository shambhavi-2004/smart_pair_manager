package Model.phones;

public interface phone_additional {
    /**
     * Identification comments:
     *   Name: shambhavi patil
     *   Experiment No: 05
     *   Experiment Title: phone_additional
     *   Experiment Date: 12-02-2024
     *   @version 1.0
     *
     *
     * Beginning comments:
     * Filename: phone_additional.java
     * @author:  shambhavi patil
     * Overview: This is the app-outcome interface . In this file we have achieved the following
     *  methods present
     *     void add_differentiation_feature(String outcome);//adding phone differentiation feature
     *     void remove_differentiation_feature(int objective_no);//remove phone differentiation feature
     *     void display_differentiation_feature();//displaying all phone's differentiation feature
     *     void add_review(String outcome);//adding phone review
     *     void remove_review(int outcome_no);//removing phone review
     *     void display_review();//displaying all phone's review
     *  any class which will implement this interface ,will have to implement these methods
     */
    void add_differentiation_feature(String outcome);
    void remove_differentiation_feature(int objective_no);
    void display_differentiation_feature();
    void add_review(String outcome);
    void remove_review(int outcome_no);
    void display_review();

}
