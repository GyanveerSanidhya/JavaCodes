class Vehicle{
 protected String brand="Ford";
 public void honk(){
  System.out.println("Loud");
 }
}

class car extends Vehicle{
 private String modelName="Mustang";
 public static void main(String[]args){
  System.out.println("THIS CODE IS AN EXAMPLE OF INHERITANCE");
  car mycar=new car();
  mycar.honk();
  System.out.println(mycar.brand+" "+mycar.modelName);
 }
}
  