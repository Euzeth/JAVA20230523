package Ch29.Domain.common.Service;

import Ch29.Domain.common.Dao.LendDao;
import Ch29.Domain.common.Dto.BookDto;
import Ch29.Domain.common.Dto.LendDto;
import Ch29.Domain.common.Dto.MemberDto;

public class LendService {
	
	private MemberService memService;
	private BookService bookService;
	private LendDao dao;
	
	//싱글톤
	private static LendService instance;
	public static LendService getInstance() {
		if(instance == null)
			instance = new LendService();
		return instance;
	}
	//
	
	private LendService(){
		dao = LendDao.getInstance();
		memService = MemberService.getInstance();
		bookService = BookService.getInstance();
	}
	
	//외부로부터 Service 받기
	public void setMemberService(MemberService memService) {
		this.memService = memService;
	}
	
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	
	public boolean reqLend(String sid, String userid, int bookcode) throws Exception{
		
		//사서 로그인 확인, Role받기
		String role = memService.getRole(sid); 
		
		if(!role.equals("ROLE_MEMBER")) {
			System.out.println("[WARN] 사서만 로그인 할 수 있습니다.");
			return false;
		}
		//회원 존재유무 확인
		MemberDto dto = memService.memberSearchOne(role, userid);
		
		if(dto!=null)
		{
			//도서 존재유무 확인
			BookDto bdto = bookService.getBook(bookcode);
			if(bdto != null) {
				//도서가 있다면 대여중인 상태인지 확인(LendDao 이용해서 대여중인 책이 있는지 조회)
				LendDto ldto = dao.select(bookcode);
				
				
				if(ldto==null) {
					//도서가 대여가능한 상태라면 
					dao.insert(new LendDto(0,bookcode,userid,null,null));
					System.out.println("[INFO] 도서대여 완료되었습니다.");
					return true;
				}
				System.out.println("[WARN] 요청한 도서는 대여중입니다.");
				return false;
			}
			System.out.println("[WARN] 해당 도서는 존재하지 않습니다.");
			return false;
		}
		System.out.println("[WARN] 해당 회원은 존재하지 않습니다.");
		return false;

		
		//대여가능 상태라면 대여진행
		
		
	}
	
	
	
}
