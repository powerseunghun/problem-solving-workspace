package Acmicpc.As.B3.SevenThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Kortos7280 {
	static final int limit = 13;
	static List<String> list = new ArrayList<>();
	static void init() {
		char[] cs = {'S','B','V','K'};
		for (int i = 0; i < cs.length; i++) {
			for (int j = 1; j <= limit; j++) {
				list.add(cs[i] + " " + String.valueOf(j));
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		init();
		for (int i = 0; i < 51; i++) {
			list.remove(br.readLine());
		}
		
		System.out.println(list.get(0));
		br.close();
	}
}
