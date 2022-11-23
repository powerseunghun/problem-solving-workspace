package Acmicpc.As.B3.TwentyThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SharingBirthdays25840 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		int T = Integer.parseInt(br.readLine()), res = T;
		String tmp = null;
		
		while (T-- > 0) {
			tmp = br.readLine();
			if (!map.containsKey(tmp)) {
				map.put(tmp, 1);
				continue;
			}
			res--;
		}
		
		System.out.println(res);
		br.close();
	}
}
