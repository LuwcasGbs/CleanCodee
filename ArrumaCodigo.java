package Aula0506;

import java.util.Scanner;

public class ArrumaCodigo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int fat = 1, num;                             //entrada de dados

		System.out.print("Informe o fatorial: ");
		num = ler.nextInt();


		if (num < 0) {
			System.out.println("Não existe fatorial de número negativo!");
		}

		if (num > 0) {                               //estrutura de decisão
			for (int i = 1 ; i <= num; i++) {       //estrutura de repetição
				fat *=i;
			}


			System.out.println("O fatorial de "+num+" é: "+fat);    //saída
			ler.close();
		}

	}

}
