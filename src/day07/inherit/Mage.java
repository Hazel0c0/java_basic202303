package day07.inherit;

import day07.util.Utility;

import static day07.util.Utility.*;

public class Mage extends Player {


  int mana; // 마력 게이지

  public Mage(String nickName) {
    super(nickName);
    this.mana = 100;
  }


  // 썬더볼트
  public void thunderBolt(Player... targets) {
    System.out.printf("# %s님 썬더볼트 시전!\n",nickName);
    makeLine();
    for (Player target : targets) {
      int att = (int) (Math.random() * 40 + 10);
      System.out.println(target.nickName + "님이 " + att + "의 피해를 입었습니다.(남은 체력: " + (target.hp - att) + ")");
    }
  }

  @Override
  public void showStatus() {
    super.showStatus();
    System.out.println("# mana: " + this.mana);
  }
}
