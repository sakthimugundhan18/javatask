import java.io.*;
import java.util.*;
 
class task4

{
 public static void main(String[] args)

  {
   System.out.println("wlcome to the board");
   Scanner s=new Scanner(System.in);

   System.out.println("Enter your Ticket-number");
   int number=s.nextInt();

   System.out.println("enter your color name");
   String color=s.next();

   System.out.println("enter your country name");
   String country=s.next();

      if(number==1000 && color.equals("black") && country.equals("india"))
         {
          System.out.println("Welcome to india buddy");
          }
      else if(number==2000 && color.equals("red") && country.equals("america"))
         {
          System.out.println("Welcome to amarica buddy");
          }
      else if(number==3000 && color.equals("orange") && country.equals("dubai"))
         {
          System.out.println("welcome to dubai habbibi");
          }
      else
         {
          System.out.println("oops sorry invalid details");
          }
    }

}
