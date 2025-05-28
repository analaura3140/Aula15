package aula16;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		int senhaOficial,senhaTentativa, soma;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma senha para ser cadastrada(somente números): ");
		senhaOficial=ler.nextInt();
        System.out.print("Digite um número: ");
        int numero1=ler.nextInt();
        System.out.print("Digite um número: ");
        int numero2=ler.nextInt();
        soma = numero1 + numero2;
		System.out.print("Digite a senha para ver o resultado da soma: ");
		senhaTentativa=ler.nextInt();
		ler.close();
		System.out.print((senhaTentativa==senhaOficial)?"O resultado da soma é: " + soma : "Erro! Seha incorreta");
	}

}
