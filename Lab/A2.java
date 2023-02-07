//Write a java program to display primt number within the given two limits

import java.util.Scanner;
class Prime{
  public static void main(String args[])
  {
    int i, j, m, n, p;
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter 'from' limit: ");
    m=ob.nextInt();
    System.out.println("Enter 'to' limit: ");
    n=ob.nextInt();
    System.out.println("Prime numbers within the range are: ");

    for(i=m; i<=n; i++)
    {
      for(j=2; j<i; j++)
      {
        p=i%j;
        if(p==0)
          break;
      }
      if(i==j)
        System.out.println(i);
    }
  }
}