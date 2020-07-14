import java.util.*;

public class Cleric {
  String name;
  int HP = 50;
  int MP = 10;
  final int MAXHP = 50;
  final int MAXMP = 10;

  public void selfAid() {
    this.MP -= 5;
    this.HP = MAXHP;
    System.out.println(this.name + "は、HPが" + MAXHP + "になった!!!");
  }

  public int pray(int sec) {
    int recover = new Random().nextInt(3) + sec;

    int recoverActual = Math.min(this.MAXHP - this.MP, recover);
    this.MP += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した");
    return recoverActual;
  }
}