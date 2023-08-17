//Design a base class stack and handle runtime anomalies like stack overflow and underflow
// display appropriate message and error code to user
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        int ch;
        Scanner sc=new Scanner(System.in);

        stack s=new stack();
        do
        {
            System.out.println("1. Push\n2. Pop");
            ch=sc.nextInt();
            switch(ch) {
                case 1:
                    try {
                        System.out.println("Enter element you want to enter into stack:");
                        int e = sc.nextInt();
                        s.push(e);

                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Popped element is "+s.pop());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
            }
        }while(ch!=3);
    }
}