package Acmicpc.As.B1.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ScaleMove4732 {
	static Map<String, Integer> map = new HashMap<>();
	static String[] arr = {
			"A", "A#^Bb", "B^Cb", "B#^C", "C#^Db", "D", 
			"D#^Eb", "E^Fb", "E#^F", "F#^Gb", "G", "G#^Sb"
	};
	static void mapInit() {
		String s = null;
		for (int i = 0; i < arr.length; i++) {
			s = arr[i];
			if (s.contains("^")) {
				for (int j = 0; j < s.split("\\^").length; j++) {
					map.put(s.split("\\^")[j], i);
				}
			}
			else {
				map.put(s, i);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] as = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
		StringBuilder sb = new StringBuilder();
		String str = null, t = null;
		int N = 0;
		mapInit();
		
		while (true) {
			str = br.readLine();
			if (str.equals("***")) break;
			N = Integer.parseInt(br.readLine());
			
			for (int i = 0, idx = 0; i < str.split(" ").length; i++) {
				t = str.split(" ")[i];
				idx = map.get(t);
				idx = idx + N < 0 ? idx + 12 : idx;
				sb.append(as[(idx+N)%12] + " ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
