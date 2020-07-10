
public class MyApp {

  public static void email(String title, String address, String text) {
    System.out.println(address + "に以下のメールを送信しました");
    System.out.println("件名:" + title);
    System.out.println("本文:" + text);
  }
  
  public static void main(String[] args) {
    String title = "明日の件";
    String address = "yahoo.co.jp";
    String text = "よろしく頼むわー";
    email(title, address, text);
  }
}