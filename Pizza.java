import java.util.Scanner;

public class PizzaSlices {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      
      System.out.print("Enter total number of slices of pizza : ");
      int totalSlices = scnr.nextInt();
      
      System.out.print("Enter the number of people : ");
      int numberOfPeople = scnr.nextInt();
      
    
      int slicesPerPerson = 0;
      int slicesLeftOver = 0;
      
     
      slicesPerPerson = totalSlices / numberOfPeople;
      
     
      slicesLeftOver = (totalSlices % numberOfPeople);
      
      
      System.out.println("Number of slices each person will get : " + slicesPerPerson);
         
  
      System.out.println("Number of slices left over : " + slicesLeftOver);
   }
}
