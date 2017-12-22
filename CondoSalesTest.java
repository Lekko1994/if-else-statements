import java.util.Scanner;
public class CondoSalesTest
{
public static void main(String []args)
   {
   System.out.println("what condo would you like to purchase?");
   System.out.println("1. condo with park view");
   System.out.println("2. condo with golf course view");
   System.out.println("3. condo with lake view");
   // it prints out options for a buyer
   Scanner input1= new Scanner(System.in);
   int number = input1.nextInt();
   // it takes input from buyer in the integer form
   CondoSalesMethods priceCalc=new CondoSalesMethods();
   priceCalc.condoPrice(number);
   // it allows to use the method I created in "CondoSalesMethods.java"
   System.out.println("Which parking option would you like?");
   System.out.println("1.Garage");
   System.out.println("2. Parking space");
   // now we ask buyer what parking option they would like
   Scanner input2=new Scanner(System.in);
   int number2=input2.nextInt();
   // we take the second input of buyer for parking
   priceCalc.parkingPrice(number2);
   //it allows to use the method from "CondoSalesMethods.java"
   }
}