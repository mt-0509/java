public class Main {
  public static void main(String[] args) {
    Hero.setRandomMoney();
    System.out.println(Hero.money);
    Hero h = new Hero();
    System.out.println(h.money);
  }
}