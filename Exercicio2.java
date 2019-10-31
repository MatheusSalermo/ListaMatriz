//Criar uma matriz de 3x3 de inteiros, que deverá ser preenchida aleatoriamente. Fazer uma busca que indique o maior e o menor valor da matriz e qual a posição em que ele está (qual a sua linha e coluna)
import java.util.*;
class Exercicio2{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		int matriz[][] = new int [3][3];
		int mati[][] = new int [1][1];
		int l=0,o=0,p=0,k=0,g=0,f=0,q=0,w=0;
		Random x = new Random ();
		for(int i=0; i<matriz.length; i++){
			System.out.println("");
			for (int j=0;j<matriz[i].length; j++){
				matriz[i][j] = (int) x.nextInt() %10;
				System.out.print(matriz[i][j] +" ");
				if(matriz[l][o]>matriz[i][j]){
					if(mati[l][o]<matriz[i][j]){
						continue;
					}
					else{
						mati[q][w] = matriz[i][j];
					g = i;
					f = j;
					}
				}
				else if(matriz[l][o]<=matriz[i][j]){
					matriz[l][o] = matriz[i][j];
					p = i;
					k = j;
				}

			}
		}
		System.out.println("");
		System.out.println("O maior numero é "+matriz[l][o]+ " ,na posição ["+p+"]["+k+"]");
		System.out.println("");

		System.out.println("O menor numero é "+mati[q][w]+ "  ,na posição ["+g+"]["+f+"]");

	}
}