package Ch08Ex;

import java.util.Scanner;

class Sub{
	int sub1(int x, int y) {
		return x-y;
	}
	int sub2(int x, int y) {
		if(x>y) {
			return x-y;
		}
			return y-x;
		
	}
	int sub3(int x,int y, int z) {
		if(x>y&&x>z) {
			return x-y-z;
		}else if(y>x&&y>z) {
			return y-x-z;
		}
			return z-x-y;
	}
}
class Mul{
	Scanner sc = new Scanner(System.in);
	int mul1(int x, int y) {
		return 0;
	}
	int mul2(int x, int y, int z) {
		return 0;
	}
	void mul3() {
		int x = sc.nextInt();
		int y = sc.nextInt();
	}
}

public class C04SimpleMethod {
	
	public static void main(String[] args) {
		Sub subCal = new Sub();
		Mul mulCal = new Mul();
		
		int r1 = subCal.sub1(200,100);		//
		int r2 = subCal.sub2(100,200);		//큰수에서 작은수의 뺄셈결과를 반환
		int r3 = subCal.sub3(100,500,200);	//큰수에서 작은수의 뺄셈결과를 반환
		
		int r4 = mulCal.mul1(10,20);
		int r5 = mulCal.mul2(10,20,30);
		mulCal.mul3();	//내부에서 두개의 값을 받아 곱셈의 결과를 콘솔창에 출력
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		System.out.println("r5 : " + r5);
		mulCal.mul3();
		
	}

}
