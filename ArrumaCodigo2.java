package Aula0506;

import java.util.Scanner;

public class ArrumaCodigo2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);      //Iniciar classe Scanner 

		double valor;                              //Variáveis

		System.out.print("Informe um valor: ");  //entrada de dados
		valor = ler.nextDouble();

		if (valor % 5 == 0) {                      //Estrutura de decisão
			System.out.println("O número " +valor+ " é múltiplo de 5");
		}

		if (valor % 5 != 0) {                      //saída
			System.out.println("O número "+valor+ " não é múltiplo de 5");
			ler.close();
		}

	}

}
