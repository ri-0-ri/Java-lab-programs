//Write a program to find factorial of list of numbers using command line argument


class A1
{
  public static void main(String args[])
  {
    int i, n, F, j;
    for(i=0; i<args.length; i++)
    {
      n=Integer.parseInt(args[i]);
      F=1;
      for(j=1; j<=n; j++)
      {
        F=F*j;
      }
      System.out.println("Factorial of "+ n + " = " + F);
    }
  }
}