import java.io.*;

class task1
  {
   public static void main(String []args)
 {
     int selling_price=1450;
     int buying_price=800;

     int profitpercent=(selling_price-buying_price);
     System.out.println("profit :"+profitpercent);

     int percent = (profitpercent*100)/selling_price;
     System.out.println(percent+"%");
  }
   
   }