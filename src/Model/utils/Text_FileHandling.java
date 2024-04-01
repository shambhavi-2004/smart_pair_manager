package Model.utils;

import java.io.*;

public class Text_FileHandling {
    /**
     * Identification comments:
     *   Name: shambhavi patil
     *   Experiment No: 05
     *   Experiment Title: text_filehandling
     *   Experiment Date: 12-02-2024
     *   @version 1.0
     *
     *
     * Beginning comments:
     * Filename: text_Filehandling.java
     * @author:  shambhavi patil
     * Overview: This is the app-outcome interface . In this file we have achieved the following
     * -created new text file(newfile.txt)
     * -written into 2 text files(newfile.txt and yes.txt)
     * -reading two text files(newfile.txt and yes.txt)
     */
    public static void main(String[] args) {
        //creating a new file
        try{
            File fl=new File("newfile.txt");
            if (fl.createNewFile()){
                System.out.println("file was created as it didn't exist at first");
            }
            else {
                System.out.println("file already exists");
            }
            File fl2=new File("yes.txt");
            if (fl2.createNewFile()){
                System.out.println("file was created as it didn't exist at first");
            }
            else {
                System.out.println("file already exists");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        //writing in the new file as well as into the already existing file
        //writing in new file
        try(FileWriter fw=new FileWriter("newfile.txt")){
            fw.write("Guten Morgen\n");
            fw.write("buen día\n");
            fw.write("おはよう\n");

        }catch (IOException e){
            e.printStackTrace();
        }

        //writing in already existing file
        try(FileWriter fw=new FileWriter("yes.txt")){
            fw.write("Guten Abend\n");
            fw.write("buenas noches\n");
            fw.write("こんばんは\n");

        }catch (IOException e){
            e.printStackTrace();
        }

        //reading new file as well as already existing file
        try(BufferedReader bfr=new BufferedReader(new FileReader("newfile.txt"))){
            while(bfr.ready()){
                System.out.println(bfr.readLine());
            }

        }catch (IOException e){
            System.out.println("an error has occured");
            e.printStackTrace();
        }

        try(BufferedReader bfr=new BufferedReader(new FileReader("yes.txt"))){
            while(bfr.ready()){
                System.out.println(bfr.readLine());
            }

        }catch (IOException e){
            System.out.println("an error has occured");
            e.printStackTrace();
        }


    }
}
