import java.util.Random;

public class MyApp {

  public static void main(String[] args) {
    double d = 53.234;
    System.out.println(Math.ceil(d)); // 54
    System.out.println(Math.floor(d)); // 53
    System.out.println(Math.round(d)); // 53
    System.out.println(Math.PI); 
    // Math.random()

    Random r = new Random();
    System.out.println(r.nextDouble()); // 0 - 1
    System.out.println(r.nextInt(100)); // 0 - 100
    System.out.println(r.nextBoolean()); 
  }
}