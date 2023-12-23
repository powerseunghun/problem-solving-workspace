package Acmicpc.As.S5.TwentyThousandth.Eight.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ConcludingRemarks28432 {
	static String[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null, res = null;
		Set<String> set = new HashSet<String>();
		int N = Integer.parseInt(br.readLine()), idx = 0;
		arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
			set.add(arr[i]);
			if (arr[i].equals("?")) idx = i;
		}
		
		N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			if (set.contains(str)) continue;
			if (str.charAt(0) == arr[idx-1].charAt(arr[idx-1].length()-1) && str.charAt(str.length()-1) == arr[idx+1].charAt(0)) {
				res = str;
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
