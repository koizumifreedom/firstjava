package FIRSTJAVA;
public class DowhileTest {
  public static void main(String[] arge) {
    System.out.println("多い番号順から点呼とります！");
    int number = 11;             //番号（1から始まる）
    do {
        System.out.println(number + "!!");
        number--;   //iに1を減算する
    }while(number <= 10 && number >= 1);  // ()の中の条件判定結果がtureの場合:doに戻る(繰り返す）/falseの場合:そのまま下へ
  }
}
