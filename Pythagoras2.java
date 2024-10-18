import java.util.*;

class Pythagoras2{

  public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //request user to enter altitude
          System.out.println("Enter the altitude (a): ");
            int altitude =sc.nextInt(); //input altitude
        //request user to enter base
          System.out.print("Enter the base (b): ");
            int base = sc.nextInt();  // Input base

       
        Pythagoras1 myObj = new Pythagoras1(altitude, base); // Example values for a and b
        myObj.calculateHypotenuse();  // Calculate the hypotenuse
        myObj.display();  // Display the result
  }
}
  
  







  