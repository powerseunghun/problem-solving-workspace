package Programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class NotExistNumber {
	static Map<Integer, Integer> map = new HashMap<>();
	static int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
        	map.put(numbers[i], 1);
        }
        for (int i = 0; i < 10; i++) {
        	if (!map.containsKey(i)) answer += i;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		System.out.println(solution(numbers));
	}
}
