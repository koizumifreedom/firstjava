package FIRSTJAVA;
public class ArrayTest2 {
  public static void main(String[] args) {
      int a = 2;
/*      String[] customer;
      customer = new String[3];
      switch(a) {
            case 1:
                customer[0] = "鈴木太郎";                 //[0]で一番目。0で開始する。これを「添字」又は「index」という。その値が入る箱を「要素」という。
                customer[1] = "suzuki_tarow@xxxx.com";   //[1]で2番目
                customer[2] = "090-0000-9999";           //[2]で3番目
                break;
            case 2:
                customer[0] = "鈴木太郎";                 //[0]で一番目。0で開始する。これを「添字」又は「index」という。その値が入る箱を「要素」という。
                customer[1] = "suzuki_tarow@xxxx.com";   //[1]で2番目
                break;
            case 3:
                customer[0] = "鈴木太郎";                 //[0]で一番目。0で開始する。これを「添字」又は「index」という。その値が入る箱を「要素」という。
                break;
      }

//      for (int i = 0; i < 3; i++) {
      for (int i = 0; i < customer.length; i++) {    //customer.lengthの方がミスを防ぐ事ができる
            if (customer[i] != null) {
                System.out.println(customer[i]);
            }
      }

      System.out.println();        //カッコの中を省略すると、空を入れる         */

//      String[] customer2 = {"鈴木太郎","suzuki_tarow@xxxx.com","090-0000-9999"};  
      String[] customer2;
      switch(a) {
            case 1:
                customer2 = new String[]{"鈴木太郎","suzuki_tarow@xxxx.com","090-0000-9999"}; 
                break;
            case 2:
                customer2 = new String[]{"鈴木太郎","suzuki_tarow@xxxx.com"}; 
                break;
            default:
                customer2 = new String[]{"鈴木太郎"}; 
                break;
      }

      for (String customer2Value : customer2) {
          System.out.println(customer2Value);
      }
   }
}
