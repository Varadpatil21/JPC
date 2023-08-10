public class Pen {
    String type;
    String make;
    double prize;
    Pen(String type,String make,double prize)
    {
        this.type=type;
        this.make=make;
        this.prize=prize;
    }

    public Pen() {
       type="Ballpoint";
       make="Pentek";
       prize=7.0;
    }

    Pen(Pen P)
    {
        this.type=P.type;
        this.make=P.make;
        this.prize=P.prize;

    }

    void display()
    {
        System.out.println("------------------");
        System.out.println("Pen Type: "+type);
        System.out.println("Company: "+make);
        System.out.println("Prize: "+prize);
    }

}
