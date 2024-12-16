import java.util.*;

public class Solution1{
 public static void main(String[]args){
 
  Scanner Sc=new Scanner(System.in);
  System.out.println("THIS IS A PROGRAM TO CHECK WHETHER A NUMBER IS A PALINDROME NUMBER OR NOT");
  String a=Sc.nextLine();
  String b="";
 
  for(int i=0; i<a.length(); i++){
    b=a.charAt(i)+b;
  }
  System.out.println("Original number: "+a);
  System.out.println("Reversed number: "+b);
  
  if(a.equals(b)){
   System.out.println("TRUE");
  }
  else{
   System.out.println("False");
  }
 }
}
  
 