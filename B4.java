//Write a java program to find boxing and unboxing using wrapper class

class boxwrapping{
  public static void main(String args[]){
    int i = 0;
    Integer i1 = Integer.valueOf(i);
    int i2 = i1.intValue();
    System.out.println(i2);
    byte b = 20;
    Byte b1 = Byte.valueOf(b);
    byte b2 = b1.byteValue();
    System.out.println(b2);
    short s = 30;
    Short s1 = Short.valueOf(s);
    short s2 = s1.shortValue();
    System.out.println(s2);
    float f = 40;
    Float f1 = Float.valueOf(f);
    Float f2 = f1.floatValue();
    System.out.println(f2);
    long l = 10;
    Long l1 = Long.valueOf(l);
    Long l2 = l1.longValue();
    System.out.println(l2);
    double d = 1;
    Double d1 = Double.valueOf(d);
    Double d2 = d1.doubleValue();
    System.out.println(d2);
    boolean a = true;
    Boolean a1 = Boolean.valueOf(a);
    Boolean a2 = a1.booleanValue();
    System.out.println(a2);
    char c = 's';
    Character c1 = Character.valueOf(c);
    Character c2 = c1.charValue();
    System.out.println(c2);
  }
}