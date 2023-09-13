package Acmicpc.As.B1.TenThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class YourHandle15819 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int I = Integer.parseInt(str.split(" ")[1]);
		List<String> list = new ArrayList<>();
		
		while(N-- > 0) {
			list.add(br.readLine());
		}
		Collections.sort(list);
		
		System.out.println(list.get(I-1));
		br.close();
	}
}
