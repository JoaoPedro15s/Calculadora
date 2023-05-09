package calculos;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double numero1, numero2, imprimeSoma,imprimeSubtraçao,imprimeMultiplicacao,imprimeDivisao;
		
		System.out.println("Digite o primeiro número:");
		numero1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número:");
		numero2 = entrada.nextDouble();
		
		//SOMA
		  
		 
		Somar resultClassSoma = new Somar();
		
		imprimeSoma = resultClassSoma.setSoma(numero1,numero2);
		
	    System.out.printf("A soma de %s + %s = %s\n",numero1,numero2,imprimeSoma);
	    
	    //Subtração
	    
	    Subtrair resultClassSubtrair = new Subtrair();
	    
	    imprimeSubtraçao = resultClassSoma.setSoma(numero1,numero2);
	    
	    System.out.printf("A subtração de %s - %s = %s\n",numero1,numero2,imprimeSubtraçao);
		
	    //multiplicação
	    
	    Multiplicar resultClassMultiplicar = new Multiplicar();
	    
	    imprimeMultiplicacao = resultClassMultiplicar.setMultiplicar(numero1,numero2);
	    
	    System.out.printf("A multiplicação de %s x %s = %s\n",numero1,numero2,imprimeMultiplicacao);
	    
	    //Divisão
          
	    Dividir resultClassDividir = new Dividir();
	    
	    imprimeDivisao = resultClassDividir.setDividir(numero1,numero2);
	    
	    System.out.printf("A divisão de %s / %s = %s\n",numero1,numero2,imprimeDivisao);
	  

	}

}
