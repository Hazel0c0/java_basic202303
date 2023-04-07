package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    try {
      System.out.print("정수1  :");
      int n1 = sc.nextInt();   // InputMismatchException 실수를 썼을 때

      System.out.print("정수2  :");
      String strN2 = sc.next();
      int n2 = Integer.parseInt(strN2);   // NumberFormatException

      int result = n1 / n2;    // ArithmeticException
      System.out.println("result = " + result);
    } catch (InputMismatchException e) {
      System.out.println("첫번째 숫자는 정수로만 입력해주세요!");
    } catch (NumberFormatException e){
      System.out.println("첫번째 숫자는 정수로만 입력해주세요!");
    } catch (Exception e) {
      System.out.println("...");
    }

    System.out.println("정상종료!");
  }
}
