import java.util.Scanner;
class Main {
	public static void main (String[] args){

	   Scanner sc= new Scanner(System.in);
     
      int sum=0,temp ;
      int num=sc.nextInt();
      
      while(num!=0)
      {
        temp=num%10;
        sum=sum+temp;
        num=num/10;
        
      }
      System.out.println(sum);
	}
}