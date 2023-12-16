package Acmicpc.As.S5.TenThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bundegi15729 {
	static List<Integer> list = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int T = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine()), r = 0, cnt = 0, res = 0;
		boolean flag = true;
		
		while (flag) {
			r++;
			list = new ArrayList<Integer>(Arrays.asList(0, 1, 0, 1));
			for (int i = 1; i <= r+1; i++) {
				list.add(0);
			}
			for (int i = 1; i <= r+1; i++) {
				list.add(1);
			}
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == B) cnt++;
				if (cnt == T) {
					flag = false;
					break;
				}
				res++;
				res %= A;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
