package day05.member;

import java.util.Scanner;

// 역할 : 회원관리 앱의 입출력을 담당
public class MemberView {
  Scanner sc;
  MemberRepository mr; // 협력, 의존관계

  public MemberView() {
    // this 붙여주기!
    this.sc = new Scanner(System.in); // 필드보다는 생성자를 통해 초기화 하는게 좋음
    this.mr = new MemberRepository();
  }

  /**
   * 초기 메인화면을 출력
   */
  void mainView() {
    System.out.println("\n#### 회원관리 시스템 ####");
    System.out.println("* 1. 회원 정보 등록하기");
    System.out.println("* 2. 개별회원 정보 조회하기");
    System.out.println("* 3. 전체회원 정보 조회하기");
    System.out.println("* 4. 회원 정보 수정하기");
    System.out.println("* 5. 회원 정보 삭제하기");
    System.out.println("* 6. 프로그램 종료");
    System.out.println("* ========================");
  }

  /**
   * 프로그램 화면 흐름을 제어하는 기능
   */
  void viewProcess() {

    while (true) { // c a T > while
      mainView();
//    input(">> "); // ctrl alt M
      String menuNum = input(">> ");

      switch (menuNum) {
        case "1":
          signUp();
          break;
        case "2": // 이메일을 통한 회원 정보 조회
          showDetailMember();
          break;
        case "3":
          mr.showMembers();
          stop();
          break;
        case "4":
          break;
        case "5":
          break;
        case "6":
          String answer = input("# 정말로 종료합니까? [y/n] : ");
          if (answer.toLowerCase().charAt(0) == 'y') {
            System.out.println("# 프로그램을 종료합니다.");
            System.exit(0);
          } else {
            continue;
          }
          break;

      }
    }
  }

  String input(String message) {
    System.out.print(message); // ctrl alt P : 위임
    return sc.nextLine();
  }

  // 엔터를 누르기전까지는 멈추는 기능
  void stop() {
    System.out.println("\n======= 엔터를 눌러서 계쏙 ... =========");
    sc.nextLine();
  }

  // 회원 등록 입력 처리
  void signUp() {
    System.out.println("\n 회원 등록을 시작합니다~!~!");
    String email;
    while (true) {
      email = input("# email : ");
      if (!mr.isDuplicateEmail(email)) {
        break;
      }
      System.out.println("# 중복된 이메일 입니다 T_T");
    }
    String name = input("# name : ");
    String password = input("# password : ");

    Gender gender;
    checkGender:
    while (true) {  // checkGender라벨 붙여주기
      String inputGender = input("# 성별 [M/F] : ");
      switch (inputGender.toUpperCase().charAt(0)) {
        case 'M':
          gender = Gender.MALE;
          break checkGender;
        case 'F':
          gender = Gender.FEMALE;
          break checkGender;
        default:
          System.out.println("# 성별을 M/F로 정확히 입력해주세요");
      }
    }
    int age = Integer.parseInt(input("# 나이 : "));

    // 실제 저장 명령
    Member newMember = new Member(email, password, name, mr.getLastMemberId() + 1, gender, age);
    ;
    mr.addMember(newMember);

    System.out.println("\n# 회원 가입 성공!!");
    stop();
  }

  // 회원 개별조희를 위한 입출력처리
  /*
  void showDetailMember() {
    //이메일을 입력하세요!
    System.out.println("# 조회를 시작합니다~");
    System.out.print("# 이메일 : ");

    // 찾은 회원 정보 출력
    while (true) {
      String inputEmail = sc.nextLine();
      Member findMember = mr.findByEmail(inputEmail);
      if (findMember != null) {
        System.out.println(findMember.inform());
//         System.out.printf("# 이름 : %s\n#비밀번호 : %s\n# 성별 : ");
        stop();
        break;
      }
      System.out.println("# 조회된 회원이 없습니다.\n");
      System.out.print("# 이메일을 다시 입력해주세요 : ");
    }
    */
    void showDetailMember() {
      // 이메일 입력하세요!
      String inputEmail = input("# 조회를 시작합니다!\n# 이메일: ");
      Member foundMember = mr.findByEmail(inputEmail);
      // 찾은 회원의 정보 ~~~~~~
      if (foundMember != null) {
        System.out.println("\n========= 조회 결과 =========");
        System.out.printf("# 이름: %s\n", foundMember.memberName);
        System.out.printf("# 비밀번호: %s\n", foundMember.password);
        System.out.printf("# 성별: %s\n", (foundMember.gender == Gender.MALE) ? "남성" : "여성");
        System.out.printf("# 나이: %d세\n", foundMember.age);
      } else {
        System.out.println("\n# 조회된 회원이 없습니다.");
      }
      stop();
    }
  }
}
