//Write a java program to find largest of 3 numbers

import java.util.Scanner;

class largest
{
  public static void main(String args[])
  {
    int a, b, c;
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter 3 number: ");
    a = ob.nextInt();
    b = ob.nextInt();
    c = ob.nextInt();

    if((a>=b) && (a>=c))
    {
      System.out.println("Largest is, " + a);
    }
    else if((b>=c) && (b>=a))
    {
      System.out.println("Largest is, " + b);
    }
    else
    {
      System.out.println("Largest is, " + c);
    }
  }
}