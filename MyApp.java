
public class MyApp {

  public static void main(String[] args) {
    boolean tenki = true;
    if (tenki == true) {
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    } else // 1行しかないので{}を省略可能
           // しかし実際の開発現場では省略しない方がいい
      System.out.println("DVDを見ます");
    
  }
}