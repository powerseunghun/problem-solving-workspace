package Goorm.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EmperorDownfall {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), idx = 0;
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		
		while (list.size() != 2) {
			list.remove(idx);
			idx += K-1;
			idx %= list.size();
		}
		
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
			if (i != list.size()-1) sb.append(" ");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
