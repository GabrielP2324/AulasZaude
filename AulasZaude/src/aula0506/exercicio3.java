package aula0506;

public class exercicio3 {
	public static void main(String[] args) {
		int[] x = {1,1,1,1,1,1,1,1};
		
		for (int i = 0; i<x.length;i++) {
			System.out.println(x[i]);
		}
		
		teste(x);
		for (int i = 0; i<x.length;i++) {
			System.out.println(x[i]);
		}
		
	}
	
	public static void teste(int[] x) {
		for(int i= 0; i<x.length; i++) {
			x[i]=0;
		}
	}
}
