package FIRSTJAVA;
public class ForTestDouble {
  public static void main(String[] args) {
      for(int i = 1; i <= 2; i++) {
         System.out.print("[i:" + i + "]");
         for(int j = 1; j <= 3; j++) {
             System.out.print("j:" + j + " ");
         }
         System.out.println();
      }
   }
}
// [i:1]j:1 j:2 j:3 
// [i:2]j:1 j:2 j:3 
