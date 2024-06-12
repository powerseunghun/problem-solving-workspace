package Acmicpc.As.S3.TenThousandth.One.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class StringSet11478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Set<String> set = new HashSet<>();
		
		// 0,1,2.. 1,2,3
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				set.add(str.substring(i,j));
			}
		}
		
		System.out.println(set.size());
		br.close();
	}
}
