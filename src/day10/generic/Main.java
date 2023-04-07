package day10.generic;

import day04.array.MyList;
import day09.jwCompany.Artist;

public class Main {
  public static void main(String[] args) {
    AppleBasket ab=new AppleBasket();
    ab.setApple(new Apple());
    Apple apple = ab.getApple();

    BananaBasket bb =new BananaBasket();
    bb.setBanana(new Banana());

    Basket<Apple> apples = new Basket();
    // new Basket<Apple> 생성자에서도 적어줬어야 하나 1.7 ?부터 안저어도됨
    apples.setFruit(new Apple());
//    apples.setFruit(new Banana()); //<Apple> 설정 후엔 못담음

    Basket<Banana> bananas = new Basket();
//    bananas.setFruit(new Apple());
    bananas.setFruit(new Banana());

    Banana fruit1=bananas.getFruit();

    MyList<String> sl = new MyList<>();
    sl.push("짬뽕");
    sl.push("22");
    sl.push("33");
    System.out.println(sl);

    MyList<Integer> num=new MyList<>();
    num.push(1);
    num.push(12);
    num.push(123);
    System.out.println(num);

    MyList<Artist> art = new MyList<>();
//    art.push("찌워니","라라라");
  }
}
