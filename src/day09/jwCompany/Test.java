package day09.jwCompany;

import day04.array.StringList;

public class Test {
  public static void main(String[] args) {
    // 가수 객체 생성
    Artist[] artist={};
    String[] songList={};
    artist = new Artist[]{
        new Artist("거거거", "나나나"),
        new Artist("22", "나22나나"),
        new Artist("거33거거", "나나33나")
    };
    StringList sList;
//    songList.push("다다다");
    for (Artist a: artist) {
      a.info();
    }
  }
}
