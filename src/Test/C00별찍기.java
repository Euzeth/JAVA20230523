package Test;

import java.util.Scanner;

public class C00별찍기 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i=0,j=0,k=0;
		int h = sc.nextInt();
		
		while(i<h)
			{
				j=0;
				while(j<=(h-2)-i)
				{
					System.out.print(" ");
					j++;
				}
				k=0;
				while(k<=2*i)
				{
					System.out.print("*");
					k++;
				}
				System.out.println();
				i++;
			}
		
	}
}
