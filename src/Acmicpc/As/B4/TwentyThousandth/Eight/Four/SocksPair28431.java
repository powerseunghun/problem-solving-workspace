package Acmicpc.As.B4.TwentyThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SocksPair28431 {
	static final int c = 5;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0, s = 0; i < c; i++) {
			s = Integer.parseInt(br.readLine());
			if (list.contains(s)) {
				list.remove(list.indexOf(s));
				continue;
			}
			list.add(s);
		}
		
		System.out.println(list.get(list.size()-1));
		br.close();
	}
}
