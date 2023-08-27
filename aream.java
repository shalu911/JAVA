class get
{
void calculate(int i)
{
System.out.println(2*3.14*i);
}
void calculate(int a,int b)
{
System.out.println(0.5*a*b);
}
void calculate(int a,int b,int c)
{
System.out.println(a*b*c);
}
}
class aream
{
public static void main(String args[])
{
get ob=new get();
ob.calculate(2);
ob.calculate(3,5);
ob.calculate(5,7,8);
}
}
