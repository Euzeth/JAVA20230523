package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {

		// 탈출 요건

//		int i=0;	//1 탈출 변수
//		while(i<10)	//2 탈출 조건식
//		{
//			System.out.println("HELLO WORLD");
//			i++;	//3 탈출 연산식
//		}

		// 1부터 10까지 합

//		int i=1;
//		int sum=0;	// 누적 합 저장 변수
//		while(i<=10)
//		{
//			System.out.println("i : "+i);
//			sum=sum+i;	// sum+=i;
//			i++;
//		}
////		System.out.println("종료 후 i : "+i);
//		System.out.println("1 부터 10까지 합 : " + sum);

		// 문제
		// N,M 을 입력받아서 N부터 M 까지의 합 구하기(N<M)

//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		
//		if(n>m) {
//			int tmp=n;
//			n=m;
//			m=tmp;
//		}
//		
//		int i=n;	//초기값
//		int sum=0;
//		while(i<=m) {
//			sum+=i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d까지의 합 : %d\n",n,m,sum);

		// 문제
		// 구구단 2단 출력(역순출력)

//		int i=9;
//		while(i>=1) {
//			System.out.printf("%d x %d = %d\n", 2,i,2*i);
//			i--;
//		}

		// 문제
		// 구구단 N단 출력(입력받기)

//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		int i=1;
//		while(i<10) {
//			System.out.printf("%d x %d = %d\n",n,i,n*i);
//			i++;
//		}
//		
		// 문제
		// 구구단 N단 출력(입력받기,역순출력) (별첨 ...2<=N<=9)

//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		int i=9;
//		while(i>0) {
//			System.out.printf("%d x %d = %d\n",n,i,n*i);
//			i--;
//		}

		// 문제
		// 프로그램 사용자로부터 양의 정수를 하나 입력 받은 다음, 그 수만큼 3의 배수를 출력하는
		// 프로그램을 작성
		// ex. 5를 입력 받았다면 3,6,9,12,15를 출력

//		Scanner sc = new Scanner(System.in);
//		int n =sc.nextInt();
//		int i = 1;
//		String stack="";
//		while(i<=n)
//		{
//			if(i<n) {
//				System.out.print(i*3+",");
//			}else {
//				System.out.print(i*3);
//			}
//			i++;
//		}

		// 문제
		// 1부터 100까지 수중에 짝수의 합과 홀수의 합을 각각 구해서 출력하세요

//		Scanner sc = new Scanner(System.in);
//		int i=1;
//		int evensum=0;
//		int oddsum=0;
//		while(i<=100) {
//			if(i%2==0) {
//				//System.out.println("짝수 i = " + i);
//				evensum+=i;			// evensum = evensum + i
//			}else {
//				//System.out.println("홀수 i = " + i);
//				oddsum+=i;			// oddsum = oddsum + i
//			}
//			i++;
//		}
//		System.out.println("짝수 합 : " + evensum);
//		System.out.println("홀수 합 : " + oddsum);

		// 문제
		// 1부터 N까지 수중에 짝수의 합과 홀수의 합을 각각 구해서 출력하세요

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i=1;
//		int evensum=0;
//		int oddsum=0;
//		while(i<=n) {
//			if(i%2==0) {
//				evensum+=i;			// evensum = evensum + i
//			}else {
//				oddsum+=i;			// oddsum = oddsum + i
//			}
//			i++;
//		}
//		System.out.println("짝수 합 : " + evensum);
//		System.out.println("홀수 합 : " + oddsum);

		// 문제
		// 1부터 100까지 수중에 3의 배수는 제외한 합을 구해서 출력해보세요

//		Scanner sc = new Scanner(System.in);
//		int i=1;
//		int sum=0;
//		while(i<=100) {
//			if(i%3!=0) {
//				sum+=i;		//3배수가 아닌경우 실행코드
//			}
//			i++;
//		}
//		System.out.println(sum);

		// 문제
		// 문자열을 입력받아서 각문자를 거꾸로 출력해봅시다(같이 풉니다)
		// 입력 : apple
		// 출력 : elppa

//		String str = "안녕?";
//		System.out.println("길이 : " + str.length());
//		
//		str = str+"나는 ";
//		
//		System.out.println("길이 : " + str.length());

//		Scanner sc = new Scanner(System.in);

//		String str1 = sc.nextLine();
//		
//		int len = str1.length()-1;
//		String r="";
//		System.out.println("길이 : " +len);
//		while(len>=0) {
//			System.out.print(str1.charAt(len)); // O
//			r+=str1.charAt(len);
//			len--;
//		}
//		System.out.println(r);

		// 01 반복문 기본

		// 1.탈출용 변수
		// 2.탈출 조건식
		// 3.탈출을 위한 연산
//		int i =1;		// 1. 탈출용 변수
//		while(i<=10) 	// 2. 탈출 조건식
//		{
//			System.out.println("HELLO WORLD");
//			i++;		// 3. 탈출을 위한 연산
//		}
//		System.out.println("i : " + i);

		// 02 1 - 10까지의 합

//		int i =1;		// 1. 탈출용 변수
//		int sum=0;
//		while(i<=10) 	// 2. 탈출 조건식
//		{
//			System.out.println("i : " + i);
//			sum = sum + i;
//			i++;		// 3. 탈출을 위한 연산
//		}
//		System.out.println("SUM : " + sum);

		// 03 1 - N 까지의 합

//		Scanner sc = new Scanner(System.in);

//		int n = sc.nextInt();
//		int i =1;		// 1. 탈출용 변수
//		int sum=0;
//		while(i<=n) 	// 2. 탈출 조건식
//		{
//			System.out.println("i : " + i);
//			sum = sum + i;
//			i++;		// 3. 탈출을 위한 연산
//		}
//		System.out.println("SUM : " + sum);

		// 문제
		// N - M까지의 합을 구합니다.

//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		if(n>m) {
//			int tmp=n;
//			n=m;
//			m=tmp;
//		}
//		
//		int i = n;
//		int sum = 0;
//		while(i<=m) {
//			System.out.println("i : " + i);
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("SUM : " + sum);

		// 01 1-N 까지 수중에 짝수/홀수의 합을 각각 출력
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int i =1;		// 1. 탈출용 변수
//		int sum=0;
//		int odd=0;		// 홀수 누적합용 변수
//		int even=0;		// 짝수 누적합용 변수
//		while(i<=n) 	// 2. 탈출 조건식
//		{	
//			System.out.println("i : " + i);
//			sum += i;
//			if(i%2==0) {
//				even += i;
//			}else {
//				odd += i;
//			}
//			i++;		// 3. 탈출을 위한 연산
//		}
//		System.out.println("SUM : " + sum);
//		System.out.println("짝수합 : " + even);
//		System.out.println("홀수합 : " + odd);
//		sc.close();

		// 1 - N 까지 수중에 3의 배수만 출력하고 그합도 출력

//		Scanner sc = new Scanner(System.in);		
//		
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i<=n) {
//			if(i%3==0) {
//				System.out.println("i : " + i);
//				sum+=i;
//			}
//		i++;
//		}
//		System.out.println("SUM : " + sum);

		// 1 - N 까지 수중에 4의 배수를 출력하고 4의 배수가 아닌 나머지의 합을 구하세요

//		n = sc.nextInt();
//		i=1;
//		sum = 0;
//		while(i<=n) {
//			if(i%4==0) {
//				System.out.println("i : " + i);
//			}else {
//				sum+=i;
//			}
//			i++;
//		}
//		System.out.println("SUM : " + sum);

//		// 구구단 2단 출력
//		i=1;
//		int dan = 2;
//		while(i<=9) {
//			System.out.println(dan + "X" + i + "=" + (dan*i));
//			i++;
//		}
//		System.out.println();
//		// 구구단 N단 출력(N<=9)
//		i=1;
//		dan = sc.nextInt();
//		while(i<10) {
//			System.out.println(dan + "X" + i + "=" + (dan*i));
//			i++;
//		}
//		System.out.println();
//		// 구구단 N단 역순출력(N<=9)
//		int j=9;
//		dan = sc.nextInt();
//		while(j>0) {
//			System.out.println(dan + "X" + j + "=" + (dan*j));
//			j--;
//		}
//		
//		sc.close();

		// 중첩 while

		// 전체 구구단 출력
		// 2- 9 단 출력

//		int dan = 2;
//		int i = 1;
//		while(dan<=9) 
//		{
//			i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}

		// 전체구구단 역순출력
//		dan = 9;
//		i = 9;
//		while(dan>=2) 
//		{
//			i=9;
//			while(i>=1) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}

		// *****
//		int i = 0;
//		int j = 0;
//		while(i<4) {
//			j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		while(i<h) {
//			j=0;
//			while(j<h) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		// * (*하나씩 증가)

//		int i = 0;
//		int j = 0;
//		while(i<5) {
//			j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		while(i<h) {
//			j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		// ***** (*하나씩 감소)
//		int i = 0;
//		int j = 0;
//		while(i<5) {
//			j=0;
//			while(j<=(4-i)) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		while(i<h) {
//			j=0;
//			while(j<=((h-1)-i)) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*

//		int i = 0;
//		int j = 0;
//		while (i < 9) {
//			if(i<5) 
//			{
//				
//				j=0;
//				while(j<=i) {
//					System.out.print("*");
//					j++;
//				}
//			}else 
//			{
//				j=0;
//				while(j<=8-i) {
//					System.out.print("*");
//					j++;
//				}
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		int h; 
//		while(true) {
//			h=sc.nextInt();
//			if(h%2!=0) {
//				break;
//			}
//		}
//		int i = 0;
//		int j = 0;
//		while (i < h) {
//			if(i<(h/2)+1) 
//			{
//				j=0;
//				while(j<=i) {
//					System.out.print("*");
//					j++;
//				}
//			}else 
//			{
//				j=0;
//				while(j<=(h-1)-i) {
//					System.out.print("*");
//					j++;
//				}
//			}
//			System.out.println();
//			i++;
//		}
		
//		   *
//		  ***
//		 *****
//		********
//		int i=0;
//		int j=0;
//		int k=0;
//		while(i<4) {
//			//공백
//			j=0;
//			while(j<=2-i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		int j=0;
//		int k=0;
//		while(i<h) {
//			//공백
//			j=0;
//			while(j<=(h-2)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		********
//		 ******
//		  ***
//		   *
		
//		int i=0;
//		int j=0;
//		int k=0;
//		while(i<4) {
//			//공백
//			j=0;
//			while(j<=i-1) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<= 6-(2*i)) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		int j=0;
//		int k=0;
//		while(i<h) {
//			//공백
//			j=0;
//			while(j<=i-1) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<= ((h-1)*2)-(2*i)) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		   *
//		  ***
//		 *****
//	    ********
//		 ******
//		  ***
//		   *
		
//		int i=0, j=0, k=0;
//		while(i<7) {
//			if(i<4) {
//				j=0;
//				while(j<=2-i) {
//					System.out.print(" ");
//					j++;
//				}
//				k=0;
//				while(k<=2*i) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			else {
//				j=0;
//				while(j<=i-4) {
//					System.out.print(" ");
//					j++;
//				}
//				k=0;
//				while(k<=6*2-2*i) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			System.out.println();
//			i++;
//		}
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int i=0, j=0, k=0;
		while(i<h) {
			if(i<=h/2) {
				j=0;
				while(j<=(h/2-1)-i) {
					System.out.print(" ");
					j++;
				}
				k=0;
				while(k<=2*i) {
					System.out.print("*");
					k++;
				}
			}
			else {
				j=0;
				while(j<=i-(h/2+1)) {
					System.out.print(" ");
					j++;
				}
				k=0;
				while(k<=(h-1)*2-2*i) {
					System.out.print("*");
					k++;
				}
			}
			System.out.println();
			i++;
		}
		
		
		
		
		
		
		
		
		

	

	}

}
