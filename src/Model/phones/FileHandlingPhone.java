package Model.phones;

import java.io.IOException;
import java.util.ArrayList;
/**
 * Identification comments:
 *   Name: shambhavi patil
 *   Experiment No: 05
 *   Experiment Title: FileHandling
 *   Experiment Date: 12-02-2024
 *   @version 1.0
 *
 *
 *
 * Beginning comments:
 * Filename: FileHandlingPhone .java
 * @author:  shambhavi patil
 * Overview: This is the FileHandlingPhone abstract class has some abstract methods .
 * contains 2 abstract methods which will be implemented in some other class .
 * readPhoneJsonFile - will be used for reading phone.json file(implementation in other class)
 * writePhoneJsonFile - will be used for writing phone.json file into an arraaylist(implementation in other class)

 */


public abstract class FileHandlingPhone {
    protected abstract ArrayList<phone> readPhoneJsonFile(String file_path);
    protected abstract void writePhoneJsonFile(String file_path, ArrayList<phone> students) throws IOException;
}
