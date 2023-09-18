public class RightTriangle {
  public static void main(String[] args) {
    int a;
    int b;
    int c;
    a = Integer.parseInt(args[0]);
    b = Integer.parseInt(args[1]);
    c = Integer.parseInt(args[2]);
    if (a > 0 && b > 0 && c > 0) {
      if (a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b) {
        System.out.println(true);
      } else {
        System.out.println(false);
      }
    } else {
      System.out.println(false);
    }
  }
}
