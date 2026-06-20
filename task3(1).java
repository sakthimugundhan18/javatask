import java.io.*;
import java.util.*;
 
class task3(1)

{  
  public static void main (String[]args)

   {
    System.out.println("I FIND YOUR FAV TEAM & PLAYER IN IPL");
    Scanner s=new Scanner(System.in);

    System.out.println("ENTER YOUR TEAM");
    String team=s.next();

    System.out.println("ENTER YOUR PLAYER");
    String player=s.next();

 
    if(team.equals("RCB") && player.equals("KOHLI") || (team.equals("CSK") && player.equals("DHONI")))
      { 
        System.out.println("YAH!! ITS YOUR FAV TEAM & AND PLAYER");
      }
    else
        {
         System.out.println("OOPS SORRY THIS IS NOT YOUR FAV TEAM AND PLAYER");
        }
   }
}