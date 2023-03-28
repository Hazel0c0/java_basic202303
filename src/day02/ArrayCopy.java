package day02;

import java.util.Arrays;

public class ArrayCopy {
  public static void main(String[] args) {
    //배열 복사 알고리즘
//    String[] pets = new String[] { "멍멍이", "야옹이", "쨱쨱이"};

    // 선언과 동시에 초기화 한다면 new Type[] 생략 가능
    // 변수 만드는 상황에서만 가능함. 나머지는 다 붙여줘야한다
    String[] pets = { "멍멍이", "야옹이", "쨱쨱이"};
/*
    String[]  petsCopy = pets; // 배열 주소값 복사
    pets[1] = "사마귀";

    System.out.println("원본배열 : "+ Arrays.toString(pets));
    System.out.println("사본배열 : "+ Arrays.toString(petsCopy)); 원본과 같이 변경됨(주소값 복사라서)
*/

    /*
    원본배열 : [멍멍이, 사마귀, 쨱쨱이]
사본배열 : [멍멍이, 사마귀, 쨱쨱이]
     */

    // 1. 원본과 동일한 사이즈의 배열을 하나 더 생성
    String[] petsCopy = new String[pets.length];

    //2. 원본의 각 인덱스 값들을 사본에 인덱스로 일일히 복사
    for (int i = 0; i < pets.length; i++) {
      petsCopy[i] = pets[i];
    }
    pets[1] = "사마귀";

    System.out.println("원본배열 : "+ Arrays.toString(pets));
    System.out.println("사본배열 : "+ Arrays.toString(petsCopy)); // 사본은 변경 안됨

  }
}
    // 변수는 모두 스택에 쌓임
