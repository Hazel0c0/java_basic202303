package day09.jwCompany;

import java.util.Arrays;

public class Artist {
  private String singer;
  private String songList;

//  생성자
  public Artist() {
  }

  public Artist(String singer, String songList) {
    this.singer = singer;
    this.songList = songList;
  }

  public String getSinger() {
    return singer;
  }

  public void setSinger(String singer) {
    this.singer = singer;
  }

  public String getSongList() {
    return songList;
  }

  public void setSongList(String songList) {
    this.songList = songList;
  }

  public void info() {
    System.out.println("가수명: "+this.singer);
    System.out.println("노래 목록: "+this.songList);
//    System.out.println("노래 목록: "+ Arrays.toString(this.songList));
  }
}
