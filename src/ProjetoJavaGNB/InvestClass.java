package ProjetoJavaGNB;

import java.util.Scanner;

public class InvestClass {
	Scanner teclado = new Scanner(System.in);
	int escolha, escolha2, escolha3;
	double valor;
	
	
	public void infoRendimento(int v1, int v2, double v3) {
		System.out.println("\n\t---Seu Rendimento foi---");		
		//double total = (valor + (valor * v3)) * v1;
		double valorB;
		double valorF = valor;
		valorB = valorF + (valorF * v3);		
		for(int i = 0; i < (v1-1); i ++) {
			valorB = (valorF + valorB);
			valorB = valorB + (valorB * v3);	
		}		
		
		if(v1 == 3) {
			System.out.printf("\nTerceiro m�s: R$%.2f", valorB);
		}
		else if (v1 == 12) {
			System.out.printf("\nUm ano: R$%.2f", valorB);
		}
		else if (v1 == 36) {
			System.out.printf("\nTr�s anos: R$%.2f", valorB);
		}
		//total = (valor + (valor * v3)) * v2;
				
		valorF = valor;
		valorB = valorF + (valorF * v3);
		for(int i = 0; i < (v2-1); i ++) {
			valorB = (valorF + valorB);
			valorB = valorB + (valorB * v3);
		}
		
		if(v2 == 6) {		
			System.out.printf("\nSexto m�s: R$%.2f" , valorB);
		}
		else if(v2 == 24) {		
			System.out.printf("\nDois anos: R$%.2f" , valorB);
		}
		else if(v2 == 60) {		
			System.out.printf("\nCinco anos: R$%.2f" , valorB);
		}
	}
	
	public void subMenuPoupanca1(int escolha) {
		//Estimativa com o que tenho
		System.out.println("\n\t---Poupan�a---");
		System.out.println("\n\t---Estimativa com o que tenho---");
		System.out.println("\nDigite o valor que gostaria de depositar mensalmente: R$");
		valor = teclado.nextDouble();
		do {
		System.out.println("\nSelecione uma op��o: \n1-Curto Prazo\n2-M�dio Prazo\n3-Longo Prazo");
		escolha3 = teclado.nextInt();
		
		switch(escolha3) {
		case 1:
			infoRendimento(3,6, 0.04);
			break;
		case 2:					
			infoRendimento(12,24, 0.04);
			break;
		case 3:
			infoRendimento(36,60, 0.04);
			break;
		default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
		}
		}while(escolha3 < 1 || escolha3 > 3);
	
	}
	
	/*public void subMenuPoupanca2(int escolha) {
		//Quero uma meta
		System.out.println("\n\t---Poupan�a---");
		System.out.println("\n\t---Quero uma Meta!---");
		System.out.println("\nDefina um valor que gostaria de alcan�ar: R$");
		valor = teclado.nextDouble();
	}*/
	
	/*public void menuPoupanca(int escolha) {
		System.out.println("\n\t---Poupan�a---");
		System.out.println("Selecione uma op��o abaixo: \n1-Fazer estimativa com o que tenho.\n2-Quero criar uma Meta!");
		escolha2 = teclado.nextInt();
		switch(escolha2) {
		case 1 :
				subMenuPoupanca1(escolha2);				
			break;
		case 2 : 
				
			break;
			default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
		}
	}*/
	
	/*public void menuRendaFixa(int escolha) {
		//Renda fixa
		System.out.println("\n\t---Renda fixa---");
		System.out.println("\nSelecione uma op��o abaixo: \n1-Fazer estimativa com o que tenho.\n2-Quero criar uma Meta!");
		escolha2 = teclado.nextInt();
		switch(escolha2) {
		case 1 :
			subMenuRendaFixa1(escolha2);
			break;
			
		case 2 :
			subMenuRendaFixa2(escolha2);
			break;			
			default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente."); 
		}		
	}*/
	
	public void subMenuRendaFixa1(int escolha) {
		System.out.println("\n\t---Renda fixa---");
		System.out.println("\nDigite o valor que gostaria de depositar mensalmente: R$");
		valor = teclado.nextDouble();
		do {
		System.out.println("\nSelecione uma op��o: \n1-Curto Prazo\n2-M�dio Prazo\n3-Longo Prazo");
		escolha3 = teclado.nextInt();
		
		switch(escolha3) {
		case 1:
			infoRendimento(3,6, 0.05);
			break;
		case 2:					
			infoRendimento(12,24, 0.05);
			break;
		case 3:
			infoRendimento(36,60, 0.05);
			break;
		default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
		}
		}while(escolha3 < 1 || escolha3 > 3);
	}
	
	public void subMenuRendaFixa2(int escolha) {
		//Quero uma meta
		System.out.println("\n\t---Renda fixa---");
		System.out.println("\nDefina um valor que gostaria de alcan�ar: R$");
		valor = teclado.nextDouble();
	}

