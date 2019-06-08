import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
       int num,count=0;
      num=sc.nextInt();
      for(int i=1;count<num;i++)
      {
        if(i%2!=0)
        {
          System.out.println(i);
          count++;
        }
	  }
}
}