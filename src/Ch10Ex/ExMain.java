package Ch10Ex;

class Seller{
	private int MyMoney;
	private int AppleCnt;
	public int Price;
	
	public Seller(int myMoney, int appleCnt, int price) {
		MyMoney = myMoney;
		AppleCnt = appleCnt;
		Price = price;
	}
	public int Receive(int Money) {
		//1 money 를 MyMoney에 누적
		MyMoney+=Money;
		//2 money 에 해당되는 만큼 사과개수를 계산
		int revcnt = Money/Price;
		//3 AppleCnt에서 계산된 만큼의 사과개수를 차감
		AppleCnt -= revcnt;
		//4 계산된 사과개수를 리턴
		return revcnt;
	}
	public void ShowInfo(){
		//속성 정보를 Console에 출력
		System.out.println("--------판매자정보--------");
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("사과 개수 : " + AppleCnt);
		System.out.println("개당 가격 : " + Price);
	}
}

class Buyer{
	private int MyMoney;
	private int AppleCnt;
	
	public Buyer(int myMoney, int appleCnt) {
		MyMoney = myMoney;
		AppleCnt = appleCnt;
	}
	public void Payment(Seller seller, int money) 
	{	
		//1 MyMoney에서 money만큼 차감
		MyMoney-=money;
		//2 seller에게 money 전달, //3 seller로부터 사과개수받기
		int cnt = seller.Receive(money);
		//4 사과개수를 멤버인 AppleCnt 누적
		AppleCnt+=cnt;
	}
	public void ShowInfo(){
		//속성 정보를 Console에 출력
		System.out.println("--------구매자정보--------");
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("사과 개수 : " + AppleCnt);
	}
}


public class ExMain {
	
	public static void main(String[] args) {
		
		Seller 사과장수1 = new Seller(100000, 100, 1000);	// 보유금액, 사과갯수, 개당가격
		Buyer 홍길동 = new Buyer(10000, 0);		// 보유금액, 사과갯수
		Buyer 엄태웅 = new Buyer(20000, 0);		// 보유금액, 사과갯수
		Buyer 김상중 = new Buyer(30000, 0);		// 보유금액, 사과갯수
		홍길동.Payment(사과장수1, 2000);
		사과장수1.ShowInfo();
		홍길동.ShowInfo();
		
		
		
		
	}
}
