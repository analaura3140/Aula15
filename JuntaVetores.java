package aula16;

import java.util.Scanner;

public class JuntaVetores {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int vetor1[] = new int[2];
		for (int indice =0; indice<2; indice++) {
			System.out.print("Digite o valor do indice " + indice + " para o vetor 1: ");
			vetor1[indice]=scanner.nextInt();
		}
		int vetor2[] = new int[2];
		for (int indice = 0; indice<2; indice++) {
			System.out.print("Digite o valor do indice " + indice + " para o vetor 2: ");
			vetor2[indice]=scanner.nextInt();
		}
		scanner.close();
	int vetor3[] = new int[4];
		//vetor3[4]= vetor1[2]+vetor2[2];
		//System.out.println("O valor do ínce total é: " + vetor3[4]);
		for(int i=0; i<2; i++) {
			vetor3[i] = vetor1[i];
			vetor3[i+2] = vetor2[i];
		}
		for(int i=0; i<4; i++) {
System.out.println("O valor do vetor 3 é: " + vetor3[i]);	
}
	}
}
