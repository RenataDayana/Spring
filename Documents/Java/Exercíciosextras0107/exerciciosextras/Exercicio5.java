package br.com.generation.exerciciosextras;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double nota1, nota2, nota3, mediaPonderada;
		

		nota1 = 2.0;
		nota2 = 3.0;
		nota3 = 5.0;

		System.out.println("Digite o valor da 1� nota: ");
		nota1 = read.nextDouble();

		System.out.println("Digite o valor da 2� nota: ");
		nota2 = read.nextDouble();

		System.out.println("Digite o valor da 3� nota: ");
		nota3 = read.nextDouble();

		
		mediaPonderada = ((nota1*2+nota2*3+nota3*5)/10);
		

		System.out.println("A m�dia final do aluno � " + mediaPonderada);
	}

}
