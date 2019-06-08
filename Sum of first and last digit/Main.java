import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int first=0 , last,i,temp,count=0;	
      
      temp=n;
      while(temp!=0)
      {
        temp=temp/10;
        count++;
      }
      first=n;
      for(i=0;i<count-1;i++)
      {
        first=first/10;
      }
      last=n%10;
     last=last+first;
      System.out.println(last);
	}
}
