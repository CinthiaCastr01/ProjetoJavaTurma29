package ProjetoJavaGNB;

import java.util.Scanner;

public class Investimento {
	
	public static void main(String[] args) {
		int escolha, escolha2;
		double valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("\n\t--Menu de Escolha--");
		System.out.println("\n1-Couch�o\n2-Poupan�a\n3-Renda fixa\n4-Renda vari�vel");
		escolha = teclado.nextInt();
		switch(escolha) {
		case 1:
			System.out.println("\n\t---Couch�o---");
			System.out.println("\nN�o h� rendimento aqui, apenas acumulo de valor depositado.");
			break;
		case 2:
			System.out.println("\n\t---Poupan�a---");
			System.out.println("Selecione uma op��o abaixo: \n1-Fazer estimativa com o que tenho.\n2-Quero criar uma Meta!");
			escolha2 = teclado.nextInt();
			switch(escolha2) {
			case 1 :
				System.out.println("\n\t---Poupan�a---");
				System.out.println("\nDigite o valor que gostaria de depositar mensalmente: R$");
				valor = teclado.nextDouble();
				System.out.println("");
				double total = valor * 3;
				System.out.println("");
				total = valor * 6;
				System.out.println("");
				total = valor * 12;
				break;
			case 2 : 
				System.out.println("\n\t---Poupan�a---");
				System.out.println("\nDefina um valor que gostaria de alcan�ar: R$");
				valor = teclado.nextDouble();
				break;
			case 3:
			case 4:
				default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente."); 
			}
			
		}
		
	}
}
