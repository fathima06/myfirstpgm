import java.util.Scanner;
public class Addnum{
  public static void main(String[] args) {
    Scanner myinput=new Scanner(System.in);
  int a,b,c;
  System.out.println("Enter the first number:");
  a=myinput.nextInt();
  System.out.println("enter the second number:");
  b=myinput.nextInt();
  System.out.println("answer is:");
  
  c=a+b;

  System.out.println(c);  
  }
       
  
}