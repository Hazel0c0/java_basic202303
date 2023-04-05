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


  }
}
