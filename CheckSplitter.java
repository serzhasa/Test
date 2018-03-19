//Dividing the check between x amount of people 
//Adding 20% of tip for the waiter

public class CheckSplitter{

   public static double checkSplit(int people, double price){
      double result;
      
      result = price / people;
      return result;
         
   }

   public static void main(String[] args){
      double my_part=checkSplit(10, 100);
      System.out.println("Each one pays: " + my_part);

   }

}