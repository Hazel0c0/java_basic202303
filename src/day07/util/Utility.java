package day07.util;

import java.util.Scanner;

// import static day07.util.Utility.*; // 여기선 필요 없어

public class Utility {

  private static Scanner sc = new Scanner(System.in);

  // 구분선을 출력하는 기능
  public static void makeLine() {
    System.out.println("========================");
  }

  // 문자열을 입력받는 기능
  public static String input(String message) {
    System.out.print(message);
    return sc.nextLine();
  }

  public static void main(String[] args) {
    makeLine();
    input("메롱");
    input("가가가");
  }

}