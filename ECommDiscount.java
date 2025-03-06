import java.util.*;

class ECommDiscount {
  public static void main(String[]args) {
     
    Scanner sc = new Scanner(System.in);

    double d;

    System.out.println("THIS IS A PROGRAM TO DISPLAY DISCOUNTED PRICE ON CERTAIN ITEMS");
    System.out.println("S.no.1: 5% discount on Toys");
    System.out.println("S.no.2:10% discount on Stationary");
    System.out.println("S.no.3:20% discount on Groceries");
    System.out.println("S.no.4:25% discount on Electronics (Category 1: Items under $1000)");
    System.out.println("S.no.4:30% discount on Electronics (Category 2: Items above $1000)"); 

   

    System.out.println("Select serial number of the item purchased");
       int a = sc.nextInt();

    System.out.println("Enter the Price of the item"); 
       int p = sc.nextInt();
    System.out.println("Original Price of the item: $" + p); 

    
    if(a == 1) {
       System.out.println("Item: Toys");
       d = (95*p)/100;
       System.out.println("Discounted Price of the item: $" + d);
    }
    else if(a == 2) {
       System.out.println("Item: Stationary");
       d = (90*p)/100;
       System.out.println("Discounted Price of the item: $" + d);
    }
     else if(a == 3) {
       System.out.println("Item: Groceries");
       d = (80*p)/100;
       System.out.println("Discounted Price of the item: $" + d);
    }
     else if(a == 4) {
       System.out.println("Item: Electronics");
       System.out.println("Select Category");
        int c = sc.nextInt();
         if(c == 1) {
           if(p <= 1000) {
             d = (75*p)/100;
             System.out.println("Discounted Price of the item: $" + d);
          }
          else {
             System.out.println("Check category");
          }
        }
        else if(c == 2) {
          d = (70*p)/100;
          System.out.println("Discounted Price of the item: $" + d);
        }
        else{
          System.out.println("Invalid Category");
        }
      }
     else {
        System.out.println("Invalid Item Serial Number");
    }
   }
 }

