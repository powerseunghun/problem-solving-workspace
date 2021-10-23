package LettCode.Hundred.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class RoomEscape {
	static Map<Integer, Integer> seq = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int val = 0;
		
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			if (!seq.containsKey(val)) seq.put(val, 1);
		}
		br.readLine();
		
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			if (seq.containsKey(val)) sb.append("1");
			else sb.append("0");
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}
