import java.util.*;
import java.util.Scanner;
public class method {
    void sum(int a,int b){
    System.out.println(a+b);
    }
    static void area_of_circle(double r){
        System.out.println(3.14*r*r);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of D :");
        double d = sc.nextDouble();
        method h = new method();
        h.sum(2,3);
          area_of_circle(d);
    System.out.println("we are printing the area of cirsle");      
    }
}   
