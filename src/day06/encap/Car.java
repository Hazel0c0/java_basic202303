package day06.encap;

public class Car {
  //필드의 정보는 막는것을 추천 ( 안정성)
  private String model; //모델명
  private int speed;  //현재 속도
  private char mode; // 변속 모드 D N R P
  private boolean start; // 시동 on/off 상태

  // 생성자
  public Car(String model){
    // int , boolean 은 기본값 0, false라서 설정하지 않아도 됨
    this.model=model;
    this.mode='P';
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    if (speed<0 || speed>200) return;
    this.speed = speed;
  }

  public char getMode() {
    return mode;
  }

  public void setMode(char mode) {
    this.mode = mode;
  }

  public boolean isStart() {
    return start;
  }

  public void setStart(boolean start) {
    this.start = start;
  }

  // 시동 거는 기능
  public void engineStart() {
    System.out.println("시동 버튼을 눌렀습니다.");
    injectOil();
    inject();
    this.start = true;
    moveCylinder();
    System.out.println("시동이 걸렸습니다.");
  }


  // 엔진에 연료가 주입되는 기능
  private void inject() {
    System.out.println("연료가 주입됩니다.");
  }
  // 엔진오일이 주입되는 기능
  private void injectOil() {
    System.out.println("엔진 오일이 순환합니다.");
  }
  // 실린더가 움직이는 기능
  private void moveCylinder() {
    if (start) {
      System.out.println("실린더가 움직입니다.");
    } else {
      System.out.println("차가 고장났습니다.");
    }
  }
}
