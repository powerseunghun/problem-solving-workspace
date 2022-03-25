package Acmicpc.OrderSubmit.TenThousandth.Three.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Enrolment13414 {
	static Map<String, Integer> map = new LinkedHashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(tmp.split(" ")[0]); 
		int L = Integer.parseInt(tmp.split(" ")[1]), cnt = 0;
		
		for (int i = 0; i < L; i++) {
			tmp = br.readLine();
			if (map.containsKey(tmp)) map.remove(tmp);
			map.put(tmp, 1);
		}
		Iterator iter = map.keySet().iterator();
		while (iter.hasNext()) {
			sb.append(iter.next() + "\n");
			cnt++;
			if (cnt == K) break;
		}
		System.out.print(sb.toString());
		br.close();
	}
}
