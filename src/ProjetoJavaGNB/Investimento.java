package ProjetoJavaGNB;

import java.util.Scanner;

public class Investimento {
	
	public static void main(String[] args) {
		int escolha, escolha2, escolha3;
		double valor;
		InvestClass classe = new InvestClass();
		Scanner teclado = new Scanner(System.in);
		System.out.println("\n\t--Menu de Escolha--");
		System.out.println("\n1-Colch�o\n2-Poupan�a\n3-Renda fixa\n4-Renda vari�vel");
		escolha = teclado.nextInt();
		switch(escolha) {
		
		case 1:
						
			break;				
		case 2:
			classe.menuPoupanca(escolha);
			break;
		case 3 :
			classe.menuRendaFixa(escolha);
			break;
		case 4 :
			classe.menuRendaVariavel(escolha);				
			break;
				default: System.out.println("\nOps! Algo deu errado!\nPor favor tente novamente."); 
			}			
		}	
}
