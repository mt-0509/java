import java.util.Scanner;

public class Receive {
  int seireki;
  int tuki;
  int niti;

  // メソッドで入力された値をフィールドにセットしたい
  // どうすればいいのか本などで調べる

  static int seireki() {
    System.out.println("あなたが曜日を知りたい西暦を入力してください");
    Scanner scan = new Scanner(System.in);
    int seireki = scan.nextInt();
    return seireki;
  }
  static int tuki() {
    System.out.println("続いて月を入力してください");
    Scanner scan = new Scanner(System.in);
    int tuki = scan.nextInt();
    return tuki;
  }
  static int niti() {
    System.out.println("続いて日にちを入力してください");
    Scanner scan = new Scanner(System.in);
    int niti = scan.nextInt();
    return niti;
  }
  static void check(int seireki, int tuki, int niti) {
    System.out.println("あなたが入力した年月日は" + seireki + "年" + tuki + "月" + niti + "日ですね");
  }


}