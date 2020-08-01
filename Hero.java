public class Hero {
  int hp;
  String name;
  Sword sword;

  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }
  private void die() {
    System.out.println(this.name + "は死んでしまった！");
    System.out.println("GAME OVERです。");
  }
  public String toString() {
    return "名前:" + this.name + "/HP:" + this.hp;
  }
  public boolean equals(Object o) {
    if (this == o) {return true;}
    if (o instanceof Hero) {
      Hero h = (Hero)o;
      if (this.name.equals(h.name)) {
        return true;
      }
    }
    return false;
  }
}