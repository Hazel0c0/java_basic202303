package day07.lotto;

import java.util.Arrays;

public class Lotto {
  static int[] lotto = new int[6];

  // 로또 번호 생성기
  private static void makeLotto() {
    // 로또 만드는건 외부에서 건들면  X - private(클래스 내에서만 호출 할 수 있게)
    int i = 0;
    while (i < lotto.length) {
      int random = (int) ((Math.random() * 10) + 1);
      if (!(isDuplicate(lotto, random))) {
        lotto[i] = random;
        i++;
      }
    }
  }
  // 중복 검사
  protected static boolean isDuplicate(int[] lotto, int rd) {
    // 상속 받은 - protected(다른패키지 상속까지)
    for (int n : lotto) {
      if (n == rd) return true;
    }
    return false;
  }

  // 로또 번호 출력하기
  public static void information() {
    // information:정보
    makeLotto();
    System.out.println(Arrays.toString(lotto));
  }

  // 로또 내보내기
  protected static int[] getLotto() {
    makeLotto();
    return lotto;
  }
}
