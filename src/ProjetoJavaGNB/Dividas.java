package ProjetoJavaGNB;

import java.util.Scanner;

public class Dividas {
	
	private double valorDiv;
	private double sal;
	
	/*public Dividas(double valorDiv,double sal)
	{
		this.valorDiv = valorDiv;
		this.sal =sal;
	}*/
	Scanner leia = new Scanner(System.in);
	String resposta;
	
	public void getValorDiv() {
		System.out.println("Por favor, informe o valor de sua d�vida: R$");
		valorDiv=leia.nextDouble();		
	}
	
	public void setValorDiv(double valorDiv) {
		this.valorDiv = valorDiv;
	}
	
	public void getSal() {
		getValorDiv();
		System.out.println("Por favor, informe seu sal�rio: R$");
		double sala=leia.nextDouble();
		
		System.out.println("Por favor, informe quanto voc� pode direcionar por m�s, onde seja no maximo 30% do seu sal�rio total:");
		double por =leia.nextDouble();
		
		double porl = sala * 0.3;
		if (por>porl)
		{
			int resp;
			System.out.println("Voc� inseriu um valor maior do que 30% do seu sal�rio! Tem certeza dessas descis�o? \n1- Sim\n2- N�o");
			resp= leia.nextInt();
			
			if(resp == 2) 
			{
				System.out.println("Por favor, digite uma nova quantidade de seu sal�rio para quitar a d�vida: R$");
				por =leia.nextDouble();
			}
			
		}
		double y;
		 double x =valorDiv/por;
		x=(int) x;
		if (valorDiv % por == 0) {
			y =((x) *por)-valorDiv;
		}else {
			y =((x+1) *por)-valorDiv;
		}
		//System.out.println(y);
		if (y==0)
		{
		System.out.print("Para quitar sua divida de R$"+valorDiv +" sera necessario juntar o valor de R$"+por+" por ");
		System.out.printf("%.0f meses.",x);
		}
		else if(y>0.0) 
		{
			System.out.print("Para quitar sua divida de R$"+valorDiv +" sera necessario juntar o valor de R$"+por+" por ");
			System.out.printf("%.0f meses.",x++);
			System.out.println("E ainda te sobra R$"+y);
		}
			
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
