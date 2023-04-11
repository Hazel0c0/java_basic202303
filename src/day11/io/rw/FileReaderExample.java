package day11.io.rw;

import day11.io.objstream.Path;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
  public static void main(String[] args) {
    try (FileReader fr = new FileReader(Path.ROOT_PATH+"/메롱.txt")){

      BufferedReader br = new BufferedReader(fr);
      String s = br.readLine();
      System.out.println("s = " + s);

//      int read = fr.read();
//      System.out.println((char)read);//얘도 반복문 돌려야함

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
