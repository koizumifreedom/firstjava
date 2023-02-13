package FIRSTJAVA;
public class ForTest {
  public static void main(String[] args) {
      for(int i = 1; i <= 10; i++){
//          int n = i + 1;
//          System.out.println("繰り返し:" + n + "周目");
         if (i == 5) {
            System.out.println("次のループ　(週）に進む");
//            break;      //ループを中断する
            continue;   //次のループ　(週）に進む
         }
         System.out.println("for繰り返し:" + i + "周目");
      }
      int k = 1;
      int l = 5;
      System.out.println("kの初期値" + k);
      while(k <= 5) {
         System.out.println("while繰り返し:" + k + "周目。lの値:" + l);
         k++;
      }
//   System.out.println("ブロックを抜けた後のlの値:" + l);   //スコープ外！
      System.out.println("プログラム終了！");
      System.out.println("kの初期値" + k);
   }
}
