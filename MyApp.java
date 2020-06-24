// final:変更ができない

final class User {
  protected String name;
  private static final double VERSION = 1.1;

  public User(String name) {
    this.name = name;
    User.VERSION = 1.2;
  }

  public final void sayHi() {
    System.out.println("hi! " + this.name);
  }

  class Adminuser extends User {

    public Adminuser(String name) {
      super(name);
    }

    @Override
    public void sayHi() {
      System.out.println("[admin] hi! " + this.name);
    }
  }

  public static void getInfo() { // クラスメソッド
    System.out.println("# of instances: " + User.count);
  }

}

public class MyApp {

  public static void main(String[] args) {
    User.getInfo(); // 0
    User tom = new User("tom");
    User.getInfo(); // 1
    User bob = new User("bob");
    User.getInfo(); // 2
  }

}