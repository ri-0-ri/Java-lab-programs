//Write a java program to implement single inheritance

class Room
{
  int length, breadth;
  Room(int x, int y)
  {
    length = x;
    breadth = y;
  }

  int area()
  {
    return(length*breadth);
  }
}

class livingroom extends Room
{
  int height;
  livingroom(int x, int y, int z)
  {
    super(x, y);
    height = z;
  }

  int volume()
  {
    return(length*breadth*height);
  }
}

class inheritance
{
  public static void main(String args[])
  {
    livingroom rooms = new livingroom(14, 12, 16);
    int area1 = rooms.area();
    int volume1 = rooms.volume();
    System.out.println("Area = " + area1);
    System.out.println("Volume = " + volume1);
  }
}
