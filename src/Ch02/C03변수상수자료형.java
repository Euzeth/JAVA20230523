package Ch02;

public class C03변수상수자료형 {
	
	public static void main(String[] args) {
		
		// 수 : 선 저장 / 후 처리
		// 변수 : 개발자의 유지보수 측면에서 저장된 수를 바뀔 예정이 큰 수
		// 변수명 : 저장되어져 있는 변수 공간에 접근하기 위한 문자형태의 주소
		// 자료형 : 수를 저장하기 위해 공간을 형성하는 예약어 + 제약조건 		
		// 상수 : 항'상' 같은'수'
		// 대입연산자(=) 
		// lv(공간) left value = rv(값 - 먼저처리) right value
		
		int num1;  // int 자료형의 변수명 num1을 지정 (4byte정수 공간 num1 정의)
		num1 = 10; // 만들어진 변수명num1안에 10이라는 숫자를 넣는다 (10값을 num1공간에 대입)
		int num2 = 4; // int자료형의 변수명num2를 만들면서 바로 4라는 숫자를 넣는다 (4상수 값을 4byte num2공간에 초기화)
		int num3 = num1 + num2; // int자료형의 변수명num3안에 num1의 수와 num2의 수를 더한다 (num1의 값과 num2값의 합을 4byte 정수 num3 공간에 초기화)
		System.out.println(num3); // num3값을 콘솔창에 출력
		
		
		
		
		
	}

}
