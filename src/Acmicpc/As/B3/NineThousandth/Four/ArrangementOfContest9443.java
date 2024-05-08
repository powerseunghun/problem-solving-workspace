package Acmicpc.As.B3.NineThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrangementOfContest9443 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Character> list = new ArrayList<Character>();
		int N = Integer.parseInt(br.readLine()), res = 0;
		
		while(N-- > 0) {
			list.add(br.readLine().charAt(0));
		}
		
		for (int i = 65; i <= 90; i++) {
			System.out.println((char)i);
			if (!list.contains((char)i)) break;
			res++;
		}
		System.out.println(res);
		br.close();
	}
}
