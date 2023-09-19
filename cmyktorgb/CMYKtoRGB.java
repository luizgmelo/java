public class CMYKtoRGB {
  public static void main(String[] args) {
    double cyan;
    double magenta;
    double yellow;
    double black;
    double white;
    double red;
    double green;
    double blue;

    cyan = Double.parseDouble(args[0]);
    magenta = Double.parseDouble(args[1]);
    yellow = Double.parseDouble(args[2]);
    black = Double.parseDouble(args[3]);

    white = 1 - black;
    red = 255 * white * (1 - cyan);
    green = 255 * white * (1 - magenta);
    blue = 255 * white * (1 - yellow);

    System.out.println("red = " + red);
    System.out.println("green = " + green);
    System.out.println("yellow = " + yellow);
  }
}
