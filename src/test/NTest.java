package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NTest {
	static int count = 0, areaCount = 0;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static boolean validate(int nx, int ny, int sizeOfMatrix) {
		if (nx < 0 || ny < 0 || nx > sizeOfMatrix-1 || ny > sizeOfMatrix-1) return false;
		return true;
	}
	static void search(int x, int y, int sizeOfMatrix, int[][] matrix) {
		if (matrix[x][y] == 0) return;
		
		matrix[x][y] = 0;
		areaCount++;
		for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
			nx = x + dirX[i];
			ny = y + dirY[i];
			if (validate(nx, ny, sizeOfMatrix)) {
				search(nx, ny, sizeOfMatrix, matrix);
			}
		}
	}
	static void solution(int sizeOfMatrix, int[][] matrix) {
		List<Integer> areaList = new ArrayList<>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {
					count++;
					areaCount = 0;
					search(i, j, sizeOfMatrix, matrix);
					areaList.add(areaCount);
				}
			}
		}
		Collections.sort(areaList);
		System.out.println(count);
		for (int i = 0; i < areaList.size(); i++) {
			System.out.print(areaList.get(i) + " ");
		}
	}
	private static class InputData {
		int sizeOfMatrix;
		int[][] matrix;
	}
	private static InputData processStdin() {
		InputData inputData = new InputData();
		
		try (Scanner scanner = new Scanner(System.in)) {
			inputData.sizeOfMatrix = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
			inputData.matrix = new int[inputData.sizeOfMatrix][inputData.sizeOfMatrix];
			for (int i = 0; i < inputData.sizeOfMatrix; i++) {
				String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
				for (int j = 0; j < inputData.sizeOfMatrix; j++) {
					inputData.matrix[i][j] = Integer.parseInt(buf[j]);
				}
			}
		} catch(Exception e) {
			throw e;
		}
		return inputData;
	}
 	public static void main(String[] args) {
		InputData inputData = processStdin();
		
		solution(inputData.sizeOfMatrix, inputData.matrix);
	}
}
