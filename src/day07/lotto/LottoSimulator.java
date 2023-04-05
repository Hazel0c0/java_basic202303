//package day07.lotto;
//
//import static day07.lotto.Lotto.*;
//import static day07.util.Utility.input;
//
//public class LottoSimulator {
//
//
//  static int lottoNum = 0;
//
//
//  void makeMyLotto(){
//    System.out.println("구매번호 6개를 차례대로 입력하세요(1~10)");
//    int[] myLotto = new int[6];
//
//    int i=0;
//    while (i<myLotto.length){
//
//    }
//    for (int i = 0; i < 6; i++) {
//      myLotto[i] = Integer.parseInt(input(i + 1 + "번째 번호 >> "));
//    }
//  }
//  public static void run() {
//
//    end:
//    while (myNumber[5] == lotto[5]) {
//      information();
//      num : for (int i = 0; i < myNumber.length; i++) {
//        for (int j = 0; j < lotto.length; j++) {
//          if (myNumber[i] != lotto[j]) {
//            ++lottoNum;
//            System.out.println(lottoNum + "장째 구매중");
//          } else break num;
//        }
//      }
//    }
//    System.out.println("#" + lottoNum + "장만에 1등에 당첨되었습니다~!");
//  }
//}
