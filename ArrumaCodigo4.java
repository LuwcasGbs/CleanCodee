package Aula0506;

import java.util.Scanner;

public class ArrumaCodigo4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int a[] = new int [2];
		int b[] = new int [2];
		int c[] = new int [4];

		
		for(int i=0; i<2; i++) {
			System.out.print("Informe o "+i+"º valor.. (Vetor A)");
			a[i] = ler.nextInt();

			System.out.print("Informe o "+i+"º valor.. (Vetor B)");
			b[i] = ler.nextInt();
		}
		for(int i=0; i<2; i++) {
			c[i] = a[i];
			c[i+2] = b[i];
		}

		System.out.println("Vetor C");
		for(int i=0; i<4; i++) {
			System.out.println("Informe o "+i+"º valor.. "+c[i]);
		}
		ler.close();

	}

}
