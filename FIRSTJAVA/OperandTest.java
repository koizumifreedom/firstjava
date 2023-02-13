package FIRSTJAVA;
public class OperandTest {
  public static void main(String[] arge) {
    int number = 1;
    number *= 1;
    System.out.println(number);
    // 保存忘れをしてしまうとコンパイルしても表示されない
    // int型がよく使われる
    // 1にLを付けるlong型になってしまう
    // キャスト演算子を使えば（)を使えば強制的に代入可能
    // 整数より小数の方が大きい
    // ++number インクリメント+1する インクリメントは前でも後ろでも結果は同じ。ただし(number++ + 1)だと足されず右の値のみ足される

  }
}

