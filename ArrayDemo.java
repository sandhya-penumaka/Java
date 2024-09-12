import java.io.*;
import java.util.*;
class ArrayDemo{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter " +n+ " values into an array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
