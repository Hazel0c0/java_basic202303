package day07.inherit;

// 수퍼클래스 ( 부모 클래스, 상위클래스) : 객체의 공통기능과 속성을 설계
public class Player {
  String nickName;
  int level;
  int hp;
  int exp;

  public Player() {
    System.out.println("Player의 생성자 호출");
  }

  public Player(String nickName) {
    System.out.println("Player(N)의 생성자 호출");
    this.nickName = nickName;
    this.level = 1;
    this.hp = 50;
  }

  // 캐릭터 상태창을 보는 기능
  public void showStatus() {
    System.out.println("\n======= Character's Info =========");
    System.out.println("# name: " + this.nickName);
    System.out.println("# level: " + this.level);
    System.out.println("# hp: " + this.hp);
  }
}
