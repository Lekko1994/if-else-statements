public class CondoSalesMethods
{
int price = 0;
// the first method "condoPrice" is to calculate the price for condo only
public void condoPrice (int number)
   {
   if (number==1)//if user input 1
      {
      System.out.print("Condo with park view for 150 000 dollars");
      price=150000; //the change of the price (for condo) integer
  
      }
   else if (number==2)//if user input 2
      {
      System.out.println("Condo with gold course view for 170 000");
      price=170000; //the change of the price integer
   
      }
   else if(number==3)//if user input 3
      {
      System.out.println("Condo with lake view for 210 000");
      price=210000;// the change of the price integer
      
      }
   else //if user input any other number (other than 1,2,3)
      {
   
      System.out.println("invalid");
      price=0;
      }

   }

//the second method is to add/not add the price for parking
public void parkingPrice(int number2)
   {
   if (number2==1)// if user second input is 1
      {
      price=price+5000;
      System.out.println(price);
      }
   else// if user input is not 1
      {
      System.out.println(price);
      }
   }
}


