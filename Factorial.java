import java.io.*;
import java.util.*;
class Factorial{
  int factorial(int n){
    if(n==0){
      return 1;
    }
    else{
      return(n*factorial(n-1));
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Factorial ob=new Factorial();
    System.out.println("Enter number to find the factorial:");
    int num=sc.nextInt();
    System.out.println("The Factorial of" + num + " is " + ob.factorial(num));
  }
}
