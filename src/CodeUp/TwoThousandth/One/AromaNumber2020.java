package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AromaNumber2020 {
	static void init(Map<Character, Integer> symbol) {
		symbol.put('I', 1); symbol.put('V', 5); symbol.put('X', 10); symbol.put('L', 50);
		symbol.put('C', 100); symbol.put('D', 500); symbol.put('M', 1000);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Integer> symbol = new HashMap<>(); 
		init(symbol);
		String tmp = br.readLine();
		int A = 0, R = 0, APrime = 0, RPrime = 0, sum = 0;
		
		for (int i = 0; i < tmp.length() -2; i += 2) {
			A = tmp.charAt(i) - '0';
			R = symbol.get(tmp.charAt(i+1));
			APrime = tmp.charAt(i+2) - '0';
			RPrime = symbol.get(tmp.charAt(i+3));
			sum = R >= RPrime ? sum + A * R : sum - A * R;
		}
		sum += APrime * RPrime;
		
		System.out.println(sum);
	}
}
