//Exercício que posiciona uma Matriz
import java .util .Scanner;
  public class Exemplo1 {	

public static void main (String [] args) {
	Scanner ET = new Scanner (System .in); 
	int v[][]=new int [3][3] ;
int i,j;
for (i=0 ;i<=2;i++){
for(j=0 ;j<=2;j++){
System.out.print ("\nEntre com o valor ["+ (i+1)+ "] ["+ (j+1)+ "] : " );
v [i][j] =ET.nextInt ();
}
}
System.out.print ("\n :: VALORES DA MATRIZ ::\n\n"); for(i=0;i<=2;i++){
for(j=0 ;j<=2;j++){
System .out .print (" ["+v [i][j]+"] "); 
if(j==2){
System .out.print ("\n");
}
}
}
}
}

