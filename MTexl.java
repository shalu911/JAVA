import.java.long.Thread;
 class evenodd implements Runnable
{
 Thread t=null;
evenodd(String s)
{
t=new Thread(This);
this.t.setname(s);
this.t.start();
}
  void even()
{
 int 1;
for(1=0;1<10;1+=2)
{
System.out.println(1+"\t it's even");
try
{
this.t.sleep(100);
}
catch(interruptedexecution e);
{
System.out.println(e);
}
}
}
void odd()
{
int 1;
for(1=1;1<=10;1+=2)
{
System.out.println(1+"\t it's odd");
try
{
this.t.sleep(100);
}
catch(interrupted exeception e);
{
System.out.println(e);
}
}
}
public void run()
{
if(this.t.getname().equals("even"))
this.even();
else
this.odd();
}
}
class MTexl
{
public static void main(String args[])
{
evenodd x=new evenodd("even");
evenodd y=new evenodd("odd");
}
}