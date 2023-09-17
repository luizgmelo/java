public class Ascending {
  public static void main(String arg[]) {
    int a;
    int b;
    int c;
    a = Integer.parseInt(arg[0]);
    b = Integer.parseInt(arg[1]);
    c = Integer.parseInt(arg[2]);
    System.out.println(Math.min(Math.min(a, b), c));
    System.out.println((a + b + c) - Math.min(Math.min(a, b), c) - Math.max(Math.max(a, b), c));
    System.out.println(Math.max(Math.max(a, b), c));
  }
  
}
