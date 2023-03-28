package day02;

import java.io.IOException;
import java.util.Scanner;

public class StdIO {


  public static void main(String[] args) throws IOException {
    String dog = "멍멍이", cat = "야옹이";

    int month = 1;
    int day = 1;
    String anni = "개천절";

    // souf
    System.out.printf("%d월 %d일은 %s입니다\n", month, day, anni);
    // %d : 정수 , %s : 문자열, %f : 실수

    double rate = 12.34567891234;
    // %f : 무조건 자리수를 6자리로 표현 ( %.2f)
    System.out.printf("할인율 %f%%입니다\n", rate);   //12.345679%
    System.out.printf("할인율 %.2f\n", rate); //12.35
    System.out.printf("할인율 %.8f\n", rate); //12.34567891
    // % 는 %% 로 표현

    // Alt Enter > 시그니쳐 롤 추가
    int result1 = System.in.read();
    System.out.println("result = " + result1);

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    int result = 0;
    // 스코프 범위 벗어나서 > 밖으로 선언 빼줘야함
    try {
      // str 정수변환
      result = Integer.parseInt(str);
    } catch (Exception e) {
      System.out.println("정수를 입력하세요");
    }


  }
}
