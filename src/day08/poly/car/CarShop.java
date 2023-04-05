package day08.poly.car;

public class CarShop {
//  Mustang[] mustangs;
//  Stinger[] stingers;
//  Tucson[] tucsons;

  Car[] cars;

  // 대리점에 차를 입고하는 기능
  public void importCar() {
//    mustangs= new Mustang[]{
    cars = new Car[]{
        new Mustang(),
        new Stinger(),
        new Tucson(),
    };
  }

  //문자열과 정수의 논리를 배열에 담을 수 있는가?
  Object[] oArr = {
      50, 3.3, "zz", false, new Mustang()
  };

  public void runTest() {
    importCar(); //차 입고
    for (Car car : cars) {
      car.accelerate();
    }
  }

  // 차를 고객에게 인도하는 기능
  public Car exportCar(int money) {
    if (money == 6000) {
      return new Mustang();
    } else if (money == 5000) {
      return new Mustang();
    } else if (money == 3000) {
      return new Mustang();
    } else {
      return null;
    }
  }
}
