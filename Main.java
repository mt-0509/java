public class Main {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 10000; i++) {
      sb.append("Java");
    }
    String s = sb.toString();
    String yahoo = "yahoo" + "yahoo";
    System.out.println(s);
    System.out.println(yahoo);

    long end = System.currentTimeMillis();
    System.out.println("処理にかかった時間は…" + (end - start) + "ミリ秒でした");
  }
}