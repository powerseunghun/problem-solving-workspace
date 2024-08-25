package Acmicpc.As.B3.ThirtyThousandth.Zero.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Attendance30552 {
	static List<String> list = new ArrayList<String>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			if (str.equals("Present!")) {
				list.remove(list.size()-1);
				continue;
			}
			list.add(str);
		}
		for (String n : list) {
			sb.append(n).append("\n");
		}
		
		System.out.print(list.isEmpty() ? "No Absences" : sb.toString());
		br.close();
	}
}
