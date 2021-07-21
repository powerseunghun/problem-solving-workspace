package Acmicpc.MatheMatics.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Password1760 {
	public static void main(String[] args) throws IOException {
		PriorityQueue<String> q = new PriorityQueue<>();
		q.add("a");
		q.add("d");
		q.add("e");
		q.add("g");
		q.add("b");
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
