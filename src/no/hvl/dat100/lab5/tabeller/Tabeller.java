package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	public static void main(String[] args) {
	}

//	 a)
	public static void skrivUt(int[] tabell) {

		System.out.println(tilStreng(tabell));
	}

//	 b)
	public static String tilStreng(int[] tabell) {

		String tekst = "[";

		for (int i = 0; i < tabell.length; i++) {
			tekst = tekst + tabell[i];
			if (i < tabell.length - 1) {
				tekst = tekst + ",";
			}
		}
		tekst = tekst + "]";

		return tekst;
	}

//	 c)
	public static int summer(int[] tabell) {

//		int sum = 0;
//		for (int i = 0; i < tabell.length; i++) {
//			sum = sum + tabell[i];
//		}
//		return sum;

//		int i = 0;
//		int sum = 0;
//		while (i< tabell.length) {
//			sum = sum + tabell[i];
//			i++;
//		}
//		return sum;

//		int sum = 0;
//		for (int i = 0; i < tabell.length; i++) {
//			sum = sum + tabell[i];
//		}
//		return sum;

		int sum = 0;
		for (int tall : tabell) {
			sum = sum + tall;
		}
		return sum;

	}

//	 d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int x : tabell) {
			if (x == tall) {
				return true;
			}
		}
		return false;
	}

//	 e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				return i;
			}
		}
		return -1;
	}

//	 f)
	public static int[] reverser(int[] tabell) {

		int[] nyTab = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			nyTab[i] = tabell[tabell.length - i - 1];
		}
		return nyTab;

	}

//	 g)
	public static boolean erSortert(int[] tabell) {

		if (tabell.length <= 1) {
			return true;
		}

		boolean sortert = false;
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] < tabell[i + 1]) {
				sortert = true;
			}
		}
		return sortert;

	}

//	 h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] nyTab = new int[tabell1.length + tabell2.length];

		int j = 0;
		for (int i = 0; i < tabell1.length; i++) {
			nyTab[j] = tabell1[i];
			j++;
		}

		for (int i = 0; i < tabell2.length; i++) {
			nyTab[j] = tabell2[i];
			j++;
		}
		return nyTab;
	}
}
