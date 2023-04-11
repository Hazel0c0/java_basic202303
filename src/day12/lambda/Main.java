package day12.lambda;

import day05.member.Gender;
import day05.member.Member;
import day07.util.Utility;

import java.util.ArrayList;
import java.util.List;

import static day07.util.Utility.*;
import static day12.lambda.FilterApple.*;
import static day12.lambda.MappingApple.map;
import static day12.lambda.MappingApple.mappingAppleByColor;

public class Main {
  public static void main(String[] args) {
    //사과 바구니 생성
    List<Apple> appleBasket = List.of(
        new Apple(80, Color.GREEN)
        , new Apple(150, Color.GREEN)
        , new Apple(120, Color.RED)
        , new Apple(75, Color.YELLOW)
        , new Apple(100, Color.YELLOW)
        , new Apple(55, Color.RED)
        , new Apple(80, Color.GREEN)
        , new Apple(130, Color.GREEN)
    );

    System.out.println("==== 녹색 사과 필터링 =====");
    List<Apple> greenApples
        = filterGreenApples(appleBasket);
    for (Apple greenApple : greenApples) {
      System.out.println(greenApple);
    }
    System.out.println("==== 노랑 사과 필터링 =====");
    List<Apple> colorApples
        = filterApplesByColor(appleBasket, Color.YELLOW);
    for (Apple colorApple : colorApples) {
      System.out.println(colorApples); // 수정 필요
    }

    System.out.println("====원하는 조건으로 필터링 =====");
    List<Apple> filterApples
        = filterApples(appleBasket, new LightApplePredicate());
    for (Apple filterApple : filterApples) {
      System.out.println(filterApple);
    }

    // 빨간 사과 필터링
    // 내부클래스
    makeLine();
    List<Apple> filterApples1 = filterApples(appleBasket,
        (apple) -> apple.getColor() == Color.RED);

    for (Apple apple : filterApples1) {
      System.out.println(apple);
    }

    makeLine();
    //녹색이면서 100보다 큰 사과들만 필터링 ( 익명)
    List<Apple> filterApples2 = filterApples(appleBasket,
        apple -> apple.getColor() == Color.GREEN
            && apple.getWeight() > 100);
    for (Apple apple : filterApples2) {
      System.out.println(apple);
    }

    makeLine();
    List<Apple> filter = filter(appleBasket,
        apple -> apple.getWeight() >= 100);
    System.out.println("filter = " + filter);

    // 필기 있음


//    List<String> wordList=new ArrayList<>(
//        "aaa","bbbbbbbbbb","cccc","ddddddddddd","eeeee"
//    );

    makeLine();

    List<Color> colorList = mappingAppleByColor(appleBasket);
    System.out.println("colorList = " + colorList);

    makeLine();
    List<Member> memberList = List.of(
        new Member("asd@asdf.com", "1234", "찌원", 1, Gender.FEMALE, 29)
        , new Member("abc2@ddd.com", "4444", "김길동", 2, Gender.FEMALE, 23)
        , new Member("abc3@ddd.com", "3333", "이길동", 3, Gender.MALE, 43)
        , new Member("abc4@ddd.com", "5555", "박길동", 4, Gender.FEMALE, 53)
        , new Member("abc5@ddd.com", "1111", "송길동", 5, Gender.MALE, 63)
    );
    // 람다
    List<Gender> nemaList
        =map(memberList, m->m.gender);
    System.out.println("nemaList = " + nemaList);

    //익명클래스
    List<Integer> integers
        =map(memberList, new GenericFunction<Member, Integer>() {
      @Override
      public Integer apply(Member m) {
        return m.age;
      }
    });
    System.out.println("integers = " + integers);
  }
}
