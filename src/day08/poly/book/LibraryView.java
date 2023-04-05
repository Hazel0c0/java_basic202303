package day08.poly.book;

import day05.member.Gender;

import static day05.member.Gender.*;
import static day07.util.Utility.*;

public class LibraryView {

  //    public static Scanner sc;
  private static LibraryRepository repository;

  // static 데이터는 생성자에서 초기화하면 안됨.
  // static필드의 초기화는 static initializer를 사용
  static {
//        System.out.println("정적 초기화자 호출!");
//        sc = new Scanner(System.in);
    repository = new LibraryRepository();
  }

  // 회원정보 입력처리
  private static void makeNewBookUser() {
    System.out.println("\n# 회원 정보를 입력해주세요.");
//    String name = input("# 이름: ");
    String name = "찌오니";
//    int age = Integer.parseInt(input("# 나이: "));
    int age = 27;
//    Gender gender = inputGender();
    Gender gender = FEMALE;

    // 입력받은 데이터 객체로 포장
    BookUser userInfo = new BookUser();
    userInfo.setName(name);
    userInfo.setAge(age);
    userInfo.setGender(gender);

    // 입력받은 유저객체를 저장소로 보내기
    repository.register(userInfo);

  }

  // 정확하게 성별을 입력할때까지 반복 입력받는 메서드
  private static Gender inputGender() {
    while (true) {
      String inputGender = input("# 성별(M/F): ");
      Gender gender;
      switch (inputGender.toUpperCase().charAt(0)) {
        case 'M':
          return MALE;
        case 'F':
          return FEMALE;
        default:
          System.out.println("\n# 성별을 잘못 입력했습니다.");
      }
    }
  }

  // 화면 처리
  public static void start() {

//    makeNewBookUser();

    // 메인 메뉴 띄우기
    while (true) {
      showMainScreen();
      selectMenu();
    }
  }

  // 메뉴 번호를 입력받고 분기를 나눠주는 메서드
  private static void selectMenu() {
    int menuNum = Integer.parseInt(input("- 메뉴 번호 : "));

    switch (menuNum) {
      case 1:
        // 마이페이지: 가입한 회원정보 출력
        // 정보내놔
        BookUser user = repository.findBookUser();
        System.out.println("\n******** 회원님 정보 ********");
        System.out.println("# 회원명: " + user.getName());
        System.out.println("# 나이: " + user.getAge());
        System.out.println("# 성별: " + user.getGenderToString());
        System.out.println("# 쿠폰개수: " + user.getCouponCount());
        break;
      case 2:
        System.out.println("\n========= 모든 도서 정보 =============");
        allBookInfo(menuNum);
        break;
      case 3:
        // 사용자에게 검색어 입력 받기
        String keyword = input("# 검색어: ");

        // 저장소에 해당 검색어를 주면서 검색에 걸린 책 정보를 내노라고
        String[] bookInfoList = repository.searchBookInfoList(keyword);
        for (String info : bookInfoList) {
          System.out.println(info);
        }
        break;
      case 4:
        break;
      case 5:
        // 대여가능한 책의 목록을 번호와 함께 출력
        System.out.println("========== 대여 도서 목록 =============");
        allBookInfo(menuNum);

        int rentalNum = Integer.parseInt(input("\n# 대여할 도서 번호 입력 : "));
        RentStatus rentStatus = repository.findRantalBook(rentalNum);// 찾은 책
        retalBook(rentStatus);
        break;
      case 9:
        System.out.println("# 프로그램을 종료합니다.");
        System.exit(0);
        break;
      default:
        System.out.println("\n# 메뉴번호를 똑바로 입력하라고~~~");
    }
  }

  private static void retalBook(RentStatus rentStatus) {
    switch (rentStatus) {
      case RENT_SUCCESS:
        System.out.print("성공적으로 대여되었습니다. ");
        break;
      case RENT_FAIL:
        System.out.println("대여 실패..ㅜㅜ 그 책이 없어요");
        break;
      case RENT_SUCCESS_WITH_COUPON:
        System.out.println("대여 성공 ~!~! 인요리학원 쿠폰이 발급되었으니 마이페이지를 확하세요");
        break;
    }
  }

  private static void allBookInfo(int menuNum) {
    String[] infoList = repository.getBookInfoList();
    int bookNum = 1;
    for (String info : infoList) {
      switch (menuNum) {
        case 2:
          System.out.println(info);
          break;
        case 5:
          System.out.printf("%d번째 도서. %s\n", bookNum++, info);
          break;
      }
    }
  }

  // 메인 메뉴창을 출력하는 메서드
  private static void showMainScreen() {
    System.out.println("\n============ 도서 메뉴 ==============");
    System.out.println("# 1. 마이페이지");
    System.out.println("# 2. 도서 전체 조회");
    System.out.println("# 3. 도서 검색 (책제목)");
    System.out.println("# 4. 도서 검색 (저자명)");
    System.out.println("# 5. 도서 대여하기"); // 만화책 , 요리책 구분해야함
    System.out.println("# 9. 프로그램 종료하기");
  }
}
