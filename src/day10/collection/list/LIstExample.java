package day10.collection.list;

import java.util.*;

import static day07.util.Utility.makeLine;

/*
  - 저장 데이터의 순서를 보장
  - 인덱스를 가지고 있음
  - 중복 데이터를 저장 가능

 */
public class LIstExample {
  public static void main(String[] args) {

    List<String> foodList = new ArrayList<>();

    // add
    foodList.add("바나나");
    foodList.add("탕슉");
    foodList.add("초코초코");
    foodList.add("지우꺼야");
    foodList.add("5555");
    foodList.add("666");

    //add(index, element) : 중간 삽입
    foodList.add(2,"과자먹고싶어");

    // size() : 저장된 데이터의 개수를 반환
    int size = foodList.size();
    System.out.println("size = " + size);

    System.out.println(foodList.toString()); // toString() 생략 가능

    // indexOf(E e) : 해당 데이터의 인덱스 반환
    int index=foodList.indexOf("탕슉");
    System.out.println("index = " + index);

    //contains(E e) : 해당 데이터 저장 유무 확인
    System.out.println("초코초코 contains  >  "+foodList.contains("초코초코"));
    System.out.println("짜장면  >  "+foodList.contains("짜장면"));

    //remove(index), remove(obj)
    String removedFood=foodList.remove(1);
    // 인덱스로 하면 지운 데이터 추출해서 줌
    foodList.remove("지우꺼야");

    System.out.println("지우기 = " + foodList);

    //set(index, newElement) : 수정
    foodList.set(0, "동파육");
    System.out.println("변경 = " + foodList);

    // get(index) : 리스트에 저장된 데이터 참조
    String s = foodList.get(1);
    System.out.println("get 한거 = " + s);

    // 반복문 처리
    makeLine();
    for (int i = 0; i < foodList.size(); i++) {
      System.out.println(foodList.get(i));
    }

    makeLine();
    for (String food: foodList) {
      System.out.println("food = " + food);
    }

    // clear() : 내부 데이터 전체삭제
    foodList.clear();
    System.out.println("foodList = " + foodList);
    System.out.println("비었니?"+foodList.isEmpty());

    makeLine();
    // 리스트에 초기값 넣고 시작하기
    List<String> tvxq = new ArrayList<>(
        Arrays.asList("유노우ㅠ노","최강창민","가나다라")
    );
    System.out.println("tvxq = " + tvxq);

    makeLine();
    // 정렬 (듀얼 피벗 퀵 정렬)
    List<Integer> numbers = new ArrayList<>(
        Arrays.asList(11,55,77,33,44,66,22)
    );
    System.out.println("numbers = " + numbers);
    
    //오름차 정렬
    Collections.sort(numbers);
    System.out.println("numbers = " + numbers);

    // 내림차 정렬
    numbers.sort(Comparator.reverseOrder());
    System.out.println("numbers = " + numbers);
  }
}
