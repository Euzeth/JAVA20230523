package Ch29.Controller;

import java.util.Map;

import Ch29.Domain.common.Dto.BookDto;

public class BookController {
	
	//1 Select, 2 Insert, 3 Update, 4 Delete
	public void execute(int serviceNo, Map<String, Object> param) {
		
		if(serviceNo==1) {
			//1 파라미터 추출(생략)
			//2 입력값 검증(생략)
			//3 서비스 실행(서비스모듈작업 이후 처리)
			//4 View로 전달
			System.out.println("Book_Select Block!");
		}
		else if(serviceNo==2) {
			//1 파라미터 추출
			Integer bookcode = (Integer)param.get("bookcode");
			String bookname = (String)param.get("bookname");
			String publisher = (String)param.get("publisher");
			String isbn = (String)param.get("isbn");
			//2 (데이터)입력값 검증
			if(bookcode==null||bookname==null||publisher==null||isbn==null) {
				System.out.println("[ERROR] Data Validation Check Error!");
				return ; //함수종료
			}
			//3 서비스 실행
			BookDto dto = new BookDto(bookcode, bookname, publisher, isbn);
			System.out.println("Dto : " + dto);
			//4 View로 전달
			System.out.println("Book_Insert Block!");
		}
		else if(serviceNo==3) {
			//1 파라미터 추출
			Integer bookcode = (Integer)param.get("bookcode");
			String bookname = (String)param.get("bookname");
			String publisher = (String)param.get("publisher");
			String isbn = (String)param.get("isbn");
			//2 (데이터)입력값 검증
			if(bookcode==null||bookname==null||publisher==null||isbn==null) {
				System.out.println("[ERROR] Data Validation Check Error!");
				return ; //함수종료
			}
			//3 서비스 실행
			BookDto dto = new BookDto(bookcode, bookname, publisher, isbn);
			System.out.println("Dto : " + dto);
			//4 View로 전달
			System.out.println("Book_Update Block!");
		}
		else if(serviceNo==4) {
			//1 파라미터 추출
			Integer bookcode = (Integer)param.get("bookcode");
//			String bookname = (String)param.get("bookname");
//			String publisher = (String)param.get("publisher");
//			String isbn = (String)param.get("isbn");
			//2 (데이터)입력값 검증
			if(bookcode==null) {
				System.out.println("[ERROR] Data Validation Check Error!");
				return ; //함수종료
			}
			//3 서비스 실행
			//4 View로 전달
			System.out.println("Book_Delete Block!");
		}
		
	}

}