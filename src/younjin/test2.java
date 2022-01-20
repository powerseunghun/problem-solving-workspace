package younjin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test2 {
	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		int[] weight = new int[N], height = new int[N];
		int[] rank = new int[N];
		
		Arrays.fill(rank, 0);
		for (int i = 0; i < weight.length; i++) {
			tmp = br.readLine();
			weight[i] = Integer.parseInt(tmp.split(" ")[0]);
			height[i] = Integer.parseInt(tmp.split(" ")[1]);
		}
		for (int i = 0, r = 1; i < rank.length; i++, r = 1) {
			for (int j = 0; j < rank.length; j++) {
				if (i == j) continue;
				r += (weight[i] < weight[j] && height[i] < height[j]) ? 1 : 0;
			}
			rank[i] = r;
		}
		
		for (int el : rank) {
			System.out.print(el + " ");
		}
		br.close();
		
//		for (int i = 0; i < weight.length; i++) {
//			System.out.print(weight[i] + " ");
//		}
//		System.out.println();
//		for (int i = 0; i < height.length; i++) {
//			System.out.print(height[i] + " ");
//		}
	}
}
