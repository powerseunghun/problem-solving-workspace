package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class OmissionCard1411 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N-1; i++) {
			map.put(Integer.parseInt(br.readLine()), 1);
		}
		
		for (int i = 1; i <= N; i++) {
			if (!map.containsKey(i)) {
				System.out.println(i);
				break;
			}
		}
	}
}
