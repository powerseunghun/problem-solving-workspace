package Acmicpc.DataStructure.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JosephusProblem1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		String tmp = br.readLine();
		Queue<Integer> q = new LinkedList<>();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), count = 0, val = 0;
		
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		while (!q.isEmpty()) {
			count++;
			val = q.poll();
			if (count != K) {
				q.add(val);
				continue;
			}
			
			list.add(val);
			count = 0;
		}
		
		System.out.print("<");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			if (i != list.size()-1) System.out.print(", ");
		}
		System.out.println(">");
	}
}
