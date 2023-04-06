package day09.jwCompany;

public class MusicRepository {

  Artist[] artList;
  Artist art;


  //가수이름 중복 확인 기능
  public Artist newArtist(String name, String song) {

    for(Artist a : artList){
      if (a.getSinger().equals(name))
        return a; // 중복되면 해당 가수 객체 리턴
    }
    // 중복 아니면 new 가수 객체 생성
    art=new Artist(name,song);
    System.out.println("신규 가수 추가함:"+art);
    return null; // 중복아니면 null 리턴
  }
//  public boolean newArtist(String name, String song) {
//
//    for(Artist a : artList){
//      if (a.getSinger().equals(name))
//        return true;
//    }
//    // 중복 아니면 new 가수 객체 생성
////    art=new Artist(name,song);
//    System.out.println("신규 가수 추가함:"+art);
//    return false;
//  }

  // 중복곡 체크 + 중복아니라면 곡 저장
  public void Duplication(Artist art, String song) {
    for(Artist a : artList){
//      if (a.getSong().equals(song)){
//        System.out.println();
//      }

    }
  }
}
