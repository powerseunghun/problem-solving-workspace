package Acmicpc.As.B2.SixThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ShorterMusicalNotes6014 {
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int Q = Integer.parseInt(str.split(" ")[1]), B = 0;
		
		for (int i = 1; i <= N; i++) {
			B = Integer.parseInt(br.readLine());
			while(B-- > 0) {
				list.add(i);
			}
		}
		while(Q-- > 0) {
			sb.append(list.get(Integer.parseInt(br.readLine()))).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
	
}
