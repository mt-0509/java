
public class MyApp {

  public static void main(String[] args) {
    System.out.println("メソッドを呼び出します");
    System.out.println("名前を教えてください");
    String userName = new java.util.Scanner(System.in).nextLine();
    hello(userName);
    System.out.println("メソッドの呼び出しが終わりました");
  }

  public static void hello(String name) {
    System.out.println(name + "さん、こんにちは");
  }
}