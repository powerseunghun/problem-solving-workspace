package Acmicpc.As.S5.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreePart2993 {
	static StringBuilder sb = null;
	static List<String> strList = new ArrayList<String>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				for (int k = j+1; k < str.length(); k++) {
					StringBuilder tSb = new StringBuilder();
					sb = new StringBuilder(str.subSequence(0, j));
					tSb.append(sb.reverse().toString());
					
					sb = new StringBuilder(str.substring(j, k));
					tSb.append(sb.reverse().toString());
					
					sb = new StringBuilder(str.subSequence(k, str.length()));
					tSb.append(sb.reverse().toString());
					
					strList.add(tSb.toString());
				}
			}
		}
		Collections.sort(strList);
		System.out.println(strList.get(0));
		br.close();
	}
}
