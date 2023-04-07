package day10.exception;

public class LoginUser {

  String userAccount; // 가입된 계정명
  String userPassword; // 가입시 설정한 패스워드

  public LoginUser(String userAccount, String userPassword) {
    this.userAccount = userAccount;
    this.userPassword = userPassword;
  }

  // 로그인 검증
  public String loginValidate(String inputAccount, String inputPassword)
    throws Exception{

    // 회원 계정이 존재하는가?
    if ( userAccount.equals(inputAccount)){
      // 패스워드가 일치하는가?
      if (userPassword.equals(inputPassword)){
        // 로그인 성공
        return "SUCCESS";
      }else{
        // 패스워드 틀림
        throw new Exception("비밀번호 똑바루 치세요");
        // exception 클래스의 생성자를 호출 한것
      }
    }else {
      // 계정정보가 틀림
        throw new LoginValidateException("회원가입부터 해!");
        // Exception > LoginValidateException 사용자 정의
    }
  }
}
