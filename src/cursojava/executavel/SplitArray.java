package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {

	
	String texto = "Alex, java,80,90";
	
	String[] valoresArray = texto.split(",");
	
	System.out.println("Nome: " +valoresArray[0]);
	System.out.println("Curso: "+valoresArray[1]);
	System.out.println("Nota1: "+valoresArray[2]);
	System.out.println("Nota2: "+valoresArray[3]);
	
	/*Convertendo um array em uma lista*/
	
	List<String> list = Arrays.asList(valoresArray);
	
	for(String valorString: list) {
		System.out.println(valoresArray);
	}
	
	/*Convetendo uma lista em um array*/
	
	String[] conversaoArray = list.toArray(new String[6]);
	
	for(int pos =0; pos< conversaoArray.length; pos++){
	System.out.println(conversaoArray[pos]);
	}
	
	
	}

}
