package day03;

public class Matrix {
  public static void main(String[] args) {
    int[][] arr2d = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    // 2차원 배열 순회
    for (int[] arr : arr2d) {
      // 2차원 배열을 꺼내면 1차월 배열 뭉탱이가 나옴
    for(int n : arr){
      System.out.printf("%3d ",n);
      //%3 세칸 차지해라
    }
      System.out.println();
    }
  }
}
