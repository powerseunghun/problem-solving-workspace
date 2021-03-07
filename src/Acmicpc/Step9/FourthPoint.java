package Acmicpc.Step9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FourthPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> pointx = new HashMap<>();
		Map<Integer, Integer> pointy = new HashMap<>();
		
		ArrayList<Integer> xValue = new ArrayList<>();
		ArrayList<Integer> yValue = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			int p = sc.nextInt();
			
			if (i % 2 == 0) {
				if (!xValue.contains(p)) {
					xValue.add(p);
				}
				if (!pointx.containsKey(p)) {
					pointx.put(p, 1);
				}
				else {
					pointx.put(p, pointx.get(p) + 1);
				}
			}
			else {
				if (!yValue.contains(p)) {
					yValue.add(p);
				}
				if (!pointy.containsKey(p)) {
					pointy.put(p, 1);
				}
				else {
					pointy.put(p, pointy.get(p) + 1);
				}
			}
			
		}
		for (int i = 0; i < xValue.size(); i++) {
			if (pointx.get(xValue.get(i)) % 2 != 0) {
				System.out.print(xValue.get(i) + " ");
			}
		}
		for (int i = 0; i < yValue.size(); i++) {
			if (pointy.get(yValue.get(i)) % 2 != 0) {
				System.out.print(yValue.get(i) + " ");
			}
		}
	}
}
