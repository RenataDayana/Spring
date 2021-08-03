package br.com.generation.exerciciosextras;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int idadeDias, idadeAnos, idadeMeses, diasTotal;
		
		System.out.println("Informe sua idade em dias: ");
		diasTotal = read.nextInt();
		
		idadeAnos = diasTotal/365;
		idadeMeses = (diasTotal%365)/30;
		idadeDias = (diasTotal%365)%30;
		
		System.out.println("Sua idade tem " + idadeAnos+" Anos, " + idadeMeses + " meses e " + idadeDias + " dias.");
		
	}

}
