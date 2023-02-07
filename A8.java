//Write a java program ro calculate bonus for different department using method overriding
abstract class department
{
  double salary, bonus, total_salary;
  public abstract void calbonus(double sal);
  public void total_salary(String dept)
  {
    System.out.println("Department " + " BasicSalary " + " Bonus " + "TotalSalary ");
    System.out.println(dept + salary + bonus + total_salary);
  } 
}

class accounts extends department
{
  public void calbonus(double sal)
  {
    salary = sal;
    bonus = sal*0.2;
    total_salary = salary + bonus;
  }
}

class sales extends department
{
  public void calbonus(double sal)
  {
    salary = sal;
    bonus = sal*0.5;
    total_salary = salary + bonus;
  }
}


class bonuscalculate
{
  public static void main(String srgs[])
  {
    accounts ob = new accounts();
    sales ob1 = new sales();
    ob.calbonus(1000);
    ob1.calbonus(2000);
    ob.total_salary("accounts");
    ob1.total_salary("sales");
  }

}