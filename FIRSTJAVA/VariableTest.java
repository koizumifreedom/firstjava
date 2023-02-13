package FIRSTJAVA;
public class VariableTest {
    public static void main(String[] args){
      //基本データ型の変数は初期化しなければならない
      int myAge;           // 変数宣言：情報が入る箱の形を決めて、コンピューターに伝える
      myAge = 35;          // 初期化している
      //myAge = 40;          // 上書きされている
      //myAge = myAge + 5;
      System.out.println(myAge);
    // javaクラスで実行する場合は .javaを付けないように
    // int型は整数を入力
    // javaは静的型付け言語なので、一度決めたら型を変更できない


    //配列の角要素は初期化しなくてもいい
    int[] ourAges = new int[5];        //数値（byte,short,int,long,float,doubule)のデータには0が初期値
    System.out.println(ourAges[1] + 5);    //２番目を表示:初期値として0が元々代入されている
    
    boolean[] isChild = new boolean[5];        //booleanのデータ型にはfalseが初期値
    System.out.println(isChild[1]);    //２番目を表示:初期値としてfalseが元々代入されている

    char[] Letter = new char[5];        //charのデータ型には’’が初期値
    System.out.println(Letter[1]);    //２番目を表示:初期値として''が元々代入されている

    String[] text = new String[5];        //Stringのデータ型にはnullが初期値
    System.out.println(text[1]);    //２番目を表示:初期値としてnullが元々代入されている
    
    }
}  