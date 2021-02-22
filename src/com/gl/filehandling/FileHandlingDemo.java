package com.gl.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileHandlingDemo {

  public static void main(String[] args) throws IOException {

    /**
     * We are planning to write the code to write somethig to an external file
     */
//
//    File file  = new File("myFile.txt");
//
//    FileWriter fileWriter = new FileWriter(file,true);
//
//    fileWriter.write("This is my first statement written in Java to a file");
//
//    fileWriter.flush();
//
//    fileWriter.close();

    /**
     * Reading the data from the external file
     *
     * myFile.txt
     */

    File file  = new File("myFile.txt");

    FileReader fileReader = new FileReader(file);

    int myChar = -1;
    while((myChar = fileReader.read()) != -1){
      System.out.print((char)myChar);
    }

    System.out.println();


  }
}
