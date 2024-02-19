package Acmicpc.As.B5.TwentyThousandth.Eight.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Club28691 {
	static Map<String, String> map = new HashMap<>();
	static void mapInit() {
		map.put("M", "MatKor");
		map.put("W", "WiCys");
		map.put("C", "CyKor");
		map.put("A", "AlKor");
		map.put("$", "$clear");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		mapInit();
		System.out.println(map.get(br.readLine()));
		br.close();
	}
}
