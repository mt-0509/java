
public class MyApp {
  
  public static int add(int x, int y) {
    int ans = x + y;
    return ans;
  }

  public static double add(double x, double y) {
    double ans = x + y;
    return ans;
  }

  public static String add(String x, String y) {
    String ans = x + y;
    return ans;
  }
  
  public static void main(String[] args) {
    System.out.println(add(10,20));
    System.out.println(add(3.5,2.7));
    System.out.println(add("Hello","World"));
  }
}