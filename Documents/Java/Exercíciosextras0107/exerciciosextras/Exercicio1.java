package br.com.generation.exerciciosextras;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		 
		Scanner leia = new Scanner(System.in);
		
		int idadeAnos, idadeMeses, idadeDias;
		
		System.out.println("Informe sua idade em anos: ");
		idadeAnos = leia.nextInt();
		
		System.out.println("Informe sua idade em meses: ");
		idadeMeses = leia.nextInt();
		
		System.out.println("Informe sua idade em dias: ");
		idadeDias = leia.nextInt();
		
		System.out.println("A idade total tem " + ((idadeAnos*365) + (idadeMeses*30) + idadeDias) + " dias.");
		
		
	
		
	}
	

}
