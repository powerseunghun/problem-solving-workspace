package Acmicpc.As.S5.FiveThousandth.Six;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseOrder5648 {
	static List<Long> list = new ArrayList<>();
	static long func(String str) {
		StringBuilder sb = new StringBuilder(str);
		return Long.parseLong(sb.reverse().toString());
	}
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n-- > 0) {
			list.add(func(sc.next()));
		}
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append("\n");
		}
		
		System.out.print(sb.toString());
		sc.close();
	}
}
