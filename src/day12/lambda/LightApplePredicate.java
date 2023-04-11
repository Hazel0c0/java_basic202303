package day12.lambda;

public class LightApplePredicate implements ApplePredeicate{

  @Override
  // 객체안에 메서드를 오버라이딩 해서 콜백처러 전달한거
  public boolean test(Apple apple) {
    return apple.getWeight()<=100;
  }
}
