//Write a program to print to sort list of element in ascending and descending order and show the exception handling

import java.util.*;

class String2
{
  public static void main(String args[])
  {
    int i;
    int a[] = new int[5];
    Scanner ob = new Scanner(System.in);
    try
    {
      System.out.println("Enter 5 numbers: ");
      for(i=0; i<5; i++)
        a[i] = ob.nextInt();
      System.out.println("Before Sorting: ");
      for(i=0; i<5; i++)
        System.out.println(" " + a[i]);

//    ----------------------------
      bubblesort(a, 5);
      System.out.println("After Sorting: ");
      System.out.println("Ascending : ");
      for(i=0; i<5; i++)
        System.out.print(a[i] + " ");
      System.out.println();
      System.out.println("Descending : ");
      for(i=4; i>=0; i--)
        System.out.print(a[i] + " ");
    }

    catch(NumberFormatException e) 
    {
      System.out.println("Enter only numbers: ");
    }
    catch(InputMismatchException e)
    {
      System.out.println("Enter only 5 numbers: ");
    } 
  }

  private static void bubblesort(int a[], int length)
  {
    int temp, i, j;
    for(i=0; i<length; i++)
    {
      for(j=i+1; j<length; j++)
      {
        if(a[i]>a[j])
        {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }//end of j loop
    }//end of i loop
  }//end of bubblesort function
}