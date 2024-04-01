package Model.real_phone;


import java.io.IOException;
import java.util.ArrayList;
/**
 * Identification comments:
 *   Name: shambhavi patil
 *   Experiment No: 07
 *   Experiment Title: FileHandling
 *   Experiment Date: 12-02-2024
 *   @version 1.0
 *
 *
 *
 * Beginning comments:
 * Filename: File_Handling_real_phone .java
 * @author:  shambhavi patil
 * Overview: This is the File_Handling_real_phone abstract class has some abstract methods .
 * contains 2 abstract methods which will be implemented in some other class .
 * readRealJsonFile - will be used for reading real.json file(implementation in other class)
 * writeRealJsonFile - will be used for writing real.json file into an arraaylist(implementation in other class)

 */

public abstract class File_Handling_real_phone {
    public abstract ArrayList<app_phone> readRealJsonFile(String file_path);

    public abstract void writeRealJsonFile(String file_path, ArrayList<app_phone> real) throws IOException;
}