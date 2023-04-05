package day08.poly.car;


import static day07.util.Utility.*;

public class Main {
  public static void main(String[] args) {
    CarShop shop = new CarShop();
    shop.runTest();

    makeLine();

    Driver park = new Driver();
    park.drive(new Mustang());
    park.drive(new Stinger());
    park.drive(new Tucson());

    makeLine();

    /*
    Car mustang = new Mustang(); // powerSound 호출하려면 다운캐스팅 필요
    if ( mustang instanceof  Mustang){
      ((Mustang) mustang).powerSound();
    }
     */

    Car car = shop.exportCar(5000);
    System.out.println(car instanceof Stinger);
    System.out.println(car instanceof Mustang);
    System.out.println(car instanceof Tucson);
//    mustang.accelerate();
//    mustang.powerSound();

  }
}
