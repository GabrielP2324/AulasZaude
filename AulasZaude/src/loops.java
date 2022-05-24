import java.util.Scanner;

public class loops {
	public static void main(String[] args) {
		//for
		//for( contador; condição: contador<x;mudança: contador++)
		
		for(int i=0; i<10;i++) {//contador de 1 a 10
			System.out.println(i);
		}
		
		int[] vetor = {10,8,6,3,5,4,1,2,9,7};
		for(int indice = 0; indice<vetor.length; indice++) {
			System.out.println(vetor[indice]);
		}
		
		for(int i=0;i<10;i++) {
			
		}
		for(int i=0;i<10;i++) {
			
		}
		for(int i=0;i<10;i++) {
			
		}
		
//		for(;true;) {//loop infinito
//			
//		}
		
		
		
		//while
		int contador =0;
		while(contador<vetor.length) {
			System.out.println(vetor[contador]);
			contador++;
		}
		
		contador=0;
		//do while
		do {
			System.out.println(vetor[contador]);
			contador++;
		}while(contador<vetor.length);
		
		Scanner teclado = new Scanner(System.in);
	
		
		int linhas = 3;
		int colunas = 3;
		int[][] matriz = new int[linhas][colunas];
		
		/*
			1 2 3
			4 5 6
			7 8 9
		*/
		for(int i = 0; i<matriz.length;i++) {//matriz.length 1a variavel
			for(int j =0; i<matriz[i].length;i++) {//matriz[i].length 2a variavel
				
			}
			
		}
	}
}
