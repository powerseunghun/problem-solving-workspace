package Acmicpc.As.B1.TenThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class BabySeokHwan15947 {
	static final int loopLimit = 5;
	static String target = "turu";
	static List<String> list = Arrays.asList(
			"baby", "sukhwan", "tururu", "turu",
			"very", "cute", "tururu", "turu",
			"in", "bed", "tururu", "turu", "baby", "sukhwan"
		);
	static String sFormat(String originStr, int loopCount, int N) {
		String returnStr = null;
		if (!originStr.substring(0, 2).equals("tu")) return originStr;
		if (originStr.length() == 6) {
			if (loopCount >= 3) {
				returnStr = "tu+ru*" + (loopCount + 2);
			}
			else {
				returnStr = originStr;
				for (int i = 0; i < N/list.size(); i++) {
					returnStr += "ru";
				}
			}
		}
		else {
			if (loopCount >= 4) {
				returnStr = "tu+ru*" + (loopCount + 2);
			}
			else {
				returnStr = originStr;
				for (int i = 0; i < N/list.size(); i++) {
					returnStr += "ru";
				}
			}
		}
		return returnStr;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), idx = N % list.size(), loopCount = 0;
		boolean isExactlyMod = idx == 0;
		String originStr = isExactlyMod ? list.get(list.size()-1) : list.get(idx-1), res = null;
		
		if (!isExactlyMod) {
			loopCount = N / list.size();
			res = sFormat(originStr, loopCount, N);
		}
		else {
			res = originStr;
		}
		
		System.out.println(res);
		br.close();
	}
}
