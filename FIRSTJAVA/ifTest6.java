package FIRSTJAVA;
public class ifTest6 {
  public static void main(String[] args) {
      int a = 5;
      int b = 11;
      if (++a == 6 || --b == 10) {  //前置と後置の比較する→短略評価は？　||左側が成立すると右側は無視　&&は左側が成立しないと全て無視
        System.out.println("条件成立");
      } else {
        System.out.println("条件不成立");
      }

    }

  }