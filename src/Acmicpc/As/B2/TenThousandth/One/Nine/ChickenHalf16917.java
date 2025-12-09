package Acmicpc.As.B2.TenThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChickenHalf16917 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		int C = Integer.parseInt(str.split(" ")[2]);
		int X = Integer.parseInt(str.split(" ")[3]);
		int Y = Integer.parseInt(str.split(" ")[4]);
		
		System.out.println(Math.min(A*X+B*Y, Math.min(C*2*Math.max(X, Y), C*2*Math.min(X, Y)+A*(X-Math.min(X, Y))+B*(Y-Math.min(X, Y)))));
		br.close();
	}
}
