import java.util.*;

public class MyApp {

  public static void main(String[] args) {
    // HashMap: key value
    // TreeMap
    // LinkedHashMap

    // HashMap<String, Integer> sales = new HashMap();
    Map<String, Integer> sales = new HashMap<>();

    sales.put("tom", 10);
    sales.put("bob", 20);
    sales.put("steve", 30);

    System.out.println(sales.get("tom")); // 10
    System.out.println(sales.size()); // 3

    for (Map.Entry<String, Integer> sale : sales.entrySet()) {
      System.out.println(sale.getKey() + ":" + sale.getValue());
    }

    sales.put("tom", 100);
    sales.remove("steve");

    for (Map.Entry<String, Integer> sale : sales.entrySet()) {
      System.out.println(sale.getKey() + ":" + sale.getValue());
    }
  }
}