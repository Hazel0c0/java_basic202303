package day01;

public class Casting {
  public static void main(String[] args) {
    /*
    +8 : 00001000
    1의보수 변환 : 비트 반전
    -8 : 11110111
    2의보수 변환 : +1
         11111000 = -8
    */
    /*
    타입이 다른 데이터의 연산
    큰 타입에 맞춰서 변환한 후 연산 진행
     */
    int k = 100;
    double j = 5.5;

    double v = k + j;

    char c1 = 'A';
    int alpha = 1;
    System.out.println(c1 + alpha);

    /*
    int보다 작은데이터(byte, short, char)끼리의 연산은
    무조건 둘 다 int로 변환된다
     */
    char c2 = 'B';
    char c3 = 'a';

    byte b1 = 100;
    byte b2 = 120;

    int b3 = b1 + b2;
    /*
    byte b3 = b1 + b2 --> error, 안전한 처리를 위해서
    b1 * b2 이렇게 되면 byte의 범위를 넘어갈 수 있기 때문에
    */


    int g = 24;
    // 둘 중에 한쪽만 바꿔주면 작은수가 큰 수를 따라가니까
    double result  = (double)g / 5.0;
    System.out.println("result = " + result);
  }
}
