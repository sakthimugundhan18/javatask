import java.io.*;
import java.util.*;


class task2

{
  public static void main (String[]args)

   {
    
    System.out.println("enter your values");
    Scanner s=new Scanner(System.in);

   
    System.out.println("enter your boys ratio");
    int boysratio=s.nextInt();

    System.out.println("enter your girl ratio");
    int girlsratio=s.nextInt();
   
    System.out.println("enter total students count");
    int totalcount=s.nextInt();

    int boys=(boysratio*totalcount)/(boysratio+girlsratio);
    int girls=(girlsratio*totalcount)/(boysratio+girlsratio);

    System.out.println("no of boys="+boys);
    System.out.println("no of girls="+girls);

   }
}

    
 
    
    