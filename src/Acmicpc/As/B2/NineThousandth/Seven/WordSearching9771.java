package Acmicpc.As.B2.NineThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordSearching9771 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), tmp = null;
		int cnt = 0;
		
		while((tmp = br.readLine()) != null) {
			for (int i = 0; i < tmp.split(" ").length; i++) {
				if ((tmp.split(" ")[i]).contains(str)) cnt++;
			}
		}
		
		System.out.println(cnt);
		br.close();
	}
}
