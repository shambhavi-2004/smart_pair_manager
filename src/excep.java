/**
 * Identification comments:
 *   Name: shambhavi patil
 *   Experiment No: 08
 *   Experiment Title: excep
 *   Experiment Date: 12-03-2024
 *   @version 1.0
 *
 *
 *
 * Beginning comments:
 * Filename: excep .java
 * @author:  shambhavi patil
 * Overview: This is the excep  class which extends the class Exception .
 * it overrides the method getMessage and passes its own implementation
 */
public class excep extends Exception{
    @Override
    public String getMessage() {
        return "an error has occurred now default value will be set";
    }
}
