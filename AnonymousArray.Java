import java.io.*;
class AnonymousArraydemo{
    public static void main(String args[]){
        printArray(new int[]{10,20,30,40});
    }
    static void printArray(int arr[]){
        System.out.println("The elements of the AnonymousArray are: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
  }
