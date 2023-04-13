package day12.inner;

// 계산 기능을 명세
// 두개의 정수를 상황에 맞게 연산 할 수 있다

// 람다 사용이 가능한지 체크 : 추상메서드가 1개인 경우
@FunctionalInterface  // 붙였을 때 에러 안나면 람다 사용 가능
public interface Calculator {

  public int operate(int n1, int n2);
}
