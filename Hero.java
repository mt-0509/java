public class Hero {
  int hp;
  String name;
  Sword sword;
  static int money;

  public static void setRandomMoney() {
    Hero.money = (int)(Math.random() * 1000);
  }
}