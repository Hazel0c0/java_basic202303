package day05.player;

public class Player {

  // 필드
  String nickName; // 캐릭터 닉네임
  int level; // 레벨
  int hp; // 체력

  // 생성자

  public Player(String inputName) {
    System.out.println("2번 생성자 호출!");
    nickName = inputName;
    level = 1;
    hp = 50;
  }

  public Player() {
    // alt N  선택안함
    this("이름없음");
    System.out.println("1번 생성자 호출!");
//    nickName = "이름없음";
//    level = 1;
//    hp = 50;
  }

  // 기능 - 메서드
  void attack(Player this, Player target) { //Player 타입 this 가 생략되어있음
    // 맞은녀석의 체력을 10~15 랜덤으로 감소시킬거임
    int damage = (int) (Math.random() * 6 + 10);
    target.hp -= damage;

    // 전투로그를 출력할거임
    // "가해자가 피해자를 공격해서 xxx의 피해를 입힘"
    System.out.printf("%s님이 %s님을 공격해서 %d의 피해를 입힙!\n"
        , this.nickName, target.nickName, damage);
  }


}