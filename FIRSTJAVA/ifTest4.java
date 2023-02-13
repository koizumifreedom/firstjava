package FIRSTJAVA;
public class ifTest4 {
    public static void main(String[] args) {
      int myAge = 40;              //年齢
      char myBloodType = 'A';      //血液型
      if(myAge == 35  && myBloodType == 'B') {   //年齢と血液型の両方が条件が成立する場合
      System.out.println("私の年齢は35歳で血液型はB型です!");
    } else if(myAge == 35  && myBloodType == 'A') {
      System.out.println("私の年齢は35歳で血液型はA型です!");
    } else if(myAge == 40  && myBloodType == 'A') {
      System.out.println("私の年齢は40歳で血液型はA型です!");
    } else {
      System.out.println("私の年齢は35歳ではないです!");
    }
      System.out.println("私の出身地は・・・");
  }
}
