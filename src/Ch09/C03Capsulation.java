package Ch09;

class 라면Recipe{
	//순서
	private void step1() {System.out.println("1 STEP");};
	private void step2() {System.out.println("2 STEP");};
	private void step3() {System.out.println("3 STEP");};
	private void step4() {System.out.println("4 STEP");};
	
	public void cooking() {
		step1();
		step2();
		step3();
		step4();
	}
}

class Cook{
	public 라면Recipe Recipe_ramen = new 라면Recipe();
}

public class C03Capsulation {
	
	public static void main(String[] args) {
		Cook hong = new Cook();
		hong.Recipe_ramen.cooking();
	}
}
