package LettCode.TwoHundred.Easy;

public class P171ExcelSheetColumnNumber {
    static int titleToNumber(String columnTitle) {
        int sum = 0, val = 0, idx = 0;
        for (int i = columnTitle.length()-1; i >= 0; i--) {
        	val = (int) ((columnTitle.charAt(i) - 64) * (Math.pow(26, idx++)));
        	sum += val;
        }
        return sum;
    }
	public static void main(String[] args) {
		
	}
}
