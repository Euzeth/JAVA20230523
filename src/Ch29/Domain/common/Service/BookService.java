package Ch29.Domain.common.Service;

import java.util.List;

import Ch29.Domain.common.Dao.BookDao;
import Ch29.Domain.common.Dto.BookDto;

public class BookService {
	
	private BookDao dao;
	
	//싱글톤
	private static BookService instance;
	public static BookService getInstance() {
		if(instance == null)
			instance = new BookService();
		return instance;
	}
	//
	
	private MemberService memberService;
	private BookService(){
		dao = BookDao.getInstance();
		memberService = MemberService.getInstance();
	}
	
	//도서 조회하기(비회원/회원/사서)
	public List<BookDto> getAllBook() throws Exception{
		System.out.println("BOOKService's getAllBook()");
		return dao.select();
	}
	
	public BookDto getBook(int bookcode) throws Exception{
		System.out.println("BOOKService's getBook()");
		return dao.select(bookcode);
	}
	
	//도서 등록하기(사서)
	public boolean addbook(BookDto dto, String sid) throws Exception {
		System.out.println("BOOKService's addBook()");
		
		String role = memberService.getRole(sid);
		
		if(role.equals("ROLE_MEMBER"))
		{
			int result = dao.insert(dto);
			if(result>0)
				return true;
		}
		return false;
	}
	//도서 수정하기
	public boolean updatebook(BookDto dto, String sid) throws Exception{
		System.out.println("BOOKService's updateBook()");
		
		String role = memberService.getRole(sid);
		
		if(role.equals("ROLE_MEMBER"))
		{	
			int result = dao.update(dto);
			if(result>0)
				return true;
		}	
		return false;
	}
	//도서 삭제하기
	public boolean removebook(int bookcode, String sid) throws Exception{
		System.out.println("BOOKService's removeBook()");
		
		String role = memberService.getRole(sid);
		
		if(role.equals("ROLE_MEMBER"))
		{		
			int result = dao.delete(bookcode);
			if(result>0)
				return true;
		}	
		return false;
	}
	
}
