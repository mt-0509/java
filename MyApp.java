public class MyApp {

  public static void main(String[] args) {
    // キャスト
    double d = 52343.231;
    int i = (int)d;
    System.out.println(i);

    int i = 10;
    double d = (double)i / 4; // ここで行われているのは整数の計算なので、iをdouble型に変換することで小数の計算を行える
    System.out.println(d);

  }
}