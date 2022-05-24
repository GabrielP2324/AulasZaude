import java.util.Random;

public class ex1 {
	public static void main(String[] args) {
//		//Preencha uma matriz quadrada de ordem 4 com valores informados pelo usuário da 
//		aplicação. O preenchimento da matriz deverá ser feito em um método. 
//		b)  Gere e imprima no vídeo uma nova matriz a partir da matriz preenchida obedecendo a 
//		seguinte regra: cada posição da nova matriz é a soma de todos os elementos da linha e da 
//		coluna em que a posição se encontra. Por exemplo: 
		int[][] matriz = new int[4][4];
		
		preencher(matriz);
		//declaração de variáveis que precisaremos
		int somalinha=0;
		int somacoluna =0; 
		
		
		int[] linha = new int[4];
		int[] coluna = new int[4];
		
		//preenche os vetores linha e coluna
		for(int i=0;i<matriz.length;i++) {
			for(int j = 0; j<matriz[i].length;j++) {
				somalinha += matriz[i][j]; //pegando o valor da linha
				somacoluna += matriz[j][i];//pegando o valor da coluna
				
				if(j== matriz[i].length-1) {
					linha[i] = somalinha; //colocando soma no vetor somente quando acabamos cada "linha"
					coluna[i] = somacoluna;//colocando soma no vetor somente quando acabamos cada "coluna"
					somalinha = 0;
					somacoluna = 0;
				}
			}
		}
		System.out.println();
		for(int i=0; i<4;i++) {
			System.out.println(linha[i] + " " + coluna[i]);
		}
		System.out.println();
		int[][] novamatriz = new int[matriz.length][matriz[0].length];
		
		for(int i=0;i<novamatriz.length;i++) {
			for(int j=0;j<novamatriz[i].length;j++) {
				novamatriz[i][j] = linha[i]+coluna[j]-matriz[i][j]; // retirando um valor de matriz[i][j] pq ele está presente 2 vezes
				System.out.print(novamatriz[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void preencher(int[][] matriz) {
		Random aleatorio = new Random();

		for(int linha = 0; linha< matriz.length; linha++) {
			for(int coluna = 0; coluna <matriz[linha].length;coluna++) {
				matriz[linha][coluna] = aleatorio.nextInt(21);
				System.out.print(matriz[linha][coluna]+"\t");
			}
			System.out.println();
		}
	}
}
