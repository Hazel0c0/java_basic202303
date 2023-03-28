package day02;

import java.util.Arrays;

public class ArrayPush {
  public static void main(String[] args) {

    // 새로운 데이터를 배열에 맨 끝에 추가
    int [] arr = {10,20,30};

    int newData=40;
    /* 기본적으로 배열의 끝에 추가 할 수는 없음
    ( 배열의 크기 추가 할 수 없기 때문에 더 큰 배열로 바꿔 줘야함
     */

    // 1. 원본 배열보다 1개 사이즈가 더 큰 새 배열 생성
     int[] temp = new int[arr.length + 1]; // 새로운 방
     // 2. 원본배열 데이터 새 배열로 복사
    for (int i = 0; i < arr.length; i++) {
      temp[i] = arr[i];
    }
    // 3. 새로운 데이터를 새 배열의 끝 인덱스에 추가

    temp[temp.length -1] = newData;

    // 4. 주소값 이전
    arr=temp;  // arr에 temp의 주소를 주고
    temp=null;  // temp의 주소는 버리기 (temp로 조작되면 안되기 때문에)

    System.out.println(Arrays.toString(arr));
  }
}
