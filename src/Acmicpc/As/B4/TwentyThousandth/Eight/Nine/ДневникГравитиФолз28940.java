package Acmicpc.As.B4.TwentyThousandth.Eight.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ДневникГравитиФолз28940 {
    static int func(int a, int b) {
        return (a+b-1) / b;
    }
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int w = Integer.parseInt(str.split(" ")[0]);
		int h = Integer.parseInt(str.split(" ")[1]);
		str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int a = Integer.parseInt(str.split(" ")[1]);
		int b = Integer.parseInt(str.split(" ")[2]);
		
		if (a > w || b > h) {
		    System.out.println(-1);
		}
		else {
		    System.out.println(func(n, (w/a)*(h/b)));
		}
		br.close();
	}
}
