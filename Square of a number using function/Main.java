import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int a=fun(x);
      System.out.print(a);
	} 
  public static int fun(int m)
  {
    int r=m*m;
    return r;
  }
  
}