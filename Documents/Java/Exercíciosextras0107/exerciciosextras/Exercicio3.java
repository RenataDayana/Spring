package br.com.generation.exerciciosextras;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int segundosTotal, tempoHoras, tempoMinutos, tempoSegundos;
		
		System.out.println("Inforeme o tempo total do evento em segundos: ");
		segundosTotal = read.nextInt();
		
		tempoHoras = segundosTotal/3600;
		tempoMinutos = (segundosTotal%3600)/60;
		tempoSegundos = (segundosTotal%3600)%60;
		
		System.out.println("O tempo de dura��o do evento � de "
		+ tempoHoras + " horas, "+ tempoMinutos + " minutos e " + tempoSegundos +" segundos.");
	}

}
