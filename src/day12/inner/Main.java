package day12.inner;

public class Main { // 퍼블릭과 디폴트만
  // 내부 클래스
  // main 안에서만 쓸거다
  public static class SubCalculator implements Calculator {
    // 내부클래스는 모든 제어자 가능

    @Override
    public int operate(int n1, int n2) {
      return n1 - n2;
    }
  }

  public static void main(String[] args) {

    // 덧셈 계산을 하는 계싼기를 만들어서 쓰고싶다
    Calculator addCal = new AddCalculator();
    System.out.println(addCal.operate(30, 50));

    // 뺄셈 계산기
    Calculator sub1 = new SubCalculator();
    System.out.println(sub1.operate(100, 50));

    //곱셈 (익명클래스)
    Calculator multiCal = new Calculator() {

      @Override
      public int operate(int n1, int n2) {
        return n1 * n2;
      }
    };

    System.out.println(multiCal.operate(5,7));

    // 나눗셈 ( 람다) - 객체 (함수가 아님)
    // : 인터페이스의 추상메서드 딱 한개일때만 ! ( 2개이상은 익명클래스)
    Calculator divCal = (n1, n2)-> { return n1 / n2;  };
    System.out.println(divCal.operate(20,4));
  }

  // 1회용 강아지
//  new Pet() {
//
//  };

}
