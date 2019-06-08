import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int first=0 ,i,temp,count=0;	
      
      temp=n;
      while(temp!=0)
      {
        temp=temp/10;
        count++;
      }
      
      for(i=0;i<count-1;i++)
      {
        first=n%10;
        n=n/10;
      }
      
      System.out.println(first);
	}
}