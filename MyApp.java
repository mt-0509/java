
public class MyApp {

  public static double calcTriangleArea(double bottom, double height) {
    double ans = bottom * height / 2;
    return ans;
  }

  public static double calcCircleArea(double radius) {
    double ans = radius * radius * 3.14;
    return ans;
  }
  
  public static void main(String[] args) {
    double Ans1 = calcTriangleArea(5,10);
    double Ans2 = calcCircleArea(5);
    System.out.println("三角形の面積は" + Ans1 + "㎠です。");
    System.out.println("円の面積は" + Ans2 + "㎠です。");
  }
}