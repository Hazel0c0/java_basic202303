package day10.exception;

public class UserMain {
  public static void main(String[] args) {
    LoginUser user = new LoginUser("aaa","1234");

    try {
      user.loginValidate("aaa","1111");
    } catch (Exception e) {
      // getMessage : 에러원인 메세지를 리턴
      System.out.println(e.getMessage());
    }
  }
}
