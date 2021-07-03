package CodeUp.FourThousandth.Five;

public class Iceberg4573 {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] arr2 = arr.clone();
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i].clone();
		}
		arr2[0][0] = 30;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(arr);
		System.out.println(arr2);
	}
}
