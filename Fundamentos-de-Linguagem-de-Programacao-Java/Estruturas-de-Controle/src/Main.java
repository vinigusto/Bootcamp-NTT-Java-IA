import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao;
		boolean sair = false;

		System.out.println("\n### LISTA 2 ###");

		do{
			System.out.print("Escolha o programa para executar: \n");
			System.out.print("1 - Tabuada 1 a 10.\n" +
					"2 - Cálculo e classificação do IMC\n" +
					"3 - Pares/ímpares em intervalo decrescente\n" +
					"4 - Números até condição de resto ≠ 0\n" +
					"0 - Sair\n");
			System.out.print("Digite uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao){
				case 1 -> Ex1();
				case 2 -> Ex2();
				case 3 -> Ex3();
				case 4 -> Ex4();
				case 0 -> sair = true;
			}

			if(opcao < 0 || opcao > 4) System.out.println("ENTRADA INVÁLIDA. Tente novamente.");

		}while(!sair);

		System.out.printf("\nObrigado!");
		scanner.close();
	}

	public static void Ex1(){
		int numero;
		System.out.print("Entre com um número inteiro para fazermos a tabuada: ");
		numero = scanner.nextInt();

		System.out.println("\n### TABUADA DO " + numero + " ###");
		for(int i = 0; i <= 10; i++){
			System.out.printf("%d * %d = %d\n",
					numero,
					i,
					numero*i);
		}
		scanner.nextLine();
	}

	public static void Ex2(){
		System.out.println("\n### CALCULADORA DE IMC ###");
		System.out.print("Entre com sua altura em metros: ");
		double altura = scanner.nextDouble();

		System.out.print("Entre com seu peso em quilos: ");
		double peso = scanner.nextDouble();
		double IMC = (peso / (altura*altura));

		String categoria;
		if(IMC <= 18.5) categoria = "Abaixo do peso";
		else if (IMC > 18.5 && IMC <= 24.9) categoria = "Peso ideal";
		else if (IMC >= 25 && IMC <= 29.9) categoria = "Levemente acima do peso";
		else if (IMC >= 30 && IMC <= 34.9) categoria = "Obesidade Grau I";
		else if (IMC >= 35 && IMC <= 39.9) categoria = "Obesidade Grau II (Severa)";
		else categoria =  "Obesidade III (Mórbida)";

		System.out.printf("O seu IMC é %.02f: %s.\n", IMC, categoria);

	}

	public static void Ex3(){
		System.out.print("Entre com o primeiro número do intervalo: ");
		var menor = scanner.nextInt();
		System.out.print("Entre com o segundo número do intervalo: ");
		var maior = scanner.nextInt();

		int escolha;
		do{
			System.out.print("Deseja encontrar os pares (0) ou ímpares (1)? ");
			escolha = scanner.nextInt();
			if(escolha < 0 || escolha > 1) System.out.println("ENTRADA INVÁLIDA. Tente Novamente.");
		} while(escolha < 0 || escolha > 1);

		String str = escolha == 0 ? "pares" : "ímpares";

		System.out.printf("\nEncontrando os números %s entre %d e %d: ", str, menor, maior);
		for(int i = menor; i <= maior; i++){
			if(escolha == 0) { //pular impares
				if(i % 2 == 0) System.out.print(i + " ");
			} else {
				if(i % 2 != 0) System.out.print(i + " ");
			}
		}
	}

	public static void Ex4(){
		int divisor, resto, numerador;

		System.out.print("\nDigite o divisor: ");
		divisor = scanner.nextInt();
		do{
			System.out.print("Digite o numerador: ");
			numerador = scanner.nextInt();
			resto = numerador % divisor;

			System.out.printf("Dividindo %d por %d temos um resto: %d\n\n", numerador, divisor, resto);

		} while(resto != 0);

		System.out.println("Resto igual a zero, encerrando programa.\n");
	}
}