import java.util.Scanner;

public class Receive {
  static int seireki;
  static int tuki;
  static int niti;

  // メソッドで入力された値をフィールドにセットしたい
  // どうすればいいのか本などで調べる

  public int seireki() {
    System.out.println("あなたが曜日を知りたい西暦を入力してください");
    Scanner scan = new Scanner(System.in);
    int seireki = scan.nextInt();
    return this.seireki = seireki;
  }
  public int tuki() {
    System.out.println("続いて月を入力してください");
    Scanner scan = new Scanner(System.in);
    int tuki = scan.nextInt();
    return this.tuki = tuki;
  }
  public int niti() {
    System.out.println("続いて日にちを入力してください");
    Scanner scan = new Scanner(System.in);
    int niti = scan.nextInt();
    return this.niti = niti;
  }
  public void check() {
    System.out.println("あなたが入力した年月日は" + seireki + "年" + tuki + "月" + niti + "日ですね");
  }

  public int getSeireki() {
    return this.seireki;
  }
  public int getTuki() {
    return this.tuki;
  }
  public int getNiti() {
    return this.niti;
  }


}