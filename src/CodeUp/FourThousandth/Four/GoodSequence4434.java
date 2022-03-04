package CodeUp.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodSequence4434 {
	static boolean flag = false;
	static boolean check(String str) {
		for (int i = 1; i <= str.length()/2; i++) {
			int k = i * 2;
			for (int j = 0; j+k <= str.length(); j++) {
				String s1 = str.substring(j, i+j);
				String s2 = str.substring(i+j, k+j);
				if (s1.equals(s2)) return false;
			}
		}
		return true;
	}
	static void bt(int n, int d, String str) {
		if (flag) return;
		if (!check(str)) return;
		if (n == d) {
			System.out.println(str);
			flag = true;
			return;
		}
		
		for (int i = 1; i <= 3; i++) {
			String tmp = str.toString();
			bt(n, d+1, tmp += (char)(i+48));
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		bt(n, 0, "");
		
//		simple coindg input 8 = 12131213 bad sequence
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i % 2 == 0 ? 1 : i == 1 ? 2 : arr[i-2] == 3 ? 2 : 3;
//		}
//		for (int el : arr) {
//			System.out.print(el);
//		}
		
	
	}
}
