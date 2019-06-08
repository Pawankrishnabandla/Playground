import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner ob=new Scanner(System.in);
      int x=ob.nextInt();
    int a=fun(x);
     System.out.println(a);
    }
  public static int fun(int k)
  {int sum=0;
  for(int i=1;i<=k;i++)
    {sum=sum+i; }
return sum;
  }
}