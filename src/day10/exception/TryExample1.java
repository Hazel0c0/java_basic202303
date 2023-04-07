package day10.exception;

public class TryExample1 {

  public static void main(String[] args) {
    int n1 = 20, n2 = 0;
    System.out.println("나눗셈");

    try { // c a T (6)try-catch
      System.out.printf("%d / %d=%d\n", n1, n2, n1 / n2);
    } catch (Exception e) {
      System.out.println("삐빅 예외 처리");
      // 개발시에 쓰는 코드 ( 로그 트레이싱 )
      e.printStackTrace();
    }

    System.out.println("저앗ㅇ 종료!");
  }
}
