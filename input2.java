import java.lang.*;
import java.util.*;

class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st number");
        a = sc.nextInt();
        System.out.println("Enter 2nd number");
        b = sc.nextInt();
        c = a+b;
        System.out.println("Sum of "+ a + " and "+ b +" is "+ c);
    }
}
