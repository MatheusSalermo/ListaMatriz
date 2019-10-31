//Criar uma matriz 3x4 sendo que na última coluna deverá ter a soma de cada linha
import java.util.*;
	class Exercicio3{
		public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		int matriz[][] = new int [3][4];
		int soma=0;
			for(int i=0; i<3; i++){
				soma =0;
				for (int j=0;j<3; j++){
					matriz[i][j] = entrada.nextInt();
					soma = soma +matriz[i][j];
					if(j == 2) {
						matriz[i][j] = soma;
						System.out.println("A soma das posições pasadas é "+matriz[i][j]);
					}
				}
			}
		}
	}