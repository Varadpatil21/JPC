//Create a class pen having data members type, make and prize. Define member to accept and display data. use constructor to initialize the data members.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter pen type:");
        String type=sc.next();
        System.out.print("Enter Company:");
        String make=sc.next();
        System.out.print("Enter Prize:");
        double prize=sc.nextDouble();
        Pen P1=new Pen(type,make,prize);
        P1.display();
        Pen P2=new Pen();
        P2.display();
        Pen P3=new Pen(P1);
        P3.display();

    }
}
