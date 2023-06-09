package Ch14;

import java.util.Scanner;

abstract class Converter {
	   abstract protected double convert(double src); // 추상 메소드
	   abstract protected String getSrcString(); // 추상 메소드
	   abstract protected String getDestString(); // 추상 메소드
	   protected double ratio; // 비율
	   public void run() {
	      Scanner scanner = new Scanner(System.in);
	      System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
	      System.out.print(getSrcString()+"을 입력하세요>> ");
	      double val = scanner.nextDouble();
	      double res = convert(val);
	      System.out.println("변환 결과: "+res+getDestString()+"입니다");
	      scanner.close();
	   }
	}
class Won2Dollar extends Converter{
	
	Won2Dollar(int ratio){
		super.ratio=ratio;
	}
		
	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}
	
	//상속받은 run() 생략되어 있음
}

class Km2Mile extends Converter{
	
	Km2Mile(double ratio){
		super.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "Km";
	}

	@Override
	protected String getDestString() {
		return "Mile";
	}
	
}

public class C03Main {
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();
//		원을 달러로 바꿉니다.
//		원을 입력하세요>> 24000
//		변환 결과: 20.0달러입니다
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
		toMile.run();
//		Km을 mile로 바꿉니다.
//		Km을 입력하세요>> 30
//		변환 결과: 18.75mile입니다
		
	}
}
