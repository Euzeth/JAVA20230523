package Ch02;

public class C02음수 {
	
	public static void main(String[] args) {
		
		// 문제
		// 음수값임을 고려하여 풉니다
		// 10진수 -> 2진수
		// 111 ->  01101111
		// -111 -> 10010001
		// 96 -> 01100000
		//-96 -> 10100000
		//31 ->  00011111
		//-31 -> 11100001
		
		// 2진수 -> 10진수
		// 10101111 -> -128 + 47 = -81
		// 00110101 -> 53
		// 11001100 -> -128 + 76 = -52
		// 10101010 -> -128 + 42 = -86
		
		byte data = (byte)0b10101111;
		short data2 = 0b10101111;
		System.out.println(data);
		System.out.println(data2);
		
		
		
		
		
		
		
	}

}
