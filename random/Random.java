public class Random {
  public static void main(String arg[]){
    double a;
    double b;
    double c;
    double d;
    double e;
    double average;
    a = Math.random();
    b = Math.random();
    c = Math.random();
    d = Math.random();
    e = Math.random();
    average = (a + b + c + d + e) / 5;
    System.out.println("Average: " + average);
    System.out.println("Min: " + Math.min(Math.min(a, b), Math.min(c, Math.min(d, e))));
    System.out.println("Max: " + Math.max(Math.max(a, b), Math.max(c, Math.max(d, e))));
    System.out.println("Values:");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
  }
}
