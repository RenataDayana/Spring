package br.com.generation.exerciciosextras;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double  a, b, c ,d, r, s;
		
		System.out.println("Digite o 1� n�mero: ");
		a = read.nextDouble();
		System.out.println("Digite o 2� n�mero: ");
		b = read.nextDouble();
		System.out.println("Digite o 3� n�mero: ");
		c = read.nextDouble();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		
		d = (r+s)/2;
		
		System.out.println("O valor de D = "+ d +".");		
	}
}
