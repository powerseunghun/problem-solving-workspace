package Acmicpc.String.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DontListenSeePerson1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		ArrayList<String> list = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 0; i < N; i++) {
			map.put(br.readLine(), 1);
		}
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			if (map.containsKey(tmp)) {
				list.add(tmp);
			}
		}
		Collections.sort(list);
		
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
