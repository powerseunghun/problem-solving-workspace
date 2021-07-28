package Acmicpc.String.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PrimeWord2153 {
	static void makePrimeList(int[] primeList) {
		for (int i = 0; i < primeList.length; i++) {
			primeList[i] = i;
		}
		for (int i = 2; i < primeList.length; i++) {
			if (primeList[i] == 0) continue;
			for (int j = 2*i; j < primeList.length; j+=i) {
				primeList[j] = 0;
			}
		}
	}
	static void mapInit(Map<Character, Integer> map) {
		for (int i = 1; i <= 26; i++) {
			map.put((char)(96+i), i);
			map.put((char)(64+i), 26+i);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] primeList = new int[1041];
		Map<Character, Integer> map = new HashMap<>();
		String str = br.readLine();
		int sum = 0;
		makePrimeList(primeList);
		mapInit(map);
		
		for (int i = 0; i < str.length(); i++) {
			sum += map.get(str.charAt(i));
		}
		
		if (primeList[sum] != 0) System.out.println("It is a prime word.");
		else System.out.println("It is not a prime word.");
	}
}
