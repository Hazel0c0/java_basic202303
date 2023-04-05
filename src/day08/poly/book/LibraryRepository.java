package day08.poly.book;

import day04.array.StringList;

import static day08.poly.book.RentStatus.*;

// 도서관리 시스템 데이터 처리
public class LibraryRepository {

  // 회원 1명
  private static BookUser bookUser;

  // 도서들의 정보
  private static Book[] bookList;

  static {
    bookList = new Book[]{new CookBook("맘스터치", "햄벙", "패스트", true)
        , new CartoonBook("마나책", "마나 ", "노농", 15)
        , new CookBook("백족원의 집밥", "백종원", "tvN", false)
        , new CartoonBook("자바공부중", "김자바", "코딩", 19)
        , new CartoonBook("나랑노라", "왜안노라", "노라준다매", 7)
        , new CookBook("마싯는 마라탕 만들기", "햇매운맛", "샹궈", true)};
  }

  // 유저를 등록하는 기능
  public void register(BookUser userInfo) {
    // 유저정보를 받으면 유저 객체에 저장하는 기능
    bookUser = userInfo;
  }

  // 마이페이지 기능
    /*
        여기에 있는 bookUser 정보 리턴
     */
  BookUser findBookUser() {
    // ^ 호출하면 유저정보 리턴해주는 기능
    return bookUser;
  }

  // 모든 책의 정보를 알려주는 메서드
  public String[] getBookInfoList() {
    String[] infoList = new String[bookList.length];
    for (int i = 0; i < infoList.length; i++) {
      infoList[i] = bookList[i].info();
    }
    return infoList;
  }

  // 검색어를 받으면 해당검색어를 포함하는 제목을 가진
  // 책 정보들을 반환
  public String[] searchBookInfoList(String keyword) {
//    String[] infoList={};
// 전에만든 배열 메서드 재활용 --
    StringList list = new StringList();
    // bookList를 뒤져야함
    for (Book book : bookList) {
      String title = book.getTitle(); // 책 제목
      if (title.contains(keyword)) {
        // 검색어에 걸린 책 의 정보문자열
        String info = book.info();
        list.push(info);
      }
    }
    return list.getsArr();
  }

  public RentStatus findRantalBook(int rentalNum) {

    Book findRantalBook = bookList[rentalNum - 1];

    // 요리책인지 만화책인지 ck
    if (findRantalBook instanceof CookBook) {

      // 쿠폰 유무 ck
      boolean coupon = ((CookBook) findRantalBook).isCoupon();
      if (coupon) {
        bookUser.setCouponCount(bookUser.getCouponCount()+1); // 쿠폰 하나 증가된 값(get)을 set해준다
        return RENT_SUCCESS_WITH_COUPON;
      } else {
        return RENT_SUCCESS;
      }
    } else if (findRantalBook instanceof CartoonBook) {
      // 나이확인
      // 빌릴수 있었음녀 석세스 못빌리면 페일 리턴 (열거형)
      return RENT_SUCCESS;
    }

    return RENT_FAIL;
  }

}

