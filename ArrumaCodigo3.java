package Aula0506;

import java.util.Scanner;

public class ArrumaCodigo3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

			//variáveis
		double n1,n2,soma;
		int senhaMestre,senhaTentativa;
		
			//senha
		System.out.print("Cadastre uma senha (apenas números):");
		senhaMestre = ler.nextInt();

			//Soma
		System.out.print("Digite um número: ");
		n1 = ler.nextDouble();
		System.out.print("Digite outro número: ");
		n2 = ler.nextDouble();

		soma = n1+n2;
		
			//saída
		System.out.println("Digite sua senha para desbloquear a soma: ");
		senhaTentativa = ler.nextInt();
		
			//estrutura de decisão
		if (senhaTentativa == senhaMestre) {
			System.out.println("A soma é "+soma);
		}
		if (senhaTentativa != senhaMestre) {
			System.out.println("Erro! Senha errada!");
			ler.close();
		}
	}

}
