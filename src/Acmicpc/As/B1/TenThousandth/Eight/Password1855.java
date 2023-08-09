package Acmicpc.As.B1.TenThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Password1855 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<>();
		int K = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i+=K) {
			list.add(str.substring(i, i+K));
		}
		
		for (int i = 0; i < K; i++) {
			for (int j = 0, w = 0; j < list.size(); j++, w = 0) {
				w = j % 2 == 0 ? w+i : list.get(j).length()-1-i;
				sb.append(list.get(j).charAt(w));
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
