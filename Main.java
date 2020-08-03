public class Main {
  public static void main(String[] args) {
    // public boolean isValidPlayerName(String name) {
    //   return name.matches("[A-Z][A-Z0-9]{7}");
    // }
    Hero h = new Hero();

    String s = "A0000203";
    boolean ans = h.isValidPlayerName(s);
    System.out.println(ans);
  }
}