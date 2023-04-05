package day08.poly.car;
//운전자 객체
public class Driver {
  public void drive(Car c){
    System.out.println("운전을 시작합니다");
    c.accelerate();

  }

//  public void driveMustang(Mustang m){
  /*
  public void drive(Mustang m){
    System.out.println("운전을 시작합니다");
    m.accelerate();
  }
  public void drive(Stinger m){
    // drive 로 여러 자동차 이용할 수 있도록
    // -> 오버로딩
    System.out.println("운전을 시작합니다");
    m.accelerate();
  }

   */
}
