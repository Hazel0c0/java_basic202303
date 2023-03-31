package day05.member;

public class Test {
  public static void main(String[] args) {
    MemberRepository mr = new MemberRepository();

    Member kong = new Member("abc@def.com",
        "1234","콩벌레",4,
        Gender.MALE, 50);

    mr.addMember(kong);
    mr.addMember(kong);
    mr.showMembers();

    boolean flag = mr.isDuplicateEmail("abc@def.com");
    boolean flag2 = mr.isDuplicateEmail("abcc@def.com");
//    System.out.println("flag = " + flag);
//    System.out.println("flag2 = " + flag2);
  }
}
