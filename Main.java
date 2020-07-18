public class Main {

  public static void main(String[] args) {
    Hero h1 = new Hero("ミナト");
    System.out.println(h1.name);
    Hero h2 = new Hero();
    System.out.println(h2.name);

    Thief t1 = new Thief("アサカ", 40, 5);
    System.out.println(t1.name + t1.hp + "と" + t1.mp);

    Thief t2 = new Thief("田中",100);
    System.out.println("俺の名前は" + t2.name + "だ！" + "HPは" + t2.hp + " MPは" + t2.mp);

    Thief t3 = new Thief("伊藤");
    System.out.println("俺の名前は" + t3.name + "だ！" + "HPは" + t3.hp + " MPは" + t3.mp);

  }
}