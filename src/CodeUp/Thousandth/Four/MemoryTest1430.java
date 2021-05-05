package CodeUp.Thousandth.Four;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MemoryTest1430 {
	public static void main(String[] args) throws IOException {
		// br = memory limit
		// scanner = time limit
		// yet.. .
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), M = 0;
		int[] arr = new int[10000001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		Arrays.fill(arr, 0);
		
		while (st.hasMoreTokens()) {
			arr[Integer.parseInt(st.nextToken())] = 1;
		}
		br.readLine();
		st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			System.out.print(arr[Integer.parseInt(st.nextToken())] + " ");
		}
	}
}
