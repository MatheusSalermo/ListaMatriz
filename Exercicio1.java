//Criar uma matriz 4x4 de inteiros sendo que cada elemento da matriz será preenchido com o dobro do elemento anterior (o elemento[0][0] será o 2).
import java.util.*;
	class Exercicio1{
		public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		int matriz[][] = new int [4][4];
		int valor =1;
			for(int i=0; i<=3; i++){
				System.out.println("");
				for (int j=0;j<=3; j++){
					matriz[i][j] = 2*valor;
					valor = matriz[i][j];
					System.out.print(matriz[i][j] +" ");
				}
			}
		}
	}