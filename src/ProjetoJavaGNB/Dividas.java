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
		System.out.println("Por favor, informe quanto voc� pode direcionar por m�s para isto:");
		double por =leia.nextDouble();
		double porl = sala * 0.3;
		if (por>porl)
		{	
			int resp;
					
			System.out.println("Voc� tem certeza que deseja direcionar todo este valor para quitar a d�vida?");
			resp = leia.nextInt();			
			
			if(resposta == "n�o") {				
				System.out.println("Por favor, digite outra quantidade de seu sal�rio direcionada para quitar a d�vida");
				por =leia.nextDouble();				
			}else {
				double x = valorDiv/por;
				System.out.printf("%.0f meses.",x);
			}
		}else {
			double x = valorDiv/por;
			System.out.printf("%.0f meses.",x);
		}
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
