package Ch19Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex2 {
	
	public static void main(String[] args) {
		
		// 1 ~ 45 까지 숫자를 6개를 랜덤으로 받아(Random클래스를 이용) set에 저장

		//[추가]저장된 set의 오름차순 정렬을 해보세요(검색을 통해서 해결해봅니다)
		 Set<Integer> numberSet = new HashSet<>();
	        Random random = new Random();
	        
	        while (numberSet.size() < 6) {
	            int randomNumber = random.nextInt(45) + 1; // 1부터 45까지의 숫자를 랜덤으로 선택
	            numberSet.add(randomNumber);
	        }
	        
	        List<Integer> sortedList = new ArrayList<>(numberSet);
	        Collections.sort(sortedList);
	        
	        for (int number : sortedList) {
	            System.out.println(number);
	        }
		
	}
}
