package day01;

public class DataType {
    public static void main(String[] args) {
//        100;  //메모리에 저장
//        int a;  // 4바이트 공간 할당 이름을 a부여
//        a = 100;    //미리 저장된 100을 a에 복사

        // 실수리터럴은 기본 8바이트 할당
        // float 4바이트 : 다운캐스팅 필요 (F붙여주기)
        float f1 = 1.22223333334444f;
        // sout : System.out.println();
        // soutv : System.out.println("f1 = " + f1);
        System.out.println("f1 = " + f1);

        /*그냥 더블 쓰기 */
        double d1 = 1.222222233333334444;
        System.out.println("d1 = " + d1);

        // 논리타입
        boolean b1 = true;
        boolean b2 = false;

        // 문자 타입 : 한글자
        char c1 = 'A';

    }
}
