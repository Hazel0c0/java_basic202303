package day07.inherit;

public class Mage extends Player {
  int mana; //마력 게이지

  public Mage(String nickName) {
    super(nickName);
    this.mana = 100;
  }

  @Override
  public void showStatus() {
    super.showStatus();
    System.out.println("# mana = " + mana);
  }

  // 썬더볼트
  public void thunderBolt() {
    System.out.println("thunderBolt 시전합니다.");
  }
}
