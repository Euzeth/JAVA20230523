package kr.koreait.bookShop;

import java.util.Date;

public class BookShop {
	
	public static void main(String[] args) {
		
		BookList bookList = new BookList(5);
		
//		Date date = new Date();				//현재 컴퓨터 시스템의 날짜와 시간을 얻어온다.
//		Date date = new Date(년, 월, 일);		//입력한 년,월,일에 해당하는 날짜를 만든다.	
//		날짜를 만들거나 입력하는 경우 Date 클래스는 1900년 기준으로 처리하므로 년은 1900을 빼서 입력한다.
//		월을 입력할 때는 1을 빼서 입력해야 정상적으로 처리된다.
		BookVO book1 = new BookVO("자바", "홍길동", "코리아출판사", new Date(2015, 5, 15), 35000);
		BookVO book2 = new BookVO("자바", "홍길자", "코리아출판사", new Date(2015, 5, 15), 35000);
		BookVO book3 = new BookVO("자바", "홍길숙", "코리아출판사", new Date(2015, 5, 15), 35000);
		BookVO book4 = new BookVO("자바", "홍길희", "코리아출판사", new Date(2015, 5, 15), 35000);
		BookVO book5 = new BookVO("자바", "홍길영", "코리아출판사", new Date(2015, 5, 15), 35000);
		BookVO book6 = new BookVO("자바", "홍길수", "코리아출판사", new Date(2015, 5, 15), 35000);
		
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		bookList.addBook(book6);
		
		System.out.println(bookList);
	}
}
