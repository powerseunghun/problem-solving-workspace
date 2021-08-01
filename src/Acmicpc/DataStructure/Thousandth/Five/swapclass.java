package Acmicpc.DataStructure.Thousandth.Five;

public class swapclass {
	static String swap(String str, int curIdx, int newIdx) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			if (i == curIdx) {
				sb.append(str.charAt(newIdx));
			}
			else if (i == newIdx) {
				sb.append(str.charAt(curIdx));
			}
			else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String str = "103425786";
		String swapStr = swap(str, str.indexOf('0'), 0);
		System.out.println(swapStr);
	}
}
