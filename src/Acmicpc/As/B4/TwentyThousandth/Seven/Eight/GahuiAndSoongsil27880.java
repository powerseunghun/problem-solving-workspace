package Acmicpc.As.B4.TwentyThousandth.Seven.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GahuiAndSoongsil27880 {
	static final int l = 4;
	static Map<String, Integer> map = new HashMap<>();
	static void mapInit() {
		map.put("Stair", 17);
		map.put("Es", 21);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int v = 0, res = 0;
		
		mapInit();
		for (int i = 0; i < l; i++) {
			str = br.readLine();
			v = Integer.parseInt(str.split(" ")[1]);
			res += (map.get(str.split(" ")[0]) * v);
		}
		
		System.out.println(res);
		br.close();
	}
}
