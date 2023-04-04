package day07.util;

import java.util.Arrays;

import static day07.lotto.Lotto.*;
import static day07.util.Utility.input;

public class LottoSimulator {

  static int[] myNumber = new int[6];
  static int lottoNum = 0;

  public static void run() {
    System.out.println("구매번호 6개를 차례대로 입력하세요(1~10)");
    for (int i = 0; i < 6; i++) {
      myNumber[i] = Integer.parseInt(input(i + 1 + "번째 번호 >> "));
    }
    end:while (true) {
    int[] lotto=information();
    input("로또번호 확인");
      for (int i = 0; i < 6; i++) {
        if (myNumber[i] != lotto[i]) {
          ++lottoNum;
          System.out.println(lottoNum + "장째 구매중");
        } else break;
        if (myNumber[5] == lotto[5]) {
          break end;
        }
      }
      input("--");
      System.out.println(Arrays.toString(lotto));
      System.out.println(Arrays.toString(myNumber));
    }
    System.out.println("#" + lottoNum + "장만에 1등에 당첨되었습니다~!");
  }
}
