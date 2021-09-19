package SWExpertAcademy.D3.ThreeThousandth.One;

public class UnderMillionPrime3131 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[1000001];
		for (int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0) continue;
			for (int j = 2 * i; j < arr.length; j+=i) {
				arr[j] = 0;
			}
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] != 0) sb.append(i + " ");
		}
		System.out.print(sb.toString());
	}
}
