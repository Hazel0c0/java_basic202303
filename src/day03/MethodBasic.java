package day03;

public class MethodBasic {
  public static void main(String[] args) {

  }

  // 2개의 정수배열을 전달받아
  //들어있는 숫자의 개수가 더 많은 배열을 리턴하는 메서드
  int[] compareNumbers(int[] arr1, int[] arr2) {
                      // ... 못쓴다
    return arr1.length > arr2.length ? arr1 : arr2;
    // if문을 [A] [E]로 삼항연산자로 변경해줌
  }


  static int[] operateAll(int n1, int n2) {
    int[] results = {
        n1 + n2,
        n1 - n2,
        n1 * n2
    };
    return results;
  }
}
