package Acmicpc.As.B3.ThirtyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterClassroom34802 {
	static boolean func(String str1, String str2, int t, int k) {
		String[] strs1 = str1.split(":");
		String[] strs2 = str2.split(":");
		int s = (Integer.parseInt(strs2[0])-Integer.parseInt(strs1[0]))*3600;
		s += (Integer.parseInt(strs2[1])-Integer.parseInt(strs1[1])) * 60;
		s += (Integer.parseInt(strs2[2])-Integer.parseInt(strs1[2]));
		
		return t*(100-k) <= s*100;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		String tk = br.readLine();
		int t = Integer.parseInt(tk.split(" ")[0]);
		int k = Integer.parseInt(tk.split(" ")[1]);
		
		System.out.println(func(str1, str2, t, k) ? 1 : 0);
		br.close();
	}
}
