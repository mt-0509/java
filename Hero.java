public class Hero {
  int hp;
  String name;
  Sword sword;
  static int money;

  public static void setRandomMoney() {
    Hero.money = (int)(Math.random() * 1000);
  }
  public boolean isValidPlayerName(String name) {
    return name.matches("[A-Z][A-Z0-9]{7}");
  }
}