package FIRSTJAVA;
public class WhileTest {
  public static void main(String[] arge) {
      System.out.println("番号！");
      int number = 1;             //番号（1から始まる）
      while(number <= 10) {       //()の中の条件判定結果がtureの場合:ブロック実行（繰り返す）/falseの場合:ブロックをスキップ
          System.out.println(number + "!!");
          number++;   //iに1を加算する
      } 
  }
  
}
