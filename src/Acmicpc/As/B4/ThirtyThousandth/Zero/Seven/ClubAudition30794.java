package Acmicpc.As.B4.ThirtyThousandth.Zero.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ClubAudition30794 {
	static String[] sts = {"miss", "bad", "cool", "great", "perfect"};
	static int[] scs = {0, 200, 400, 600, 1000};
	static Map<String, Integer> map = new HashMap<>();
	static void mapInit() {
		for (int i = 0; i < Math.min(sts.length, scs.length); i++) {
			map.put(sts[i], scs[i]);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		mapInit();
		
		System.out.println(Integer.parseInt(str.split(" ")[0]) * map.get(str.split(" ")[1]));
		br.close();;
	}
}
