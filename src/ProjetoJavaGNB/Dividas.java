package ProjetoJavaGNB;

import java.util.Scanner;

public class Dividas {
	
	private double valorDiv;
	private double sal;
	
	public Dividas(double valorDiv,double sal)
	{
		this.valorDiv = valorDiv;
		this.sal =sal;
	}
	Scanner leia = new Scanner(System.in);
	String resposta;
	
	public void getValorDiv() {
		System.out.println("Por favor, informe o valor de sua d�vida");
		valorDiv=leia.nextDouble();		
	}
	
	public void setValorDiv(double valorDiv) {
		this.valorDiv = valorDiv;
	}
	
	public void getSal() {
		getValorDiv();
		System.out.println("Por favor, informe seu sal�rio");
		double sala=leia.nextDouble();
		System.out.println("Por favor, informe quanto voc� pode direcionar por m�s \npara isto de no maximo 30% do seu sal�rio total:");
		double por =leia.nextDouble();
		double porl = sala * 0.3;
		if (por>porl)
		{	
			int resp;
			System.out.println("Voc� inseruiu um valor maior do que 30% \ntem certeza dessas descis�o? \nAperte 1 para sim e 2 para n�o");
			resp= leia.nextInt();			
			
			if(resp == 2) 
			{				
				System.out.println("Por favor, digite outra quantidade de seu sal�rio direcionada para quitar a d�vida");
				por =leia.nextDouble();				
			}
			
		}
		double x = valorDiv/por;
		System.out.printf("%.0f meses.",x);
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
