package Ch29.tests.ServiceTests;

import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import Ch29.Domain.common.Dto.BookDto;
import Ch29.Domain.common.Service.BookService;
import Ch29.Domain.common.Service.LendService;
import Ch29.Domain.common.Service.MemberService;
import Ch29.Domain.common.Service.Auth.Session;

public class ServiceTests {

	@Test
	public void test1_BookService() throws Exception {
		BookService service = BookService.getInstance();
		assertNotNull(service);
				
//		service.addbook(new BookDto(101, "이것이리눅스다", "B출판사","123456"));
		
		List<BookDto> list = service.getAllBook();
		list.stream().forEach((dto)->{System.out.println(dto);});	
	}
	
	@Test
	public void test2_MemberService_login() throws Exception{
		MemberService service = MemberService.getInstance();
		Map<String, Object> sid = service.login("user1", "1234");
		System.out.println("sid : " + sid);
		Session mySession = service.sessionMap.get(sid);
		System.out.println("mySession : " + mySession);
	}
	
	@Test
	public void test3_LendService_ReqLend() throws Exception{
		MemberService memberService = MemberService.getInstance();
		BookService bookService = BookService.getInstance();
		LendService lendService = LendService.getInstance();
		assertNotNull(lendService);
		
		lendService.setBookService(bookService);
		lendService.setMemberService(memberService);
		
		//로그인
		Map<String, Object> login_sid = memberService.login("member9", "1234");
		System.out.println("login_Sid " + login_sid);
		
		//대여요청
//		boolean islend = lendService.reqLend(login_sid, "user1", 1);
		
		
		
	}
	
	
	
	
}
