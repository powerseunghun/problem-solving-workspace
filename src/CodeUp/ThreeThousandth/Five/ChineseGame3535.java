package CodeUp.ThreeThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ChineseGame3535 {
	static int[] num = new int[4];
	static char[] op = new char[3];
	static ArrayList<String> list = new ArrayList<>();
	static void bt(int N, int depth, char[] ops) {
		if (N == depth) {
			StringBuilder sb = new StringBuilder();
			int res = num[0];
			sb.append(num[0]);
			for (int i = 0; i < op.length; i++) {
				sb.append(op[i]);
				sb.append(num[i+1]);
				switch(op[i]) {
				case '+':
					res += num[i+1];
					break;
				case '-':
					res -= num[i+1];
					break;
				case '*':
					res *= num[i+1];
					break;
				case '/':
					if ((double)res / num[i+1] != res / num[i+1]) return;
					res /= num[i+1];
					break;
				}
			}
			if (res == 24) list.add(sb.toString());
			return;
		}
		for (int i = 0; i < ops.length; i++) {
			op[depth] = ops[i];
			bt(N, depth+1, ops);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] ops = { '+', '-', '*', '/' };
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		bt(3, 0, ops);
		if (list.size() == 0) {
			System.out.println("Doesn't Exist");
		}
		else System.out.println(list.get(0));
	}
}
