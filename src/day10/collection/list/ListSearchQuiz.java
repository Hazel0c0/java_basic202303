package day10.collection.list;

import java.util.ArrayList;
import java.util.Arrays;

import static day07.util.Utility.input;

public class ListSearchQuiz {

  public static void main(String[] args) {

    ArrayList<String> tvxq = new ArrayList<>(
        Arrays.asList("영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호")
    );

    System.out.println(tvxq);


    while (true) {
      // 1. 수정 타겟의 이름을 입력받는다.
      System.out.println("- 수정할 멤버의 이름을 입력하세요.");
      String targetName = input(">> ");


      // 2. 해당 이름이 있는지 탐색해본다.
      boolean isName = tvxq.contains(targetName);
      System.out.println(targetName + " 있나요? " +
          isName);

      // 4. 탐색에 실패하면 실패한 증거를 확보한다.
  /*
      try {
        if (!isName)
          throw new Exception();

      } catch (Exception e) {
        System.out.println("이름을 다시 입력해랏!");
        e.printStackTrace();
      }

   */

      // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
      if (isName) {
        int index = tvxq.indexOf(targetName);

        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
        String newName = input("변경할 이름을 입력해주세요\n>> ");

        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
        tvxq.set(index, newName);

        System.out.println("변경완료!!");
        System.out.println("* 변경 후 정보 : " + tvxq);
        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.
        break;
      } else {
        try {
            throw new Exception();
        } catch (Exception e) {
          System.out.println("이름을 다시 입력해랏!");
          e.printStackTrace();
        }
      }
    }
  }
}

