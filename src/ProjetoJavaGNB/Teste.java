package ProjetoJavaGNB;

public class Teste {

	public static void main(String[] args) {

		//Teste do menu
		System.out.println("Bem-vindo!");
		System.out.println("\nDe agora em diante voc� vai ter nossa ajuda para cuidar das suas finan�as!");
		System.out.println("Por favor, selecione uma op��o no menu: ");
		System.out.println("\n1 para quitar d�vidas");
		System.out.println("2 para aprender a organizar suas finan�as");
		System.out.println("3 para juntar dinheiro");
		System.out.println("0 para encerrar o programa");
		
		//fazendo as op��es do usu�rio
		
		//aqui vai ser necess�rio adicionar uma leitura de op��o
		//op��o = escolha (do usu�rio de acordo com menu)
		switch(escolha) //escolha entre 0,1,2 e 3
		{
		case 1:
			//ir para op��o quitar dividas;
			//aqui fica a parte da branch dividas
			
			System.out.println("Por favor, informe o valor de sua d�vida");
			//ler o valor da d�vida
			System.out.println("Por favor, informe seu sal�rio");
			//ler sal�rio
			System.out.println("Por favor, informe quanto (em %) voc� pode direcionar por m�s para isto:");
			//ler % do sal�rio
			//caso ultrapasse 30% do sal�rio:
			System.out.println("Voc� tem certeza que deseja direcionar todo este valor para quitar a d�vida?");
			//ler resposta
			if(resposta==n�o)
			{
				System.out.println("Por favor, digite outra quantidade de seu sal�rio direcionada para quitar a d�vida");
				//ler nova quantidade
			}

			//aqui pode ter uma op��o que compara o valor da d�vida com o quanto o usu�rio pode direcionar e estimar o prazo.
			
			System.out.println("Voc� estar� direcionando esta quantidade por m�s e quitar� sua d�vida em tantos meses!");
			
			//fim da op��o de quitar d�vidas.
			
			//break;
		case 2:
			//ir para op��o aprender a organizar finan�as;
			
			/*System.out.println("Ol�! Vamos come�ar com seu processo de educa��o financeira!");
			System.out.println("Por favor, nos diga seu sal�rio:");
			//ler sal�rio
			System.out.println("Por favor, nos diga quanto voc� gasta com despesas b�sicas (�gua, luz, telefone e etc):");
			//ler gastos b�sicos
			System.out.println("Por favor, nos diga quanto voc� gasta com compras no mercado:");
			//ler gastos mercado
			System.out.println("Por favor, nos diga o quanto voc� gasta com lazer: ");
			//ler gastos lazer
			System.out.println("Por favor, nos diga o quanto voc� gasta com transporte: ");
			//ler gastos transporte
			
			//totagastos = salario - gastos b�sicos - gastos mercado - gastos lazer - gastos transporte
			
			if(totalgastos<salario)
			{
				System.out.println("Voc� consegue economizar uma quantia por m�s! Gostaria de ir para o menu de juntar dinheiro?");
				//ler op��o sim ou n�o
				if(op��o==sim)
				{
					//ir para menu de juntar dinheiro
					//case 3
				}
				else if(op��o==n�o)
				{
					System.out.println("Tudo bem, mas continue com a rotina de anotar seus gastos para ter o h�bito de acompanhar suas finan�as! Bom trabalho!");
				}
			}
			else if (totalgastos>sal�rio)
			{
				System.out.println("Voc� corre o risco de ter d�vidas! Gostaria de ir para o menu de controle de d�vidas?");
				//ler op��o sim ou n�o
				if(op��o==sim)
				{
					//ir para menu de controle de d�vidas
					//case 1
				}
				else if(op��o==n�o)
				{
					System.out.println("Tudo bem, mas continue com a rotina de anotar seus gastos para ter o h�bito de acompanhar suas finan�as! Bom trabalho!");
				}
				
			}
			else
			{
				System.out.println("Voc� controla bem seus gastos! Caso deseje um resultado ainda melhor, v� para a op��o de juntar dinheiro!");
			}
			//break;*/
		case 3:
			//ir para op��o juntar dinheiro;
			
			//break;
		case 0:
			System.out.println("Voc� encerrou o programa, at� mais!");
			//break;
		default:
			System.out.println("Por favor, digite uma op��o v�liida: ");	
			System.out.println("Por favor, selecione uma op��o no menu: ");
			System.out.println("\n1 para quitar d�vidas");
			System.out.println("2 para aprender a organizar suas finan�as");
			System.out.println("3 para juntar dinheiro");
			System.out.println("0 para encerrar o programa");
		}
		
	}

}
