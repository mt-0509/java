public class MyApp {

  public static void main(String[] args) {
    // 配列
    // sales.length
    int[] sales = {700, 400, 500}; 

    for (int i = 0; i < sales.length; i++) {
      System.out.println(sales[i]);
    }

    for (int sale : sales) {   // salesから1つずつ要素を取り出して処理を行う
      System.out.println(sale);
    }
  }
}