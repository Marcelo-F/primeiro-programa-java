package cursojava.executavel;

public class Matriz {
	
	public static void main(String[] args) {
		
		int notas [][] = new int [2][3]; /*Uma matriz com 2 linhas com 3 colunas*/
		notas[0][0] = 90;
		notas[0][1] = 90;
		notas[0][2] = 90;
	
		
		notas[1][0] = 80;
		notas[1][1] = 80;
		notas[1][2] = 80;
		
		
		
		for (int poslinha = 0; poslinha<notas.length; poslinha ++ ) {
			System.out.println("-----------------------------------------------");
			
			for (int poscoluna =0; poscoluna <notas[poslinha].length; poscoluna++) {			
			
				System.out.println("Valor da matriz: " + notas[poslinha][poscoluna]);
		}
		
		
		
	}

}}
