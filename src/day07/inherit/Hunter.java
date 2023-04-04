package day07.inherit;

public class Hunter extends Player {


  int concentration; //마력 게이지

  public Hunter(String nickName) {
    super(nickName);
    this.concentration = 100;
  }

  @Override
  public void showStatus() {
    super.showStatus();
    System.out.println("# concentration = " + concentration);
  }

  // 썬더볼트
  public void summonBeast() {
    System.out.println("summonBeast 시전합니다.");
  }
}
