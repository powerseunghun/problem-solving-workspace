package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Taekwondo2040 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().substring(0, 19));
		int[] fs = new int[10];
		Set<Integer> memory = new HashSet<>();
		
		int count = 0;
		for (int i = 0; i < fs.length; i++) {
			fs[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < fs.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				memory.add(fs[j]);
				if (memory.size() == 2) break;
			}
			if (memory.contains(fs[i])) count++;
			memory.clear();
		}
		System.out.println(count);
		
	}
}
