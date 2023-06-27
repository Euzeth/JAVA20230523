package Ch29.Controller;

import java.util.Map;

import Ch29.Domain.common.Dto.LendDto;

public class LendController {
	
	public void execute(int serviceNo, Map<String, Object> param) {
		
		if(serviceNo==1) {
			//1 파라미터 추출(생략)
			//2 입력값 검증(생략)
			//3 서비스 실행(서비스모듈작업 이후 처리)
			//4 View로 전달
			System.out.println("Lend_Select Block!");
		}
		else if(serviceNo==2) {
			//1 파라미터 추출	
			Integer bookcode = (Integer)param.get("bookcode");
			String id = (String)param.get("id");			
			//2 입력값 검증
			if(bookcode==null||id==null) {
				System.out.println("[ERROR] Data Validation Check Error!");
				return ;
			}
			//3 서비스 실행
			LendDto dto = new LendDto(0,bookcode,id,null,null);
			System.out.println("Dto : " + dto);
			//4 View로 전달
			System.out.println("Lend_Insert Block!");
		}
		else if(serviceNo==3) {
			//1 파라미터 추출
			//2 입력값 검증
			//3 서비스 실행
			//4 View로 전달
			System.out.println("Lend_Update Block!");
		}
		else if(serviceNo==4) {
			//1 파라미터 추출	
			Integer bookcode = (Integer)param.get("bookcode");
			String id = (String)param.get("id");
			//2 입력값 검증
			if(bookcode==null||id==null) {
				System.out.println("[ERROR] Data Validation Check Error!");
				return ;
			}
			//3 서비스 실행
			LendDto dto = new LendDto(0,bookcode,id,null,null);
			System.out.println("Dto : " + dto);
			//4 View로 전달
			System.out.println("Lend_Delete Block!");
		}
		
	}
}