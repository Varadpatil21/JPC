import javafx.util.Pair;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id, marks, n;
        String name;
        System.out.println("How many records you want to enter:");
        n = sc.nextInt();
        HashMap<Pair, Integer> h1 = new HashMap<Pair, Integer>();


        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of student "+(i+1));
            System.out.print("Enter id:");
            id = sc.nextInt();
            System.out.print("Enter Name:");
            name = sc.next();
            Pair P = new Pair<Integer,String>(id, name);
            System.out.print("Enter Marks:");
            marks = sc.nextInt();
            h1.put(P, marks);
        }
        int highscore = 0, lowscore = 4856666;
        int idhigh = 0,idlow=0;
        String namehigh = null,namelow=null;
        for (Map.Entry<Pair, Integer> i : h1.entrySet()) {
            if (i.getValue() > highscore) {
                Pair s=i.getKey();
                idhigh= (int) s.getKey();
                namehigh=(String) s.getValue();
                highscore = i.getValue();
            }
            if (i.getValue() < lowscore) {
                Pair s=i.getKey();
                idlow= (int) s.getKey();
                namelow=(String)s.getValue();
                lowscore = i.getValue();
            }

        }
        System.out.println("\nHigh Scorer Student");
        System.out.println("ID:"+idhigh);
        System.out.println("Name:"+namehigh);
        System.out.println("Marks:"+highscore+"\n");
        System.out.println("Low Scorer Student");
        System.out.println("ID:"+idlow);
        System.out.println("Name:"+namelow);
        System.out.println("Marks:"+lowscore);
    }
}