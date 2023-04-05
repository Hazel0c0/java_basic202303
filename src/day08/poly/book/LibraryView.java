package day08.poly.book;

import day05.member.Gender;

import java.util.Scanner;

import static day05.member.Gender.*;
import static day07.util.Utility.input;

public class LibraryView {
  private static Scanner sc;
  private static LibraryRepository repository;

  // static 데이터는 새성자에서 초기호ㅏ 하면 안됨
  // static 필드의 초기화는 static initializer 를 사용
  static {
    System.out.println("정적 초기화 자동 호출");
    sc = new Scanner(System.in);
    repository = new LibraryRepository();
  }

  // 회원 정보 입력 처리
  private static void makeNewBookUser() {
    System.out.println("\n# 회원 정보를 입력해주세요");
    String name = input("# 이름 : ");
    int age = Integer.parseInt(input("# 나이 : "));
    Gender gender = inputGender();

    // 입력받은 데이터 객체로 포장
    BookUser userInfo = new BookUser();
    userInfo.setName(name);
    userInfo.setAge(age);
    userInfo.setGender(gender);
  }

  // 입력받은 유저 객체를 저장소로 보내기


  // 정확하게 성별 입력할 때 까지 반복 입력받는 메서드
  private static Gender inputGender() { // c a N
    while (true) {
      String inputGender = input("# 성별(M/F) : ");
      Gender gender;
      switch (inputGender.toUpperCase().charAt(0)) {
        case 'M':
          return MALE;
        case 'F':
          return FEMALE;
        default:
          System.out.println("\n 성별을 잘못 입력했습니다");
      }
    }
  }


  // 화면처리
  public static void start() {
    makeNewBookUser();

    //메인 메뉴 띄우기
    while (true) {
      showMainScreen();

      selectMenu();
    }
  }

  private static void selectMenu() {
    int menu = Integer.parseInt(input(" - 메뉴 번호 : "));

    switch (menu) {
      case 1:
        // 마이페이지 : 가입한 회원정보 출력
        BookUser user = repository.findBookUser();
        System.out.println("\n*********** 회원 정보 *************");
        System.out.println("# 회원명 : "+user.getName());
        System.out.println("# 나이 : "+user.getAge());
        System.out.println("# 성별 : "+user.getGenderToString());
        System.out.println("# 쿠폰 개수 : "+user.getCouponCount());
        break;
      case 2: // 도서 전체 조회
        fullSearch();
        break;
      case 3:
        break;
      case 4:
        break;
      case 9:
        System.out.println("# 프로그램을 종료합니다");
        System.exit(0);
        break;
      default:
        System.out.println("\n# 메뉴번호를 다시 입력하세요");
    }
  }

  // 메인 메뉴창을 출력하는 메서드
  private static void showMainScreen() {
    System.out.println("================== 도서 메뉴 ====================");
    System.out.println(" # 1. 마이페이지");
    System.out.println(" # 2. 도서 전체 조회");
    System.out.println(" # 3. 도서 검색");
    System.out.println(" # 4. 도서 대여하기");
    System.out.println(" # 9. 프로그램 종료하기");
  }
  private static void fullSearch() {
//    Book toonBook = new CartoonBook();
//    Book cookBook = new CookBook();

    //book[0] = new CookBook("백족원의 집밥", "백종원", "tvN", true);

    //System.out.println(book[0]);
//    book[1]=new CookBook("백족원의 집밥", "백종원", "tvN", true);
//    book[2]=new CookBook("백족원의 집밥", "백종원", "tvN", true);
//    book[3]=new CookBook("백족원의 집밥", "백종원", "tvN", true);
//    book[4]=new CookBook("백족원의 집밥", "백종원", "tvN", true);
//    System.out.println("번째 도서 : "+cookBook);
  }
}