	public void infoEstimativa(int v1, int v2) {
		//Estimativa Renda Variavel
		System.out.println("\n\t---Estimativa de Rendimento---");
		System.out.println("De acordo com o valor inserido, ser� cauculado 10% de acrecimo mensal em cima do valor base, com adicional da taxa variavel.");
		double valorB;		
		double valorF = valor;
				
		if(v1 == 3) {
			valorB = valorF + (valorF * 0.04);		
			for(int i = 0; i < (v1-1); i ++) {
				valorB = ((valorF + (valorF * 0.1)) + valorB);
				valorB = valorB + (valorB * 0.04);	
			}
			//total = (((valor + valor * 0.1) * (0.04)) * v1);
			System.out.printf("\nTerceiro m�s: R$%.2f", valorB);			
		}
		else if (v1 == 12) {
			valorB = valorF + (valorF * 0.06);		
			for(int i = 0; i < (v1-1); i ++) {
				valorB = ((valorF + (valorF * 0.1)) + valorB);
				valorB = valorB + (valorB * 0.06);	
			}
			//total = (((valor + valor * 0.1) * (0.06)) * v1);
			System.out.printf("\nUm ano: R$%.2f", valorB);			
		}
		else if (v1 == 36) {
			valorB = valorF + (valorF * 0.1);		
			for(int i = 0; i < (v1-1); i ++) {
				valorB = ((valorF + (valorF * 0.1)) + valorB);
				valorB = valorB + (valorB * 0.1);	
			}
			//total = (((valor + valor * 0.1) * (0.1)) * v1);
			System.out.printf("\nTr�s anos: R$%.2f", valorB);
		}
		
		if(v2 == 6) {
			valorB = valorF + (valorF * 0.05);		
			for(int i = 0; i < (v2-1); i ++) {
				valorB = ((valorF + (valorF * 0.1)) + valorB);
				valorB = valorB + (valorB * 0.05);	
			}
			//total = (((valor + valor * 0.1) * (0.05)) * v2);
			System.out.printf("\nSexto m�s: R$%.2f", valorB);
		}
		else if(v2 == 24) {		
			valorB = valorF + (valorF * 0.08);		
			for(int i = 0; i < (v2-1); i ++) {
				valorB = ((valorF + (valorF * 0.1)) + valorB);
				valorB = valorB + (valorB * 0.08);	
			}
			//total = (((valor + valor * 0.1) * (0.08)) * v2);
			System.out.printf("\nDois anos: R$%.2f", valorB);
		}
		else if(v2 == 60) {		
			valorB = valorF + (valorF * 0.12);		
			for(int i = 0; i < (v2-1); i ++) {
				valorB = ((valorF + (valorF * 0.1)) + valorB);
				valorB = valorB + (valorB * 0.12);	
			}
			//total = (((valor + valor * 0.1) * (0.12)) * v2);
			System.out.printf("\nCinco anos: R$%.2f", valorB);
		}
	}	
	
	public void subMenuRendaVariavel1(int escolha) {
		System.out.println("\n\t---Renda Variavel---");
		System.out.println("\nDigite o valor do investimento inicial: R$");
		valor = teclado.nextDouble();
		do {
		System.out.println("\nSelecione uma op��o: \n1-Curto Prazo\n2-M�dio Prazo\n3-Longo Prazo");
		escolha3 = teclado.nextInt();
		
		switch(escolha3) {
		case 1:
			infoEstimativa(3,6);
			break;
		case 2:					
			infoEstimativa(12,24);
			break;
		case 3:
			infoEstimativa(36,60);
			break;
		default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
		}
		}while(escolha3 < 1 || escolha3 > 3);
	}
	
	/*public void subMenuRendaVariavel2(int escolha) {
		//Quero uma meta
		System.out.println("\n\t---Renda Variavel---");
		System.out.println("\nDefina um valor que gostaria de alcan�ar: R$");
		valor = teclado.nextDouble();
	}*/
	
	/*public void menuRendaVariavel(int escolha) {
		//Renda Variavel
		System.out.println("\n\t---Renda Variavel---");
		System.out.println("Selecione uma op��o abaixo: \n1-Fazer estimativa com o que tenho.\n2-Quero criar uma Meta!");
		escolha2 = teclado.nextInt();
		switch(escolha2) {
		case 1 :
			subMenuRendaVariavel1(escolha2);					
			break;
			
		case 2 : 
			subMenuRendaVariavel2(escolha2);
			break;
		}
	}*/
	
	public void investPrincipal(int v) {
		System.out.println("\n\t--Menu de Escolha--");
		System.out.println("\n1-Poupan�a\n2-Renda fixa\n3-Renda vari�vel");
		escolha = teclado.nextInt();
		switch(escolha) {		
		case 1:
			subMenuPoupanca1(escolha);
			break;
		case 2 :
			subMenuRendaFixa1(escolha);
			break;
		case 3 :
			subMenuRendaVariavel1(escolha);				
			break;
				default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente.");
		}
	}
	
}