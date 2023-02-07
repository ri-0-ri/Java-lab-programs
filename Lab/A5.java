//Write a java program to implement string operation
class Strings
{
  public static void main(String args[])
  {
    String S1 = "hello";
    String S2 = "world";
    String S3 = "good morning";
    System.out.println("S1 = " + S1);
    System.out.println("S2 = " + S2);
    System.out.println("S3 = " + S3);
    System.out.println("First string is = " + S1);
    System.out.println("Second string is = " + S2);
    //s.length()
    System.out.println("1. s.length()");
    int l1 = S1.length();
    int l2 = S2.length();
    System.out.println("Length of first string is: " + l1);
    System.out.println("Length of second string is: " + l2);
    //s1.concat(s2)
    System.out.println("2. s1.concat(s2)");
    System.out.println("Concatenation of string: " + S1.concat(S2));
    //s.toUpperCase()
    System.out.println("3. s.toUpperCase()");
    System.out.println("UpperCase string is: " + S1.toUpperCase());
    //s.toLowerCase()
    System.out.println("4. s.toLowerCase()");
    System.out.println("LowerCase string is: " + S1.toLowerCase());
    //s.subString(startpoint, endpoint)from - till
    System.out.println("5. s.subString(startpoint, endpoint)");
    System.out.println("Substring of '" + S1 + "' from 0 to 2 is: " + S1.substring(0,2));
    //s.charAt() - extra
    System.out.println("6. s.charAt()");
    System.out.println("3rd character in string '" + S1 + "' is: " + S1.charAt(2));
    //s.indexOf('')
    System.out.println("7. s.indexOf('')");
    System.out.println("Index of 'e' in string '" + S1 + "' is: " + S1.indexOf('e'));
    //s.replace('', '')
    System.out.println("8. s.replace('', '')");
    System.out.println("Replace 'e' with 'o' in string '" + S1 + "' is: " + S1.replace('e','o'));
    //s1.equals(s2)
    System.out.println("9. s1.equals(s2)");
    boolean C = S1.equals(S2);
    if(C == true)
      System.out.println("'" + S1 + "' and '" + S2 + "' are same.");
    else
      System.out.println("'" + S1 + "' and '" + S2 + "'are not same.");
    //s.endsWith("")
    System.out.println("10. s.endsWith(\"\")");
    boolean retval = S3.endsWith("all");
    System.out.println("Does '" + S3 + "' end with 'all'? " + retval);
  }
}