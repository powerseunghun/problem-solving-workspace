package Acmicpc.As.B3.TwentyThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Canadians24923 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		
		System.out.println(strs[strs.length-1].equals("eh?") ? "Canadian!" : "Imposter!");
		br.close();
	}
}
