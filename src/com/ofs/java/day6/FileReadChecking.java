
package com.ofs.java.day6;
import java.io.*;
import java.util.Scanner;
public class FileReadChecking {

   public static void main(String args[])throws IOException {
      File file = new File("Hello1.txt");
      
      
      // creates the file
      file.createNewFile();
      
      // creates a FileWriter Object
      FileWriter writer = new FileWriter(file); 
      
      System.out.println("ENTER THE CONTENTS OF THE FILE");
      Scanner in = new Scanner(System.in); 
      String s;
      s = in.nextLine();
      // Writes the content to the file
      writer.write(s); 
      writer.flush();
      writer.close();

      // Creates a FileReader Object
      FileReader fr = new FileReader(file); 
      char [] a = new char[50];
      fr.read(a);   // reads the content to the array
      
      for(char c : a)
         System.out.print(c);   // prints the characters one by one
      fr.close();
   }

}