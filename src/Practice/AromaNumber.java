package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AromaNumber {
	public void init(Map<Character, Integer> symbol) {
		symbol.put('I', 1);
		symbol.put('V', 5);
		symbol.put('X', 10);
		symbol.put('L', 50);
		symbol.put('C', 100);
		symbol.put('D', 500);
		symbol.put('M', 1000);
	}
	public static void main(String[] args) {
		Map<Character, Integer> symbol = new HashMap<>(); 
		new AromaNumber().init(symbol);
		String s = new Scanner(System.in).nextLine();
		int A = 0, R = 0, APrime = 0, RPrime = 0, sum = 0;
		
		for (int i = 0; i < s.length() -2; i += 2) {
			A = s.charAt(i) - '0';
			R = symbol.get(s.charAt(i+1));
			APrime = s.charAt(i+2) - '0';
			RPrime = symbol.get(s.charAt(i+3));
			sum = R >= RPrime ? sum + A * R : sum - A * R;
		}
		sum += APrime * RPrime;
		
		System.out.println(sum);
	}
}
