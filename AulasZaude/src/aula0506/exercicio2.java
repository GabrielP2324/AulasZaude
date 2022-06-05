package aula0506;

public class exercicio2 {
	public static void main(String[] args) {
		int[] x = {10,2,40,53,28,12};
		
		boolean aux = true;
		int temp;
		
		while (aux==true) {
			aux = false;
			for(int k = 0;k<x.length-2;k++) {
				if(x[k]>x[k+1]) {
					temp = x[k];
					x[k] = x[k+1];
					x[k+1] = temp;
					aux = true;
				}
			}
		}
		for (int i = 0; i<x.length; i++) {
			System.out.println(x[i]);
		}
	}
}
