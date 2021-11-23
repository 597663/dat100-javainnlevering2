package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		System.out.println(tilStreng(matrise));
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String tekst = "";

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				tekst = tekst + matrise[i][j] + " ";
			}
			tekst = tekst + "\n";
		}

		return tekst;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] nyMatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				nyMatrise[i][j] = tall * matrise[i][j];
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] nyMatrise = new int[matrise.length][matrise.length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise.length; j++) {
				nyMatrise[j][i] = matrise[i][j];
			}
		}
		return nyMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] multiplisert = new int[a.length][b.length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					multiplisert[i][j] = multiplisert[i][j] + a[i][k] * b[k][j];
				}

			}
		}
		return multiplisert;
	}
}
