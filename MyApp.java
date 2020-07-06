
public class MyApp {

  public static void main(String[] args) {
    int num = new java.util.Random().nextInt(3);
    boolean tenki;

    if (num == 1) {
      tenki = true;
    } else { 
      tenki = false;
    }


    if (tenki == true) {
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    } else {
      System.out.println("DVDを見ます");
    }
    
  }
}