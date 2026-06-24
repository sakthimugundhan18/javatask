import java.io.*;
import java.util.*;

class task6

{
  public static void main(String[] args)

   {
     System.out.println("enter your opinion:");
     Scanner s=new Scanner(System.in);
     String input=s.next();

     while(input.equals("yes"))
      {
        System.out.println("continue the page...");
        input=s.next();
        }
      System.out.println("Thank you for visiting...");
    }

}