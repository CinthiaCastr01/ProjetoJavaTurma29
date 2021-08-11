package ProjetoJavaGNB;

import java.util.Scanner;

public class Investimento {
	
	public static void main(String[] args) {
		int escolha, escolha2, escolha3;
		double valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("\n\t--Menu de Escolha--");
		System.out.println("\n1-Colch�o\n2-Poupan�a\n3-Renda fixa\n4-Renda vari�vel");
		escolha = teclado.nextInt();
		switch(escolha) {
		
		case 1:
			System.out.println("\n\t---Colch�o---");
			System.out.println("\nN�o h� rendimento aqui, apenas acumulo de valor depositado.");
			System.out.println("\n\t---Colch�o---");
			System.out.println("\nDigite o valor que gostaria de depositar mensalmente: R$");
			valor = teclado.nextDouble();
			do {
				System.out.println("Selecione uma op��o: \n1-Curto Prazo\n2-M�dio Prazo\n3-Longo Prazo");
				escolha3 = teclado.nextInt();
				
				switch(escolha3) {
				case 1:
					System.out.println("\n\t---Seu Colch�o possui---");
					double total = valor * 3;
					System.out.println("Terceiro m�s: R$" + total);
					total = valor * 6;
					System.out.println("Sexto m�s: R$" + total);
					break;
				case 2:					
					System.out.println("\n\t---Seu Colch�o possui---");
					total = valor * 12;
					System.out.println("Um ano: R$" + total);
					total = valor * 24;
					System.out.println("Dois anos: R$" + total);
					break;
				case 3:
					System.out.println("\n\t---Seu Colch�o possui---");
					total = valor * 36;
					System.out.println("Tr�s anos: R$" + total);
					total = valor * 60;
					System.out.println("Cinco anos: R$" + total);
					break;
				default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
				}
			}while(escolha3 < 1 || escolha3 > 3);
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
					do {
					System.out.println("Selecione uma op��o: \n1-Curto Prazo\n2-M�dio Prazo\n3-Longo Prazo");
					escolha3 = teclado.nextInt();
					
					switch(escolha3) {
					case 1:
						System.out.println("\n\t---Seu Rendimento foi de---");
						double total = (valor + (valor * 0.04)) * 3;
						System.out.println("Terceiro m�s: R$" + total);
						total = (valor + (valor * 0.04)) * 6;
						System.out.println("Sexto m�s: R$" + total);
						break;
					case 2:					
						System.out.println("\n\t---Seu Rendimento foi de---");
						total = (valor + (valor * 0.04)) * 12;
						System.out.println("Um ano: R$" + total);
						total = (valor + (valor * 0.04)) * 24;
						System.out.println("Dois anos: R$" + total);
						break;
					case 3:
						System.out.println("\n\t---Seu Rendimento foi de---");
						total = (valor + (valor * 0.04)) * 36;
						System.out.println("Tr�s anos: R$" + total);
						total = (valor + (valor * 0.04)) * 60;
						System.out.println("Cinco anos: R$" + total);
						break;
					default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
					}
				}while(escolha3 < 1 || escolha3 > 3);
				break;
				
			case 2 : 
				System.out.println("\n\t---Poupan�a---");
				System.out.println("\nDefina um valor que gostaria de alcan�ar: R$");
				valor = teclado.nextDouble();
				//Quero uma meta
				break;			
				default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente."); 
			}
			
		case 3 :
			//Renda fixa
			System.out.println("\n\t---Renda fixa---");
			System.out.println("Selecione uma op��o abaixo: \n1-Fazer estimativa com o que tenho.\n2-Quero criar uma Meta!");
			escolha2 = teclado.nextInt();
			switch(escolha2) {
			case 1 :
				
					System.out.println("\n\t---Renda fixa---");
					System.out.println("\nDigite o valor que gostaria de depositar mensalmente: R$");
					valor = teclado.nextDouble();
					do {
					System.out.println("Selecione uma op��o: \n1-Curto Prazo\n2-M�dio Prazo\n3-Longo Prazo");
					escolha3 = teclado.nextInt();
					
					switch(escolha3) {
					case 1:
						System.out.println("\n\t---Seu Rendimento foi de---");
						double total = (valor + (valor * 0.05)) * 3;
						System.out.println("Terceiro m�s: R$" + total);
						total = (valor + (valor * 0.05)) * 6;
						System.out.println("Sexto m�s: R$" + total);
						break;
					case 2:					
						System.out.println("\n\t---Seu Rendimento foi de---");
						total = (valor + (valor * 0.05)) * 12;
						System.out.println("Um ano: R$" + total);
						total = (valor + (valor * 0.05)) * 24;
						System.out.println("Dois anos: R$" + total);
						break;
					case 3:
						System.out.println("\n\t---Seu Rendimento foi de---");
						total = (valor + (valor * 0.05)) * 36;
						System.out.println("Tr�s anos: R$" + total);
						total = (valor + (valor * 0.05)) * 60;
						System.out.println("Cinco anos: R$" + total);
						break;
					default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
					}
				}while(escolha3 < 1 || escolha3 > 3);
				break;
				
			case 2 : 
				System.out.println("\n\t---Renda fixa---");
				System.out.println("\nDefina um valor que gostaria de alcan�ar: R$");
				valor = teclado.nextDouble();
				//Quero uma meta
				break;			
				default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente."); 
			}
			
		
		case 4 :
			//Renda Variavel
			System.out.println("\n\t---Renda Variavel---");
			System.out.println("Selecione uma op��o abaixo: \n1-Fazer estimativa com o que tenho.\n2-Quero criar uma Meta!");
			escolha2 = teclado.nextInt();
			switch(escolha2) {
			case 1 :
				
					System.out.println("\n\t---Renda Variavel---");
					System.out.println("\nDigite o valor do investimento inicial: R$");
					valor = teclado.nextDouble();
					do {
					System.out.println("Selecione uma op��o: \n1-Curto Prazo\n2-M�dio Prazo\n3-Longo Prazo");
					escolha3 = teclado.nextInt();
					
					switch(escolha3) {
					case 1:
						System.out.println("\n\t---Estimativa de Rendimento---");
						System.out.println("Diacordo com o valor inserido, ser� cauculado 10% de acrecimo mensal emcima do valor base, com adicional da taxa variavel.");
						double total = (((valor + valor * 0.1) * (0.04)) * 3);
						System.out.println("Terceiro m�s: R$" + total);
						total = (((valor + valor * 0.1) * (0.05)) * 6);
						System.out.println("Sexto m�s: R$" + total);
						break;
					case 2:					
						System.out.println("\n\t---Estimativa de Rendimento---");
						System.out.println("Diacordo com o valor inserido, ser� cauculado 10% de acrecimo mensal emcima do valor base, com adicional da taxa variavel.");
						total = (((valor + valor * 0.1) * (0.06)) * 12);
						System.out.println("Um ano: R$" + total);
						total = (((valor + valor * 0.1) * (0.07)) * 24);
						System.out.println("Dois anos: R$" + total);
						break;
					case 3:
						System.out.println("\n\t---Estimativa de Rendimento---");
						System.out.println("Diacordo com o valor inserido, ser� cauculado 10% de acrecimo mensal emcima do valor base, com adicional da taxa variavel.");
						total = (((valor + valor * 0.1) * (0.08)) * 36);
						System.out.println("Tr�s anos: R$" + total);
						total = (((valor + valor * 0.1) * (0.1)) * 60);
						System.out.println("Cinco anos: R$" + total);
						break;
					default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
					}
				}while(escolha3 < 1 || escolha3 > 3);
				break;
				
			case 2 : 
				System.out.println("\n\t---Renda Variavel---");
				System.out.println("\nDefina um valor que gostaria de alcan�ar: R$");
				valor = teclado.nextDouble();
				//Quero uma meta
				break;			
				default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente."); 
			}
			
			
		}
		
	}
}
