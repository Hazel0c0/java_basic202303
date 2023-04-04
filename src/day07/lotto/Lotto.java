package day07.lotto;

import java.util.Arrays;

public class Lotto {

  public static int[] information() {
    int num = 0, numCK = 0;
    int[] lotto = new int[6];
    for (int i = 0; i < 6; i++) {
      while (true) {
        num = (int) ((Math.random() *10) + 1);
        if (num != numCK) {
          lotto[i] = num;
          numCK = num;
          break;
        }
      }
    }
    System.out.println(Arrays.toString(lotto));
    return lotto;
  }
}
