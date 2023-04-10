package day11.api.obj;

import java.util.List;

public class Pen extends Object {

  long serial; // 시리얼 번호
  String color; // 색상
  int price; // 가격

  public Pen(long serial, String color, int price) {
    this.serial = serial;
    this.color = color;
    this.price = price;
  }
}