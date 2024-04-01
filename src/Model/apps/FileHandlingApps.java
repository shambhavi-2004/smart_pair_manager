package Model.apps;

import java.io.IOException;
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
 * Overview: This is the FileHandlingApps abstract class has some abstract methods .
 * contains 2 abstract methods which will be implemented in some other class .
 * readAppsJsonFile - will be used for reading apps.json file(implementation in other class)
 * writeAppsJsonFile - will be used for writing apps.json file into an arraylist(implementation in other class)

 */


public abstract class FileHandlingApps {
    protected abstract ArrayList<apps> readAppsJsonFile(String file_path);
    protected abstract void writeAppsJsonFile(String file_path, ArrayList<apps> students) throws IOException;
}
