package br.com.generation.exerciciosextras;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double custoTotal, custoFabrica, pDistribuidor, impostos;
		
		System.out.println("Informe o custo de fábrica: ");
		custoFabrica = read.nextDouble();
		
		pDistribuidor = (custoFabrica/100)*28;
		impostos = (custoFabrica/100)*45;
		custoTotal= custoFabrica + pDistribuidor + impostos;
		
		System.out.println("O custo ao consumidor é R$ " + custoTotal);
		
	}
}
