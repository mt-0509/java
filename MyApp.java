public class MyApp {

  public static void main(String[] args) {
    // if
    // > >= < <= == !=
    // && || !
    int score = 95;
    // if (score > 80) {
    //   System.out.println("Great!");
    // } else if (score > 60) {
    //   System.out.println("Good!");
    // } else {
    //   System.out.println("so so ... !");
    // }

    // 条件演算子を使った書き方
    String msg = score > 80 ? "Great!" : "so so ... !";
    System.out.println(msg);

  }
}