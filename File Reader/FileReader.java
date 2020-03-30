// Author: Matt Lorenzo and John Olson
// Date: 3/23/2020
// Exercise: Chapter 15 Ex 7
import java.util.Scanner;
import java.io.*;
public class FileReader
{
   private int rows, cols;
   private char pic[][];
   
   public FileReader(String file)
   {
      File f = new File(file);
      Scanner input = null;
      try
      {
         input = new Scanner(f);
      }
      catch(FileNotFoundException ex)
      {
         System.out.println("*** Cannot Open " + file + " ***");
         System.exit(1);
      }
      rows = input.nextInt();
      cols = input.nextInt();
      pic = new char[rows][cols];
      
   }
   
   public String toString()
   {
      String result = "";
      for(int row = 0; row < rows; row++)
      {
         for(int col = 0; col < cols; col++)
         {
            result += pic[row][col];
         }
         result += '\n';
      }
      return result;
   }
   
   
   
   
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      
   }
}