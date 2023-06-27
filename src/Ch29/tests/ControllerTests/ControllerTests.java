package Ch29.tests.ControllerTests;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import Ch29.Controller.FrontController;

public class ControllerTests {

	@Test
	public void test1_FrontController() {
		FrontController fcontroller = new FrontController();
		assertNotNull(fcontroller);	//NULL여부확인
		fcontroller.execute("/book",1 ,null);
		fcontroller.execute("/member",2 ,null);
		fcontroller.execute("/lend",3 ,null);
		fcontroller.execute("/sjfhgjdst",4 ,null);
	}

	@Test
	public void test2_FrontController_SubController_Init() {
		FrontController fcontroller = new FrontController();
		assertNotNull(fcontroller);	//NULL여부확인
//		fcontroller.execute("/book",1 ,null);	//1 Select
		
		Map<String,Object> param = new HashMap();
		param.put("bookname", "이것이자바다");
		param.put("publisher", "한빛미디어");
//		fcontroller.execute("/book", 2, param);	//2 Insert
		
		fcontroller.execute("/member",3 ,null);	//3 Update
		fcontroller.execute("/lend",4 ,null);	//4 Delete
//		fcontroller.execute("/sjfhgjdst",4 ,null);
	}
	
	@Test
	public void test2_FrontController_SubController_param() 
	{
		FrontController fcontroller = new FrontController();
		assertNotNull(fcontroller);	//NULL여부확인
//		fcontroller.execute("/book",1 ,null);	//1 Select
		
		Map<String,Object> param = new HashMap();
		param.put("bookcode", 1234);
		param.put("bookname", "이것이자바다");
		param.put("publisher", "한빛미디어");
		param.put("isbn", "111-1111");
		fcontroller.execute("/book", 2, param);
		
	}
	
	
	
	
	
}
