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
			//break;
		case 2:
			//ir para op��o aprender a organizar finan�as;
			//break;
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
