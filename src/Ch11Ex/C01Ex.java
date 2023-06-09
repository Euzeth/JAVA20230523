package Ch11Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C01Ex {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arry = new int[5];
		
		for(int i=0; i<arry.length;i++) {arry[i] = sc.nextInt();}
		
		System.out.println(Arrays.stream(arry).max().getAsInt());
		System.out.println(Arrays.stream(arry).min().getAsInt());
		System.out.println(Arrays.stream(arry).sum());
//		int max=arry[0];
//		int min=arry[0];
//		int sum=0;
//		for(int el : arry) {
//			if(max<el) {
//				max=el;
//			}
//			if(min>el) {
//				min=el;
//			}
//			sum+=el;
//		}
//		System.out.printf("%d %d %d\n", max,min,sum);

		
	}
}
