package aula0506;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] a = new int[2][2];
		int[][] b = new int[2][2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				a[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j] = a[j][i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
