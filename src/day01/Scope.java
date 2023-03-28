package day01;

public class Scope {    // 클래스 이름 : 첫글자 대문자 !!
    public static void main(String[] args) {

        int userNumber = 1010;     // 캐멀

        // 자바는 블록단위 스코프를 가짐
        int n1 = 10;  // ctrl + D 복사
        int n2 = 20;  // main 블록에서 생성된 변수
        if (true)   {
//            int n1 = 200;     //자바에서는 안됨
            int n3 = n1 + n2;
        } // end if
//        System.out.println(n3);       //  사용못함
    } //end main
}
