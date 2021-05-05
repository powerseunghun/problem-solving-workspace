package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class MemoryTest1409 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, String> map = new HashMap<>();
		int idx = 1;
		
		while (st.hasMoreTokens()) {
			map.put(idx++, st.nextToken());
		}
		
		System.out.println(map.get(Integer.parseInt(br.readLine())));
		
	}
}
