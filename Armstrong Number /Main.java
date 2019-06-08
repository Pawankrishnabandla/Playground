import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner s=new Scanner(System.in);
      int n=s.nextInt();
   int temp=n, sum=0;
      while(n>0)
      {
      int t=n%10;
        n=n/10;
         sum= sum+t*t*t;    
      }
      if(temp==sum)
      {
        System.out.println("Armstrong Number") ;
      } 
      else
        System.out.println("Not a Armstrong Number");
                           
	}
}