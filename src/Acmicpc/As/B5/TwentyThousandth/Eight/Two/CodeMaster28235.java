package Acmicpc.As.B5.TwentyThousandth.Eight.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CodeMaster28235 {
	static Map<String, String> map = new HashMap<>();
	static void mapInit() {
		map.put("SONGDO", "HIGHSCHOOL");
		map.put("CODE", "MASTER");
		map.put("2023", "0611");
		map.put("ALGORITHM", "CONTEST");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		mapInit();
		
		System.out.println(map.get(br.readLine()));
		br.close();
	}
}
