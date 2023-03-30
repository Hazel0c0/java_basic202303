package day04.array;

public class main {
  public static void main(String[] args) {
    StringList foodList = new StringList("제육볶음","김치찌게");
    foodList.push("짜장면");
    foodList.push("볶음밥");

    StringList userNameList = new StringList();
    userNameList.push("박영히");
    userNameList.push("박박박");

    userNameList.pop();

    System.out.println("비었니?  "+foodList.isEmpty());
    foodList.clear();
    System.out.println("비었니?  "+foodList.isEmpty());

    System.out.println("foodList = " + foodList);
    System.out.println("foodList.size() = " + foodList.size());
    System.out.println("userNameList = " + userNameList);
    System.out.println("userNameList.size() = " + userNameList.size());
  }
}
