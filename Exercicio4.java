
//Criar uma cartela de bingo aleatoriamente com 16 posições (4x4), indo de 01 a 75. Ao cantar os números informar se a cartela tem ou não os números cantados. O jogador ganha quando acerta as 16 dezenas, nesse caso, informa a frase BINGO e diz quantas rodadas ele demorou para acertar. 
import java.util.Random;
import java.util.Scanner;
public class Exercicio4
{
	public static void main(String[] args) {
	    int m1[][]= new int [4][4],i1=0,reset=0, linha,coluna, v[]=new int[75],n;
	    String in1;
	    Random random=new Random();
	    Scanner scanner=new Scanner(System.in);
	    
	 
        	     for (linha=0;linha<4;linha++){
        	        for(coluna=0;coluna<4;coluna++){
        	            m1[linha][coluna]=random.nextInt(20) + 1;
        	        }
        	        coluna=0;
        	    }
        	    linha=0;
        	    for (linha=0;linha<4;linha++){
        	        System.out.println();
        	        for(coluna=0;coluna<4;coluna++){
        	            System.out.print(m1[linha][coluna]+" ");
        	        }
        	    }
    
	    while (reset<16){
	        
            System.out.println("\nDigite um número");
	       	n=scanner.nextInt();
	       	for (int contador=0;contador<20;contador++){
	       	    if (v[contador]==n){
	       	        System.out.println("Esse número já foi digitado, digite outro");
	            	n=scanner.nextInt();
	       	    }
	       	}
	       	v[i1]=n;
	        for (linha=0;linha<4;linha++){
    	        for(coluna=0;coluna<4;coluna++){
    					if (m1[linha][coluna]==n){
    						reset=reset+1;
    						System.out.println("Acertou");
    					}
    				}
	       }
	        
	        
	      
    	    i1=i1+1;  
	    }
	   System.out.println("Você ganhou na "+i1+"º tentativa");

	    
	    
	    
    }
}

