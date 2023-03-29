package day03;

import java.util.Arrays;

public class ArrayInsert {
  public static void main(String[] args) {
    int[] arr = {10,20,30,40,50};

    int targetIndex=2;  //20-30 사이에
    int newData=25;

    // 배열의 사이즈 먼저 1 늘리기
    int[] temp = new int[arr.length + 1];

    // 원본 배열 다 복사
    for (int i = 0; i < arr.length; i++) {
      temp[i]=arr[i];
    }

    // 맨 뒤부터 타겟인덱스까지 한칸씩 뒤로 밀기 (뒤에서 부터 땡겨와야해!)
    for (int i = temp.length-1; i >=targetIndex ; i--) {
      temp[i]= temp[i-1];
    }
    // 타겟 인덱스 자리에는 새 데이터를
    temp[targetIndex]=newData;
    // 주소 바꾸기
    arr= temp; temp =null;

    System.out.println(Arrays.toString(arr));
  }
}
