import java.io.*;
import java.util.*;
class Primecheck{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check prime or not");
        int num=sc.nextInt();
        boolean isPrime = true;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num+"is a Prime number");
        }
        else{
            System.out.println(num+"is not a Prime number");
        }
        }
}
