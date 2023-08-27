public class annu {
    String color;
    int age;
    void initobj(String c,int a)
    {
        color=c;
        age=a;

    }
    void display()
    {
        System.out.println(color+" "+age);
    }

    public static void main(String[] args) {
        {
            annu baba=new annu();
            baba.initobj("black",10);
            baba.display();
        }
    }
}
