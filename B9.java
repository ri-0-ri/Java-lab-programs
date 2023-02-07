//Write a java program to perform multiple inheritance



interface a{
  abstract void test1();
  void test2();
  public void test3();
}


interface b extends a
{
  void test4();
}

class my implements a, b
{
  public void test1()
  {
    System.out.println("From test1");
  }
  public void test2()
  {
    System.out.println("From test2");
  }
  public void test3()
  {
    System.out.println("From test3");
  }
  public void test4()
  {
    System.out.println("From test4");
  }
}


class mi
{
public static void main(String args[])
{
  my ob = new my();
  ob.test1();
  ob.test2();
  ob.test3();
  ob.test4();
  }
}
