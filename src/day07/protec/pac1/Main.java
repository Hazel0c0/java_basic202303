package day07.protec.pac1;

public class Main {
  public static void main(String[] args) {
    A c1 = new A();

    c1.a += 5;
    c1.b += 5;

    System.out.println("인스턴스 변수 c1.a: " + c1.a); //5
    System.out.println("정적 변수 c1.b: " + c1.b); //5

    A c2 = new A();

    c2.a += 7;
    c2.b += 7;

    System.out.println("인스턴스 변수 c2.a: " + c2.a); //7
    System.out.println("정적 변수 c2.b: " + c2.b); //12

    A c3 = new A();

    c3.a += 8;
    c3.b += 8;

    System.out.println("인스턴스 변수 c3.a: " + c3.a); //8
    System.out.println("정적 변수 c3.b: " + c3.b); //20

    System.out.println("정적 변수 c1.b: " + c1.b); //20
    System.out.println("정적 변수 c2.b: " + c2.b); //20
    System.out.println("======================");
    A.b++;
    A.b++;

    System.out.println("정적 변수 Count.b: " + A.b);
  }
}
