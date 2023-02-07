//Write a java program to generate fibonacci series using looping control

import java.util.Scanner;
class fib
{
  public static void main(String args[])
  {
    int f1=0, f2=1, f3, num;
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter limit: ");
    num = ob.nextInt();
    System.out.println(f1);
    System.out.println(f2);
    for(int i=3; i<=num; i++)
    {
      f3 = f1+f2;
      System.out.println(f3);
      f1=f2;
      f2=f3;
    }
  }
}