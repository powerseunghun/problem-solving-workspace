package younjin;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test5 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int[] arr = new int[X+1];
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1]+1;
			if (i % 3 == 0) arr[i] = Math.min(arr[i], arr[i/3]+1);
			if (i % 2 == 0) arr[i] = Math.min(arr[i], arr[i/2]+1);
		}
		
		System.out.println(arr[X]);
		br.close();
		
		//     1
		//  2    3
		// 4 5  6  7
		// dfs -> recursion
		// bfs -> Queue (FIFO) 
		
	}
}
