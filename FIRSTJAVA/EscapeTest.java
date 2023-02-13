package FIRSTJAVA;
public class EscapeTest {
  public static void main(String[] arge) {
      System.out.println("Hello!!");
      System.out.println("Double quoye(\") is displayed.");  //option+¥で（＼）バックスラッシュでエスケープ　// (\")文字として表示される
      char c = '\'';          //char型は一文字を表示させる   
      System.out.println(c);
      System.out.println("\\ is displayed.");   //バックスラッシュを表示したい場合は2回打つ

      System.out.println("Hello!\n World!!");     // (\)nを使うと改行できる
      System.out.println("Hello!\t World!!");     // (\)tを使うとTAB(余白)が入る
      
      String str = null;
      System.out.println("Hello!\t World!!");

      boolean test = true;
      if (test == true) {
          str = "Hello!\n World!";
      } else {
        str = "Hello!\n World!!";
      }
      System.out.println(str);

      // コーデイングがしやすくなる　変数の中身を変えればいろんなコーデイング可能

  } 
}
