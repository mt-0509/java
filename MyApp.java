
public class MyApp {

  public static void email(String title,String address, String text) {
    System.out.println(address + "に以下のメールを送信しました");
    System.out.println("件名:" + title);
    System.out.println("本文:" + text);
  }

  public static void email(String address, String text) {
    System.out.println(address + "に以下のメールを送信しました");
    System.out.println("件名:無題");
    System.out.println("本文:" + text);
  }
  
  public static void main(String[] args) {
    email("toshimasa@co.jp", "こんにちは！");
  }
}