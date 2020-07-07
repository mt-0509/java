
public class MyApp {

  public static void main(String[] args) {
    int[] seq = new int[10];
    for (int i = 0; i < 10; i++) {
      seq[i] = new java.util.Random().nextInt(4);
      char[] base = {'A', 'T', 'G', 'C'};
      System.out.print(base[seq[i]] + " ");
    }
  }
}