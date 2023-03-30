package day04;

// 댄서의 설계도
// 설계도에는 main을 만들지 않습니다.

// *메인 메서드는 프로그램당 하나만 만들기!
// 실행용과 설계용이 구분이 된다

public class Dancer {

  // 속성 (필드)
  String dancerName; // 댄서 이름

  String crewName; // 크루 이름

  String genre; // 춤 장르

  int level; // 춤 수준 (0: 초보자, 1: 중수, 2: 고수)


  /*
   생성자 : 스카우터, 개발자(공돌이), 기술자
   생성자도 함수개념, 리턴타입이 주소값으로 고정
   리턴값을 생성한 객체의 주소값을 리턴
   객체 생성시 필요한 데이터를 셋팅
   */

  public Dancer() { // <-매개변수 (전해주고 나면 사라짐)
    dancerName = "갑돌이"; // 필드(Dancer가 사라지기 전까지는 사라지지 않음)
    crewName="크루크루";
    genre="아이돌댄스";
    level=DancerLevel.AMATUER;
  }

  public Dancer(String genre) {
    this.genre = genre;
  }

  public Dancer(String dancerName, String genre, int dancerLevel) {
    this.dancerName = dancerName;
    this.genre = genre;
    level = dancerLevel;
  }

  // 기능 (메서드) : static을 붙이지 마세요
  // 춤추는 기능
  void dance() {
    System.out.println("춤을 열정적으로 춥니다.");
  }

  // 스트레칭을 하는 기능
  void stretch() {
    System.out.println("몸을 유연하게 풉니다.");
  }

  // 자기소개 기능
  String introduce() {
    return String.format("내 이름은 %s이고, " +
            "%s팀에 소속되어 있습니다."
        , dancerName, crewName);
  }

}