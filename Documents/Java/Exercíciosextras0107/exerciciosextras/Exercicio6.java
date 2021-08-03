package br.com.generation.exerciciosextras;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double x1, y1, x2, y2, p1, p2,d;
		
		System.out.println("Informe o valor de x1: ");
		x1 = read.nextDouble();
		
		System.out.println("Informe o valor de x2: ");
		x2 = read.nextDouble();
		
		System.out.println("Informe o valor de y1: ");
		y1 = read.nextDouble();
		
		System.out.println("Informe o valor de y2: ");
		y2 = read.nextDouble();
		
		p1 = Math.pow((x2-x1), 2);
		p2 = Math.pow((y2-y1), 2);
		
		d = Math.sqrt(p1+p2); 
		
		System.out.println("A distância de P1 para P2 é :" + d + ".");
		
		
		
		
		
	}

}
