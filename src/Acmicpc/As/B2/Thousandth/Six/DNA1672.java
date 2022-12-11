package Acmicpc.As.B2.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DNA1672 {
	static Map<Character, Integer> map = new HashMap<>();
	static char[][] dna = {
			{'A', 'C', 'A', 'G'},
			{'C', 'G', 'T', 'A'},
			{'A', 'T', 'C', 'G'},
			{'G', 'A', 'G', 'T'}
	};
	static void mapInit() {
		char[] tArr = {'A', 'G', 'C', 'T'};
		for (int i = 0; i < tArr.length; i++) {
			map.put(tArr[i], i);
		}
	}
	static char func(char c1, char c2) {
		return dna[map.get(c1)][map.get(c2)];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		char res = ' ';
		mapInit();
		
		if (N == 1) {
			res = str.charAt(0);
		}
		else {
			res = func(str.charAt(str.length()-1), str.charAt(str.length()-2));
			for (int i = str.length()-3; i >= 0; i--) {
				res = func(res, str.charAt(i));
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
