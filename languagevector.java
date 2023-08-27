import java.util. *;
class Languagevector
{
  public static void main(String args[])
  {
  Vector List=new Vector();
  int length=args.length;
  for(int i=0;i<length;i++)
  {
  List.addElement(args[i]);
  }
  List.insertElementAt("COBOL",2);
  String ListArray[]=new String[size];
  List.copyinto(ListArrary);
  System.out.println("List of Languages");
  for(int i=0;i<size;i++)
  {
  System.out.println(ListArrary[i]);
  }
  }
  }