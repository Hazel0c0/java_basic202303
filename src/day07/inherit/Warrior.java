package day07.inherit;

// 서브 클래스 ( 자식클래스 , 하위클래스)
public class Warrior extends Player {
  int rage; //분노 게이지

  public Warrior(String nickName) {
    super();
    this.nickName = nickName;
    this.level = 1;
    this.hp = 50;
    this.rage = 20;
  }
  @Override // 오버라이딩 검사
  public void showStatus() {
    System.out.println("\n======= Character's Info =========");
    System.out.println("# name: " + this.nickName);
    System.out.println("# level: " + this.level);
    System.out.println("# hp: " + this.hp);
    System.out.println("# rage = " + rage);
  }

  // 파워슬래시
  public void powerSlash() {
    System.out.println("파워슬래시를 시전합니다.");
  }
}
