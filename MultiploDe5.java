package aula16;

import java.util.Scanner;

public class MultiploDe5 {

	public static void main(String[] args) {
	int numero;
	Scanner scanner = new Scanner(System.in);
	System.out.print("Informe um valor: ");
	numero=scanner.nextInt();
	scanner.close();
	System.out.print((numero%5==0) ? "O número " + numero + " é multiplo de 5": "O número " + numero + "não é multiplo de 5");
	
		}
	}