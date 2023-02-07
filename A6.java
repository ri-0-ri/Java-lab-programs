//Write a java program to implement constructor overloading by passing different number of parameters of differernt types

class box{
  int length, width, height;


  box()
  {
    length = width = height = 2;
    System.out.println("Default construstor");
  }

  box(int n)
  {
    length = width = height = n;
    System.out.println("Constructor with one argument");
  }

  box(int l, int w, int h)
  {
    length = l;
    width = w;
    height = h;
    System.out.println("Constructor with three arguments");
  }

  int getvolume()
  {
    return(length*width*height);
  }
}

class boxvolume
{
  public static void main(String args[])
  {
    box b1 = new box();
    System.out.println(b1.getvolume());
    box b2 = new box(5);
    System.out.println(b2.getvolume());
    box b3 = new box(3, 5, 7);
    System.out.println(b3.getvolume());
  }
}