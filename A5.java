//Write a java program to find area of geometrical figures using methods

import java.util.Scanner;
class area{
  double circle(double radius)
  {
    return(3.14*radius*radius);
  }

  double square(double side)
  {
    return(side*side);
  } 

  double rectangle(double length, double breadth)
  {
    return(length*breadth);
  }

  double triangle(double base, double height)
  {
    return(0.5*base*height);
  }
}//end of class area

class A5
{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
    area x1 = new area();
    // class_name object_name = new class_name();

    System.out.println("Calcualting area of a circle");
    System.out.println("Enter radius: ");
    double r = ob.nextDouble();
    double ans = x1.circle(r);
    System.out.println("Area of cirlce with radius " + r + "units is " + ans + "sq.units");

    System.out.println("Calcualting area of a square");
    System.out.println("Enter side: ");
    double s = ob.nextDouble();
    double ans1 = x1.square(s);
    System.out.println("Area of square with side " + s + "units is " + ans1 + "sq.units");
    
    System.out.println("Calcualting area of a rectangle");
    System.out.println("Enter length and breadth: ");
    double l = ob.nextDouble();
    double b = ob.nextDouble();
    double ans2 = x1.rectangle(l, b);
    System.out.println("Area of recatngle with length " + l + "units and breadth " + b + "units is " + ans2 + "sq.units");

    System.out.println("Calcualting area of a triangle");
    System.out.println("Enter base and height: ");
    double t_b = ob.nextDouble();
    double t_h = ob.nextDouble();
    double ans3 = x1.triangle(t_b, t_h);
    System.out.println("Area of triangle with base " + t_b + "units and height " + t_h + "units is " + ans3 + "sq.units");
  }
}