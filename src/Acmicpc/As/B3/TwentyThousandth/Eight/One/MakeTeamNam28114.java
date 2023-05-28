package Acmicpc.As.B3.TwentyThousandth.Eight.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MakeTeamNam28114 {
	static final int len = 3;
	static int[] years = new int[len];
	static int[] problems = new int[len];
	static String[] names = new String[len];
	static Map<Integer, String> map = new HashMap<>();
	static String getName1() {
		Arrays.sort(years);
		
		return String.valueOf(years[0]) + String.valueOf(years[1]) + String.valueOf(years[2]);
	}
	static String getName2() {
		Arrays.sort(problems);
		
		return String.valueOf(map.get(problems[2]).charAt(0)) 
				+ String.valueOf(map.get(problems[1]).charAt(0)) 
				+ String.valueOf(map.get(problems[0]).charAt(0));
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		
		for (int i = 0; i < len; i++) {
			str = br.readLine();
			problems[i] = Integer.parseInt(str.split(" ")[0]);
			years[i] = Integer.parseInt(str.split(" ")[1]) % 100;
			names[i] = str.split(" ")[2];
			map.put(problems[i], names[i]);
		}
		
		System.out.println(getName1() + " " + getName2());
		br.close();
	}
}
