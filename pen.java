class oops{
    String color;
    String type;//ballpoint;gel
    public void write()
    {
        System.out.println("writing somthing");
    }
}
public class pen {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();
    }
}

