public class Main {
  public static void main(String[] args) {
    Account a = new Account();
    Account b = new Account();
    a.accountNumber = "4649";
    a.balance = 1592;
    System.out.println(a);

    b.accountNumber = "4649 ";
    b.balance = 999;
    System.out.println(b.equals(b));

    
  }
}