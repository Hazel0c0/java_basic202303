package day08.poly.soon;

import day04.array.StringList;

import java.io.*;
import java.util.Map;

public class ArtistRepository {
  private static Artist[] artistList; // 가수 배열

  static {
    artistList = new Artist[0];
  }

  // 신규 가수를 첫 노래와 함께 배열에 추가하는 기능
  public void addNewArtist(String artistName, String songName) {
//    // 1. 가수 객체 생성
//    Artist artist = new Artist();
//
//    // 2. 생성된 가수 객체에 전달받은 이름 셋팅
//    artist.setName(artistName);
//
//    // 3. 생성된 가수 객체에 노래 목록 생성해서 셋팅
//    artist.setSongList(new StringList());
//
//    // 4. 해당 노래목록에 전달받은 노래 추가
//    artist.getSongList().push(songName);

    Artist artist = new Artist(artistName, new StringList(songName));

    // 5. 가수배열에 해당 가수 객체 추가
    Artist[] temp = new Artist[artistList.length + 1];
    for (int i = 0; i < artistList.length; i++) {
      temp[i] = artistList[i];
    }
    temp[temp.length - 1] = artist;
    artistList = temp;
  }

  // 가수명을 받아서 해당 가수가 등록된 가수인지 확인하는 기능
  public boolean isRegistered(String artistName) {
    for (Artist list : artistList) {
      if (list.getName().equals(artistName))
        return true;
    }
    return false;
  }

  // 가수명을 통해 가수 객체 정보를 반환하는 기능
  public Artist findArtistByName(String artistName) {
    for (Artist artist : artistList) {
      if (artistName.equals(artist.getName())) {
        return artist;
      }
    }
    return null;
  }

  // 기존 가수 객체에 노래를 추가하는 기능
  public boolean addNewSong(String artistName, String songName) {
    //1. 기존 가수정보를 불러온다
    Artist foundArtist = findArtistByName(artistName);
    //2. 그 가수 객체에서 노래 목록을 빼온다.
    StringList songList = foundArtist.getSongList();
    //3. 그 노래목록에 새 노래를 추가한다.
    if (!songList.includes(songName)) {
      songList.push(songName);
      return true;
    }
    return false;
  }

  // 특정 가수의 노래목록을 반환하는 기능
  public String[] getSongList(String artistName) {
    return findArtistByName(artistName).getSongList().getsArr();
  }

  // 등록된 가수의 수 반환
  public int count() {
    return artistList.length;
  }

  // 자동 세이브 기능
  public void autoSave() {

    File f = new File("D:/music");
    if (!f.exists()) f.mkdir();

    try (ObjectOutputStream oos
             = new ObjectOutputStream(
        new FileOutputStream("D:/music/m.sav")
    )) {
      oos.writeObject(artistList);

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

  // 자동 로드 기능
  public void loadFile() {

    // 세이브파일이 존재한다면
    File f = new File("D:/music/m.sav");

    if (f.exists()) {
      // 로드해라~
      try (ObjectInputStream ois =
               new ObjectInputStream(
                   new FileInputStream(f)
               )) {

//        artistList = (Map<String, Artist>) ois.readObject();

      } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
