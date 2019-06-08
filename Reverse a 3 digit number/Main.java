import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int num, reverse=0;
    Scanner sc= new Scanner(System.in);
    num=sc.nextInt();
   int First_digit=num/100;
  int  Second_digit=((num/10)%10);
  int  Last_digit=num%10;
    reverse=(Last_digit*100)+(Second_digit*10)+First_digit;
    System.out.println(reverse);
  }
}