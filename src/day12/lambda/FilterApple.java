package day12.lambda;

import java.util.ArrayList;
import java.util.List;

public class FilterApple {
  /**
   * @solution - try1: 사과바구니에서 녹색사과만 필터링 해야한다
   *
   * @problem
   * - 만약 다른색 사과를 필터링 해야한다면?
   * - 새로운 메서드가 필요
   *
   * @param  basket: 여러 사과가 모여있는 바구니
   * @return : 녹색 사과들만 모여있는 바구니
   */
  public static List<Apple> filterGreenApples(List<Apple> basket) {
    // 녹색사과만 담을 바구니
    List<Apple> greenApples = new ArrayList<>();
    //반복문을 통해 필터링
    for (Apple apple:basket){
      if (apple.getColor()== Color.GREEN){
        greenApples.add(apple);
      }
    }
    return greenApples;
  }
  /**
   * @solution - try2: 색상을 파라미터화 한다
   * @problem
   * - 만약에 필터 기준이 색상이 아니라 무게라면?
   */
  public static List<Apple> filterApplesByColor(List<Apple> basket, Color color){
    // 특정 색상만 담을 바구니
    List<Apple> fliteredApples = new ArrayList<>();
    for (Apple apple:basket){
      if (apple.getColor()== color){
        fliteredApples.add(apple);
      }
    }
    return fliteredApples;
  }

  /**
   * 함수에 함수는 줄수 없으나 객체는 줄수 있음
   * @solution - try3: 동작을 파라미터화 한다 - 추상적 조건으로 필터링
   * @problem
   * - 사과바구니가 아닌 오렌지 바구니를 필터링 해야한다면?
   * - 전자제품 바구니를 필터링 해야한다면?
   */
  public static List<Apple> filterApples(List<Apple> basket, ApplePredeicate p) {
      // 특정 색상만 담을 바구니
      List<Apple> fliteredApples = new ArrayList<>();
      for (Apple apple:basket){
            // (p.test()) test가 추상메서드라면? 상황에 따라 바꿔줄수 있을듯?
            if (p.test(apple)){
          fliteredApples.add(apple);
        }
      }
      return fliteredApples;
  }

  /**
   * @solution - try4: 제네릭 필터 메서드 생성
   */
  public static /*여기*/<T> List<T> filter(List<T> basket, GenericPredicate<T> p ){
    // 메서드에서 제네릭 타입을 사용하면 리턴타입 앞에 제네릭 표시 해줘야함
    List<T> filterList=new ArrayList<>();
    for (T t:basket ) {
      if (p.test(t)){
        filterList.add(t);
      }
    }
    return filterList;
  }
}
