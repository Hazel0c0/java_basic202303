package day10.generic;

public class Basket<F> {
  // <Fruit> interface Fruit 와는 상관 없음
  // <F> 관례상 한글자로 표기

  private F fruit;

  public F getFruit() {
    return fruit;
  }

  public void setFruit(F fruit) {
    this.fruit = fruit;
  }
}
