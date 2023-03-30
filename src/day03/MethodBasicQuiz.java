package day03;

import java.util.Arrays;

public class MethodBasicQuiz {

  static String[] foods = {"떡볶이", "치킨", "파스타"};
  static String[] userNames = {"홍길동","김철수"};
  // 이름이 바뀌면 사용할 수 없다 > 객체지향을 통해 모든 스트링 배열에서 사용 할 수 잇도록 make
  // day04.array

  static String[] temp;

  private static void printFoods() {
    // temp 배열 복사 > sout 출력
    for (int i = 0; i < foods.length; i++) {
      temp[i] = foods[i];
    }

    System.out.println("temp: " + Arrays.toString(temp));
  }

  private static void push(String food) {
    // 새 배열(temp) 생성
    String[] temp = new String[foods.length + 1];

    // temp에 배열 복사
    printFoods();

    // 요소 추가하기
    temp[temp.length - 1] = food;

    // 배열 주소값 정리
    foods = temp;
    temp = null;
  }

  private static int indexOf(String idxOfName) {
    for (int i = 0; i < foods.length; i++) {
      if (idxOfName.equals(foods[i])) {
        return i;
      }
    }
    return -1;
  }

  private static void remove(String delFood) {

    // 뒤에 요소로 덮어버리기
//    for (int i = 0; i <; i++) {
//
    //  }
  }

  private static boolean include(String food) {
    return true;
  }

  private static void insert(int n, String food) {

  }

  private static void modify(int n, String food) {

  }

  public static void main(String[] args) {

    printFoods();
    push("라면");
    push("김치찌개");
    printFoods();

    // idx에 2가 리턴되어야 함.
    int idx = indexOf("파스타");
    // idx에 4가 리턴되어야 함.
    int idx2 = indexOf("김치찌개");
    // idx에 -1이 리턴되어야 함.
    int idx3 = indexOf("짜장면");

    System.out.printf("인덱스 : idx= %d\tidx2= %d\tidx3= %d\n", idx, idx2, idx3);

    remove("김치찌개"); // foods배열에서 김치찌개 제거
    remove("망고"); // 존재하지 않는 음식명입니다 출력.

    printFoods();


    boolean flag = include("파스타"); // 파스타 발견시 true 리턴
    boolean flag2 = include("양념치킨"); // 양념치킨 미발견시 false 리턴

    insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
    modify(2, "닭갈비");  // 2번 인덱스 데이터 닭갈비로 수정
    //clear();  // foods배열 모든 데이터 삭제
  }


}
