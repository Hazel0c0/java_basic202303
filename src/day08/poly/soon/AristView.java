package day08.poly.soon;

import day09.jwCompany.Artist;

import static day07.util.Utility.input;
import static day07.util.Utility.makeLine;

public class AristView {
  private final static ArtistRepository ar;

  static {
    ar = new ArtistRepository();
  }

  public static void start() {
    while (true) {
      System.out.println("**** 음악 관리 프로그램 ****");
      System.out.printf("# 현재 등록된 가수: %d명\n", ar.count());
      System.out.println("# 1. 노래 등록하기");
      System.out.println("# 2. 노래 정보 검색");
      System.out.println("# 3. 프로그램 종료");
      makeLine();
      int menuNum = Integer.parseInt(input(">> "));

      switch (menuNum) {
        case 1:
          insertProcess();
          break;
        case 2:
          searchProcess();
          break;
        case 3:
          System.out.println("# 프로그램을 종료합니다.");
          System.exit(0);
        default:
          System.out.println("# 메뉴를 잘못 입력했습니다!");

      }
    }
  }

  // 1번 메뉴 기능
  private static void insertProcess() {
    System.out.println("# 노래 등록을 시작합니다.");
    String artistName = input("- 가수명: ");
    String songName = input("- 곡명: ");

    // 신규 가수인 경우
    if (!ar.isRegistered(artistName)) {
      ar.addNewArtist(artistName, songName);
      System.out.println("# 아티스트 " + artistName + "님이 신규 등록되었습니다");
    } else { // 기존 가수인 경우
      boolean flag = ar.addNewSong(artistName, songName);
      if (flag) {
        System.out.printf("\n# %s님의 노래목록에 %s곡이 추가되었습니다.\n", artistName, songName);
      } else {
        System.out.printf("\n# [%s]곡은 이미 등록된 노래입니다.\n", songName);
      }
    }
  }

  // 2번 메뉴 기능
  private static void searchProcess() {
    System.out.println("\n# 검색할 가수명을 입력하세요.");
    String artistName = input("- 가수명: ");

    if (ar.isRegistered(artistName)) {
      // 등록된 경우
      System.out.printf("\n# %s님의 노래목록 \n", artistName);
      makeLine();
      String[] songList = ar.getSongList(artistName);
      for (int i = 0; i < songList.length; i++) {
        System.out.printf("* %d. %s\n", i+1, songList[i]);
      }
    } else {
      System.out.println("\n# 해당 가수는 등록되지 않았습니다.");
    }
  }
}
