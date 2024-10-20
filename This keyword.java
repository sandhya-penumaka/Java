import java.io.*;
public class Thisdemo{
private int a=50;
public void setNumber(int a){
this.a=a;
System.out.println(" a value is " +a);
}
public static void main(String args[]){
Thisdemo td=new Thisdemo();
td.setNumber(60);
}
}
