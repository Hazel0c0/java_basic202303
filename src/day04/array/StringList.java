package day04.array;

import java.util.Arrays;

public class StringList {
  //스트링배열을 제어하는 설계도

  //필드
  String[] sArr;

  // 생성자
  public StringList() {
    sArr = new String[0]; // 빈 스트링 배열
  }

  StringList(String... initData) {
    sArr = new String[initData.length];
    for (int i = 0; i < sArr.length; i++) {
      sArr[i] = initData[i];
    }
  }

  // 메서드
  int size() {
    // 배열에 저장된 데이터 수를 알려주는 기능
    return sArr.length;
  }

  void push(String newData) {
    // 배열에 맨 끝에 데이터를 추가하는 기능
    String[] temp = new String[sArr.length + 1];
    for (int i = 0; i < sArr.length; i++) {
      temp[i] = sArr[i];
    }
    temp[temp.length - 1] = newData;
    sArr = temp;  //temp=null 필요없음.  temp 지역변수라서!!
  }

  String pop() {
    // 배열 맨 끝 데이터 삭제하는 기능
    String deleteTarget = sArr[sArr.length - 1]; // 지우기 전에 찾아놓고
    //지우고
    String[] temp = new String[sArr.length - 1];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = sArr[i];
    }
    sArr = temp;
    return deleteTarget; //지운데이터 리턴
  }

  public String toString() {
    // ~필기~ 출력
    return Arrays.toString(sArr);
  }

  //배열이 텅텅 비었는지
  boolean isEmpty() {
//    if (sArr.length==0) {
//      return true;
//    } else {
//      return  false;
//    }
    // 간단화
    return sArr.length == 0;
  }

  // 배열 데이터 전체삭제
  void clear() {
    sArr = new String[0];
  }

  // 인덱스 탐색
  int searchIdx(String name) {
    for (int i = 0; i < sArr.length; i++) {
      if (name.equals(sArr[i])) {
        return i;
      }
    }
    return -1;
  }

  // 자료 유무 확인
  boolean searchName(String name){
    int idx=searchIdx(name);
    return idx != -1;
  }

  // 중간 삭제


  // 중간 삽입
}
