package CodeUp.DHTest;

public class Task2 {
	public static void main(String[] args) {
		String s = " 779091968 23 Sep 2009 system.zip\n 284164096 14 Aug 2013 to-do-list.xml\n 714080256 19 Jun 2013 blockbuster.mpeg\n       329 12 Dec 2010 notes.html\n 444596224 17 Jan 1950 delete-this.zip\n       641 24 May 1987 setup.png\n    245760 16 Jul 2005 archive.zip\n 839909376 31 Jan 1990 library.dll";
		String month = null;
		String[] strs = s.split("\n"), strs2 = null;
		long fSize = 0L;
		int day = 0, year = 0, count = 0;
		
		for (int i = 0; i < strs.length; i++) {
			strs2 = strs[i].trim().split(" ");
			fSize = Long.parseLong(strs2[0]);
			day = Integer.parseInt(strs2[1]);
			month = strs2[2];
			year = Integer.parseInt(strs2[3]);
			
			if (fSize >= Math.pow(2, 10)) {
				if (year > 1990) count++;
				else if (year == 1990) {
					if (!month.equals("Jan")) {
						count++;
					}
				}
			}
		}
		if (count == 0) {
			System.out.println("NO FILES");
		}
		else System.out.println(count);
	}
}
