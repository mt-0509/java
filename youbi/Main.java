public class Main {

  public static void main(String[] args) {
    Receive receive = new Receive();
    receive.seireki();
    receive.tuki();
    receive.niti();
    receive.check();

    Judge judge = new Judge();
    judge.change();
    
  }
}