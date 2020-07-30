public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;

  public void heal(Hero h) {
    int basePoint = 10;
    int recovPoint = (int)(basePoint * this.getWand().getPower());
    if(recovPoint =< 0.5 || 100 =< recovPoint) {
      throw new IllegalArgumentException
      ("recovpointが0.5以上100以下ではないので、処理を中断")
    }
    h.setHp(h.getHp() + recovPoint);
    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
  }
  public int getHp() {return this.hp;}

  public void setHp(int hp) {
    if(hp < 0) {
      throw new IllegalArgumentException
      ("HPが0以下にセットされたので、自動でHPは0となります");
      this.hp = 0;
    } else {
      this.hp = hp;
    }
  }

  public int getMp() {return this.mp;}

  public void setMp(int mp) {
    if(mp < 0) {
      throw new IllegalArgumentException
      ("MPが0以下にセットされたので処理を中断します");
    }
    this.mp = mp;}

  public String getName() {return this.name;}
  public void setName(String name) {
    if(name == null || name.length() < 3) {
      throw new IllegalArgumentException
      ("魔法使いに設定されようとしている名前が異常です");
    }
    this.name = name;}
  public Wand getWand() {return this.wand;}
  public void setWand(Wand wand) {
    if(wand == null) {
      throw new IllegalArgumentException
      ("設定されようとしている杖がnullです");
    }
    this.wand = wand;}
}