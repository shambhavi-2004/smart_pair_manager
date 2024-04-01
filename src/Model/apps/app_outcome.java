package Model.apps;

public interface app_outcome {
    /**
     * Identification comments:
     *   Name: shambhavi patil
     *   Experiment No: 05
     *   Experiment Title: apps_outcome
     *   Experiment Date: 12-02-2024
     *   @version 1.0
     *
     *
     * Beginning comments:
     * Filename: app_outcome.java
     * @author:  shambhavi patil
     * Overview: This is the app-outcome interface . In this file we have achieved the following
     *  methods present
     *  void add_app_goals(String objective);//setting app goals
     *  void remove_app_goals(int objective_no);//remove app goals
     *  void display_app_goals();//displaying all app's goals
     *  void add_app_mark_str(String outcome);//setting app marketing strategy
     *  void remove_app_mark_str(int outcome_no);//remove app marketing strategy
     *  void display_app_mark_str();//displaying all app's marketing strategy
     *  any class which will implement this interface ,will have to implement these methods
     */
    void add_app_goals(String objective);
    void remove_app_goals(int objective_no);
    void display_app_goals();

    void add_app_mark_str(String outcome);
    void remove_app_mark_str(int outcome_no);
    void display_app_mark_str();


}
