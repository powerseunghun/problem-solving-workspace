package CodeUp.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Cycle4742 {
	static Map<Integer, Integer> checkMap = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]), P = Integer.parseInt(tmp.split(" ")[1]);
		int count = 0, val = N;
		
		while (true) {
			val = (val * N) % P;
			if (checkMap.containsKey(val)) break;
			checkMap.put(val, 1);
			count++;
		}
		System.out.println(count);
	}
}
