import java.util.*;

public class MyApp {

  public static void main(String[] args) {
    // ArrayList
    // LinkedList ｘ検索 ○ 追加／削除

    // ArrayList<Integer> sales = new ArrayList<>();
    List<Integer> sales = new ArrayList<>();

    sales.add(10);
    sales.add(20);
    sales.add(30);

    for (int i = 0; i < sales.size(); i++) {
      System.out.println(sales.get(i));
    }

    sales.set(0, 100); // 要素の変更
    sales.remove(2);

    for (Integer sale : sales) { // for文のもう1つの書き方
      System.out.println(sale);
    }

  }
}