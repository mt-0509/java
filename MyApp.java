import java.util.*;

public class MyApp {

  public static void main(String[] args) {
    // HashSet
    // TreeSet
    // LinkedHashSet
    
    // HashSet<Integer> sales = new HashSet<>();
    Set<Integer> sales = new HashSet<>();

    sales.add(10);
    sales.add(20);
    sales.add(30);
    sales.add(10);


    System.out.println(sales.size()); // 3

    for (Integer sale : sales) {
      System.out.println(sale);
    }

    sales.remove(30);

    for (Integer sale : sales) {
      System.out.println(sale);
    }
  }
}