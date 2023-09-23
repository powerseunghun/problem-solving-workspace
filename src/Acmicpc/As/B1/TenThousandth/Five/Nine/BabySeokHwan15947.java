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
	static String sFormat(String originStr, int loopCount) {
		if (!originStr.substring(0, 2).equals("tu")) return originStr;
		int ruCnt = (originStr.length() == 6 ? 2 : 1) + loopCount-1;
		if (ruCnt < loopLimit) return originStr;
		
		return "tu" + "+ru*" + ruCnt;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int loopCount = N % list.size() == 0 ? N / list.size() : N / list.size() + 1;
		String originStr = N % list.size() == 0 ? "sukhwan" : list.get(N%list.size()-1);
		
		System.out.println(sFormat(originStr, loopCount));
		br.close();
	}
}
