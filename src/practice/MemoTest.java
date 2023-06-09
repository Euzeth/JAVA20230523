package practice;

public class MemoTest {
	
	public static void main(String[] args) {
		
		MemoVO vo1 = new MemoVO();
		MemoVO vo2 = new MemoVO("홍길동", true, "1등 입니다.");
		
		System.out.println(vo1);
		System.out.println(vo2.toString());
		
		
		MemoVO vo3 = new MemoVO("성춘향", false, "이쁜이에요");
		System.out.println(vo3);
		
		vo2.count = 100;
		System.out.println(vo3.count);
		
//		System.out.println(vo2.name);		// name은 private 권한을 가지는 멤버이므로 에러가 발생된다.
		
		System.out.println(vo2.getName());
		vo2.setName("임꺽정");
		System.out.println(vo2.getName());
	}

}
