package day05.member;

import day05.member.Gender;
import day05.member.Member;

// 역할 : 회원 저장소 역할
public class MemberRepository {
  // 실제 데이터 처리는 여기서

  Member[] memberList;

  MemberRepository() {
    this.memberList = new Member[3]; // 선가입회원 3명 있어
    // ctrl P 누르면 변수 도움 줌
    memberList[0] = new Member("jiwon@gmail.com", "1234",
        "지워니", 1, Gender.FEMALE, 27);
    memberList[1] = new Member("jiji@gmail.com", "4567",
        "나암자", 2, Gender.MALE, 22);
    memberList[2] = new Member("eeee@gmail.com", "7777",
        "여어자", 3, Gender.FEMALE, 25);
  }

  /**
   * 모든 회원 정보를 출력해주는 메서드
   */
  void showMembers() {
    System.out.printf("============현재 회원정보 (총%d명) ==============\n"
        , memberList.length);
    for (Member m : memberList) {
      System.out.println(m.inform());
    }
  }

  /**
   * 회원가입 기능 : push
   *
   * @return : 회원가입 성공 여부
   * 성공시  true, 이메일 중복되어 실패시 false
   * parma : 매개변수
   * @param1 - newMember: 새롭게 회원가입하는 회원의 정보
   */
  boolean addMember(Member newMember) {

    // 이메일이 중복인가?
    if (isDuplicateEmail(newMember.email)) return false;

    // 실제로 멤버를 추가하는 코드
    Member[] temp = new Member[memberList.length + 1];
    for (int i = 0; i < memberList.length; i++) {
      temp[i] = memberList[i];
    }
    temp[temp.length - 1] = newMember;
    memberList = temp;

    return true;
  }

  /**
   * /**하면 자동으로 만들어짐
   * 이메일의 중복여부를 확인하는 기능
   *
   * @param targerEmail : 검사 대상 이메일
   * @return : 중복되었을 시 true, 사용가능할 시 false
   */
  boolean isDuplicateEmail(String targerEmail) {
    return findByEmail(targerEmail) != null;

//    return (findByEmail(targerEmail) == null) ? false : true;

//    for (Member m : memberList) {
//      if (targerEmail.equals(m.email)) {
//        return true;
//      }
//    }
//    return false;
  }

  // 마지막 회원의 번호를 알려주는 기능
  int getLastMemberId() {
    return memberList[memberList.length - 1].memberId;
  }

  /**
   * 이메일을 통해 특정 회원 객체를 찾아서 반환하는 기능
   *
   * @param email : 찾고 싶은 회원의 이메일
   * @return : 찾은 회원의 객체정보, 못찾으면 null 반화
   */
  Member findByEmail(String email) {
    for (Member m : memberList) {
      if (email.equals(m.email)) {
        return m;
      }
    }
    return null;
  }
}

