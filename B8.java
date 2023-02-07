//Write a java program to depict the function of static variable and static method

class B8 {
  static float multiply(float x, float y)
  {
    return x*y;
  }
}

class counter
{
  static int count = 0;
  counter()
  {
    count++;
    System.out.println("Count value is: " + count);
  }

  public static void main(String args[])
  {
    float a = B8.multiply(4.0f, 5.0f);
    counter c1 = new counter();
    counter c2 = new counter();
    counter c3 = new counter();
    System.out.println("MathOperationResult: " + a);
  }
}
