

public class Judge {
  int judge;
  int win;
  int lose;
  int even;

  public void judgement(int cpuHand, int playerHand) {
    judge = (cpuHand - playerHand + 3) % 3;

    switch(judge) {
      case 0:
        System.out.println("あいこです！");
        even++;
        break;
       case 1:
         System.out.println("あなたの勝ちです！");
         win++;
         break;
       case 2:
         System.out.println("あなたの負けです！");
         lose++;
         break;
       default:
    }
    System.out.println("-------------------------");
  }

  public void result() {
    System.out.println("【勝敗の結果】");
    System.out.println("勝ち:" + win + "回");
    System.out.println("負け:" + lose + "回");
    System.out.println("あいこ:" + even + "回");
    System.out.println("");
    if (win > lose) {
      System.out.println("この勝負はあなたの勝ちです！おめでとう！");
    } else if (win < lose) {
      System.out.println("この勝負はあなたの負けです！どんまい！");
    } else {
      System.out.println("この勝負は引き分けです！");
    }
  }

}