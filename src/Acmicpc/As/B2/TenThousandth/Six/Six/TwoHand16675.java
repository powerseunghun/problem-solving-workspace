package Acmicpc.As.B2.TenThousandth.Six.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoHand16675 {
	static boolean func(char a, char b) {
		return (a=='S' && b=='P') || (a=='R' && b=='S') || (a=='P' && b=='R');
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char Ml = str.split(" ")[0].charAt(0);
		char Mr = str.split(" ")[1].charAt(0);
		char Tl = str.split(" ")[2].charAt(0);
		char Tr = str.split(" ")[3].charAt(0);
		
		if (Ml == Mr && Tl == Tr) {
			System.out.println(Ml == Tl ? "?" : func(Ml, Tl) ? "MS" : "TK");
		} else if (Ml == Mr) {
			System.out.println(func(Tl, Ml) || func(Tr, Ml) ? "TK" : "?");
		} else if (Tl == Tr) {
			System.out.println(func(Ml, Tl) || func(Mr, Tl) ? "MS" : "?");
		} else {
			System.out.println("?");
		}
		
		br.close();
	}
}
