package day05.member;

import java.time.LocalDate;

//기능은 하나에 하나씩!
public class Member {
  public LocalDate regDate;
  // 역할 : 한명의 회원정보를 묶어주는 역할
  String email;
  String password;
  String memberName;
  int memberId;
  Gender gender; // a N 열거형 생성!
  int age;

  public Member(String email, String password, String memberName, int memberId, Gender gender, int age) {
    this.email = email;
    this.password = password;
    this.memberName = memberName;
    this.memberId = memberId;
    this.gender = gender;
    this.age = age;
  }

  // 회원정보를 문자열로 만들어서 리턴하는 기능
  public String inform() {
    // this. 생략가능 하나 쓰도록!!
   String convertGender = (gender==Gender.MALE) ? "남성": "여성";
    return String.format("# %d번 | %s | %s | %s | %d세", this.memberId, this.email,this.memberName, convertGender,this.age);
  }
}
