package br.com.generation.exerciciosextras;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double a, b, c, d, e, f,x , y ;
		
		System.out.println("Digite um valor para A: ");
		a = read.nextDouble();
		System.out.println("Digite um valor para B: ");
		b = read.nextDouble();
		System.out.println("Digite um valor para C: ");
		c = read.nextDouble();
		System.out.println("Digite um valor para D: ");
		d = read.nextDouble();
		System.out.println("Digite um valor para E: ");
		e = read.nextDouble();
		System.out.println("Digite um valor para F: ");
		f = read.nextDouble();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.println("O valor de x é: " + x);
		System.out.println("O valor de x é: " + y);
		
	}

}
