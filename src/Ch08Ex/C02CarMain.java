package Ch08Ex;

class C02Car {
	String owner;
	int speed;
	int fuel;
	void Accel()
	{
		System.out.println(owner + " 님이 현재속도 " + speed + " 에서 " + (speed+5) + " 로 가속합니다");
	}
	void Break()
	{
		System.out.println(owner + " 님이 현재속도 " + speed + " 에서 " + (speed-5) + " 로 감속합니다");
	}
	void ShowInfo()
	{
		System.out.printf("%s %d %d\n", owner, speed, fuel);
	}
}

public class C02CarMain {
	
	public static void main(String[] args) {
		
		C02Car hongCar = new C02Car();
		hongCar.owner = "홍길동";
		hongCar.speed = 10;
		hongCar.fuel = 100;
		System.out.printf("%s %d %d\n", hongCar.owner,hongCar.speed,hongCar.fuel);
		hongCar.Accel();	//owner + 님이 현재속도 + speed + 에서 + (speed+5) + 로 가속합니다 가 출력
		hongCar.Break();	//owner + 님이 현재속도 + speed + 에서 + (speed-5) + 로 감속합니다 가 출력
		hongCar.ShowInfo();	//owner, speed, fuel이 출력
	}

}
