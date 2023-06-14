package Ch19Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
	
	public static void func1(List<String> list) {
		list.add("AAAAAAAA");list.add("BB");list.add("CCCCCCC");
		//ArrayList에 있는 문자열 중에서 길이가 5보다 큰 문자열만 출력하는 코드를 작성하세요.
		//func1함수 완성하기	
		for (String str : list) {
	        if (str.length() > 5) {
	            System.out.println(str);
	        }
	    }
	}
	
	public static List<String> func2() {
		//ArrayList에 있는 문자열 중에서 길이가 5보다 큰 문자열만 입력하는 코드를 작성하세요.
		//func2함수 완성하기
		List<String> list1 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		list1.add(sc.nextLine());
		
		List<String> resultList = new ArrayList<String>();
		for(String str : list1) {
			if(str.length()>5) {
				resultList.add(str);
			}
		}
		return resultList;
	}
	
	public static void func3() {
		//ArrayList에 있는 정수값을 입력받는데 전달되는 수중에 짝수의 값만 입력받는 코드를 작성하세요.
		//func3함수 완성하기
		List<String> list = new ArrayList<String>();
		list.add("AAAAAA");
		list.add("BBBBBBBBB");
		list.add("CCCCCCCC");
		list.add("DDDD");
		list.add("E");
		
		List<String> evenValues = new ArrayList<String>();
	    for (int i = 0; i < list.size(); i++) {
	        String value = list.get(i);
	        if (value.length() % 2 == 0) {
	            evenValues.add(value);
	        }
	    }
	    for (String value : evenValues) {
	        System.out.println(value);
	    }
	}
	
	
	public static void main(String[] args) {
		
		func1(new ArrayList());
		System.out.println();
		List<String> list = func2();
		System.out.println(list);
		System.out.println();
		func3();
		

				

		
	}
}
