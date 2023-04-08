package Acmicpc.As.B2.TwentyThousandth.Seven.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class KartRider27522 {
	static final int c = 8;
	static final int[] scores = {10, 8, 6, 5, 4, 3, 2, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		List<Integer> list = new ArrayList<>();
		Map<Integer, Character> map = new HashMap<>();
		String str = null;
		int redScores = 0, blueScores = 0;
		
		for (int i = 0, w = 60000, sum = 0; i < c; i++, w = 60000, sum = 0) {
			str = br.readLine();
			st = new StringTokenizer(str.split(" ")[0], ":");
			for (int j = 1; j <= 3; j++) {
				sum += Integer.parseInt(st.nextToken()) * w;
				w /= j == 1 ? 60 : j == 2 ? 1000 : 1;
			}
			map.put(sum, str.split(" ")[1].charAt(0));
			list.add(sum);
		}
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			if (map.get(list.get(i)) == 'B') {
				blueScores += scores[i];
			}
			else redScores += scores[i];
		}
		
		System.out.println(redScores > blueScores ? "Red" : "Blue");
		br.close();
	}
}
