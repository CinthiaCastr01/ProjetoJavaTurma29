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
	public double getValorDiv() {
		System.out.println("Por favor, informe o valor de sua d�vida");
		valorDiv=leia.nextDouble();
		
		return valorDiv;
	}
	public void setValorDiv(double valorDiv) {
		this.valorDiv = valorDiv;
	}
	public double getSal() {
		System.out.println("Por favor, informe seu sal�rio");
		sal=leia.nextDouble();
		System.out.println("Por favor, informe quanto voc� pode direcionar por m�s para isto:");
		double por =leia.nextDouble();
		double porl=sal *(30/100);
		if (porl<por)
		{
			do
			{
		System.out.println("Voc� tem certeza que deseja direcionar todo este valor para quitar a d�vida?");
		 resposta=leia.nextLine();
			}
			while(resposta!="sim");
			do
			{
			System.out.println("Por favor, digite outra quantidade de seu sal�rio direcionada para quitar a d�vida");
			por =leia.nextDouble();
			}
			while(porl<=por);
			
			
		}
		double x = valorDiv/por;
		System.out.println(x +" meses");
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
