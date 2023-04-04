package day07.qulz.idol;

import java.lang.reflect.Member;

public class GirlGroup {
  public String groupName;
  public Member[] members;
  public int currentNum;

  public GirlGroup(String groupName, int number) {
    this.groupName = groupName;
    this.currentNum = number;
  }

  public void addMembers(Member[] members) {

  }
}
