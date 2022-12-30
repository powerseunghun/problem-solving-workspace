package Acmicpc.As.B4.SixThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberFormat6916 {
	static StringBuilder sb = new StringBuilder();
	static String[][][] strs = {
			{{" * * *", "*     *", "*     *", "*     *", "", "*     *", "*     *", "*     *", " * * *"}},
			{{"      *", "      *", "      *", "", "      *", "      *", "      *"}},
			{{" * * *", "      *", "      *", "      *", " * * *", "*", "*", "*", " * * *"}},
			{{" * * *", "      *", "      *", "      *", " * * *", "      *", "      *", "      *", " * * *"}},
			{{"*     *", "*     *", "*     *", " * * *", "      *", "      *", "      *"}},
			{{" * * *", "*", "*", "* ", " * * *", "      *", "      *", "      *", " * * *"}},
			{{" * * *", "*", "*", "*", " * * *", "*     *", "*     *", "*     *", " * * *"}},
			{{" * * *", "      *", "      *", "      *", "", "      *", "      *", "      *", ""}},
			{{" * * *", "*     *", "*     *", "*     *", " * * *", "*     *", "*     *", "*     *", " * * *"}},
			{{" * * *", "*     *", "*     *", "*     *", " * * *", "      *", "      *", "      *", " * * *"}},
	};
	static void func(int n, boolean flag) {
		for (int i = 0; i < strs[n][0].length; i++) {
			sb.append(strs[n][0][i]+ (!flag&&i==strs[n][0].length-1 ? "" : "\n"));
		}
		if (!flag) return;
		sb.append("\n");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			func(str.charAt(i)-'0', i==str.length()-1 ? false : true);
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
