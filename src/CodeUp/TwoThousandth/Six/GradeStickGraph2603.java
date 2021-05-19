package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GradeStickGraph2603 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] graph = new char[10][10];
		for (int i = 0; i < graph.length; i++) {
			Arrays.fill(graph[i], ' ');
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < graph.length; i++) {
			int tmp = Integer.parseInt(st.nextToken()) / 10;
			for (int j = 0; j < tmp; j++) {
				graph[graph.length-1-j][i] = '#';
			}
		}
		
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[i].length; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
	}
}
