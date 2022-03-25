package Acmicpc.OrderSubmit.TenThousandth.Three.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Enrolment13414 {
	static Map<String, Integer> map = new HashMap<>();
	static List<String> list = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(tmp.split(" ")[0]); 
		int L = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 0; i < L; i++) {
			tmp = br.readLine();
			if (!map.containsKey(tmp)) {
				list.add(tmp);
				map.put(tmp, 1);
			}
			else {
				list.remove(tmp);
				list.add(tmp);
			}
		}
		for (int i = 0; i < K; i++) {
			sb.append(list.get(i) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
