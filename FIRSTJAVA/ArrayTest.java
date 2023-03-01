package FIRSTJAVA;
public class ArrayTest {
  public static void main(String[] args) {
      String name = "鈴木太郎";
      String email = "suzuki_tarow@xxxx.com";
      String phone = "090-0000-9999";
      System.out.println(name);
      System.out.println(email);
      System.out.println(phone);

      System.out.println();       //カッコの中を省略すると、空行を入れる

      String[] customer;          //String型の配列を宣言
//　　　　customer = 鈴木太郎;       //String[]とStringは＝ではない！
//      customer[0] = "鈴木太郎";   //配列を宣言した後、配列の初期化せずにいきなり値を代入出来ない！
      customer = new String[3];
      customer[0] = "鈴木太郎";     //[0]で一番目。0で開始する。これを「添字」又は「index」という。その値が入る箱を「要素」という。
      customer[1] = "suzuki_tarow@xxxx.com";   //[1]で2番目
      customer[2] = "090-0000-9999";           //[2]で3番目
//      System.out.println(customer[0]);
//      System.out.println(customer[1]);
//      System.out.println(customer[2]);
      //通常のforループのパターン
//      for (int i = 0; i < 3; i++) {
      for (int i = 0; i < customer.length; i++) {    //customer.lengthの方がミスを防ぐ事ができる
          System.out.println(customer[i]);
      }

      System.out.println();        //カッコの中を省略すると、空を入れる

//      String[] customer2;
//      customer2 = {"鈴木太郎","suzuki_tarow@xxxx.com","090-0000-9999"};                //初期化する場合、宣伝と初期化を分けない！

//      String[] customer2;
//      customer2 = new String[] {"鈴木太郎","suzuki_tarow@xxxx.com","090-0000-9999"};   //new 型名[]{}で初期化する場合、宣言と初期化を分けられる
    
      String[] customer2 = {"鈴木太郎","suzuki_tarow@xxxx.com","090-0000-9999"};       //new 型名[]で初期化する場合、宣言と初期化を同時に行う
//      System.out.println(customer[0]);
//      System.out.println(customer[1]);
//      System.out.println(customer[2]);
      //拡張for文のパターン
      for (String customer2Value : customer2) {
          System.out.println(customer2Value);
          
      }
  }
}
