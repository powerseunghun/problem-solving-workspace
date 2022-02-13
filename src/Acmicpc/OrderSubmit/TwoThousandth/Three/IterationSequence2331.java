package Acmicpc.OrderSubmit.TwoThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IterationSequence2331 {
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int P = Integer.parseInt(tmp.split(" ")[1]), num = 0, res = 0;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(A);
		map.put(A, 0);
		
		while (true) {
			num = list.get(list.size()-1);
			res = 0;
			while (num != 0) {
				res += Math.pow(num%10, P);
				num /= 10;
			}
			if (map.containsKey(res)) break;
			
			list.add(res);
			map.put(res, list.size());
		}
		System.out.println(map.get(res) == 0 ? 0 : map.get(res)-1);
		br.close();
	}
}
