package day02;

import java.util.Scanner;

public class SwitchExample {

  public static final String SPRING = "봄"; // psf

  /* 스위치문 : 정수, 문자형 변수를 써야함
  case에는 변수 불가능
  상수만 가능
   */

  // 자바 상수
  public static void main(String[] args) {

    System.out.println("### 여행지 추천 ###");
    System.out.println("[ 원하는 계절을 입력하세요. ]");
    System.out.print(">> "); // 봄, 여름, 가을, 겨울

    Scanner sc = new Scanner(System.in);

    String season = sc.nextLine();
    double d = 3.14;

    // switch문에는 정수, 문자형 변수를 써야 합니다.
    switch (season) {
      // case에는 변수불가능 상수만 가능
      case SPRING:
        System.out.println("봄에는 여의도를 가세요!");
      case "여름":
        System.out.println("여름에는 홍천을 가세요!");
      case "가을":
        System.out.println("가을에는 춘천을 가세요!");
      case "겨울":
        System.out.println("겨울에는 스키장을 가세요!");
    }
/*
.toLowerCase() : 소문자로
.charAt(0) : 첫글자만 뗴서 판단 > return type : char
 */
    System.out.print("정말로 종료합니까? [y/n] >>");

    String answer = sc.nextLine();

    switch (answer) {
      case "y":
        System.out.println("종료합니다!");
        break;
      case "n":
        System.out.println("취소합니다!");
        break;
    }
  }
}
