public class Pythagoras1 {
    int a;
    int b; 
    int h2; 
    double h;

    //Constructor to initialize a and b
    public Pythagoras1(int a, int b){
      this.a = a;
      this.b = b;
    }
  
    //creating a method to calculate hypotenuse
     public void calculateHypotenuse(){
       h2=(int)(Math.pow(a,2) + Math.pow(b,2)); //calculate squares of altitude and base
       h =Math.sqrt(h2); //calculate the hypotenuse using Math.sqrt method
     }
    
    //creating a method to display the result
    public void display(){
      System.out.println("Hypotenuse (h) =" +h);
    }
 }