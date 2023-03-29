package day03;

public class ArraySearch {
  static String[] foods = {"삼겹살", "족발", "피자", "햄버거"};

  public static int indexOf(String target) {

    target = "족발";
    for (int i = 0; i < foods.length; i++) {
      if (target.equals(foods[i])) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {

//    foods[0]=foods[1];  // 값 복사
//    (영역)   (값)
    foods[2] = "치킨";

    String[] foods = {"삼겹살", "족발", "피자", "햄버거"};

    foods[2] = "치킨";

    // 인덱스 탐색 알고리즘
    int index = -1;
    String target = "족발";
    for (int i = 0; i < foods.length; i++) {
      if (target.equals(foods[i])) {
        index = i;
        break;
      }
    }
    System.out.println("찾은 인덱스: " + index);
  }
}
