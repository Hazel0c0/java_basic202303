package day09.jwCompany;

import static day07.util.Utility.*;

public class MusicVIew {

  static Artist art;
  static MusicRepository repository;

  static {
    // new 해줘야 태어난거 ( 아니면 null)
    art = new Artist();
    repository = new MusicRepository();
  }

  public static void main(String[] args) {
    while (true) {
      int selectNum = menu();
      selectNumber(selectNum);
    }
  }

  static int menu() {
    System.out.println("**** 음악 관리 프로그램 ****");
    System.out.println("# 현재 등록된 가수: 1명");
    System.out.println("# 1. 노래 등록하기");
    System.out.println("# 2. 노래 정보 검색");
    System.out.println("# 3. 프로그램 종료");
    makeLine();
    return Integer.parseInt(input(">> "));
  }

  static void selectNumber(int n) {
    switch (n) {
      case 1:
        System.out.println("# 노래 등록을 시작합니다.");
        String name = input("- 가수명: ");
        String song = input("- 곡명: ");

        // 신규 등록 확인 (가수명 유무 체크)
        Artist newArt=repository.newArtist(name, song);
        if (newArt == null) { // 신규회원임
//        if (!repository.newArtist(name, song)) {
          System.out.println("# 아티스트 " + name + "님이 신규 등록되었습니다");
          break;
        }
        // 신규 가수 아니라면
        // 곡 추가해주기 > 곡명 중복 확인 기능
//        repository.Duplication(newArt,song);
        System.out.println();
        break;
      case 3:
        System.out.println("# 프로그램을 종료합니다.");
        System.exit(0);
    }
  }
}
