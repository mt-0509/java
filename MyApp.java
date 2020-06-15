class User {
  String name = "Me!";

  void sayHi() {
    System.out.println("hi!");
  }
}

public class MyApp {

  public static void main(String[] args) {

    // Class
    User tom;
    tom = new User(); // インスタンス
    
    System.out.println(tom.name);
    tom.sayHi();
  }
}