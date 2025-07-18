import java.util.Scanner;
import java.util.Locale;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao;
		boolean sair = false;

		System.out.println("\n### DESAFIOS ###");

		do{
			System.out.print("Escolha o programa para executar: \n");
			System.out.print("1 - Controle de Acesso Inteligente.\n" +
					"2 - Controle de Gastos Diários em um E-commerce\n" +
					"0 - Sair\n");
			System.out.print("Digite uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao){
				case 1 -> Ex1();
				case 2 -> Ex2();
				case 0 -> sair = true;
			}

			if(opcao < 0 || opcao > 2) System.out.println("ENTRADA INVÁLIDA. Tente novamente.");

		}while(!sair);

		System.out.printf("\nObrigado!");
		scanner.close();
	}

	public static void Ex1(){
		// Entrada de dados do usuário
		System.out.println("\n### SISTEMA DE ACESSO INTELIGENTE ###");
		System.out.print("Usuario tem permissao (true/false)? ");
		boolean hasPermission = scanner.nextBoolean(); // Lê um valor booleano (true ou false)

		System.out.print("Qual a idade do usuario? ");
		int age = scanner.nextInt(); // Lê a idade como inteiro

		// TODO: Verifique condições de acesso
		if(!hasPermission)
		{
			System.out.println("Acesso negado\n");
		}
		else if(age < 18)
		{
			System.out.println("Idade insuficiente\n");
		}
		else
		{
			System.out.println("Acesso permitido\n");
		}
	}

	public static void Ex2(){
		scanner.useLocale(Locale.US);
		System.out.print("Quantas compras foram feitas no dia: ");
		int purchaseCount = scanner.nextInt();

		if (purchaseCount == 0) {
			System.out.println("Nenhuma compra registrada.");
		} else {
			double totalSpent = 0.0;
			double averageSpent = 0.0;
			double purchaseValue = 0.0;

			// TODO: Leia os valores das compras e calcule a média
			for(int i = 0; i < purchaseCount; i++)
			{
				System.out.printf("Entre o valor da compra %d: ", i+1);
				purchaseValue = scanner.nextDouble();
				totalSpent += purchaseValue;
			}
			averageSpent = totalSpent/purchaseCount;

			System.out.printf("\nTotal Gasto: %.2f%n", totalSpent);
			System.out.printf("Média de Gastos: %.2f%n\n", averageSpent); // TODO: Imprima a média
		}
	}

}