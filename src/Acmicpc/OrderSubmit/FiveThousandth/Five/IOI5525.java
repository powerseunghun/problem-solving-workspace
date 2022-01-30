package Acmicpc.OrderSubmit.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOI5525 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0, begin = 0;
		br.readLine();
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append("I");
		
		for (int i = 0; i < N; i++) {
			sb.append("OI");
		}
		
		begin = sb.toString().length()-1;
		
		for (int i = begin; i < str.length(); i++) {
			String tmp = str.substring(i-(sb.toString().length()-1), i+1);
			if (tmp.equals(sb.toString())) count++;
		}
		
		System.out.println(count);
		br.close();
	}
}
