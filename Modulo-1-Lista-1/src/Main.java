import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in); // Scanner único

    public static void main(String[] args) {
        int opcao;
        boolean continuar = true;

        while(continuar){
            do {
                System.out.println("\n### Lista de Exercícios 1 ###\n" +
                        "Escolha qual programa quer executar:\n" +
                        "1 - Escreva nome e ano de nascimento, retorna frase.\n" +
                        "2 - Entra com o tamanho do lado de um quadrado, calcula e retorna area.\n" +
                        "3 - Entre com base e altura de um triangulo, calcula e retorna area.\n" +
                        "4 - Receba nome e idade de duas pessoas, calcula e retorna diferenca das idades.\n" +
                        "0 - Sair."
                );

                System.out.print("Opcao Escolhida: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                if(opcao < 0 || opcao > 4)
                {
                    System.out.println("Opcao Invalida. Tente Novamente.\n");
                }

            } while(opcao < 0 || opcao > 4);

            switch(opcao){
                case 1 -> Ex1();
                case 2 -> Ex2();
                case 3 -> Ex3();
                case 4 -> Ex4();
                case 0 -> continuar = false;
            }
        }

        System.out.println("Programa Encerrado.");
        scanner.close();
    }

    public static void Ex1()
    {
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o seu ano de nascimento: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        int idade = 2025 - ano;

        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
    }

    public static void Ex2()
    {
        System.out.print("Digite o tamanho do lado de um quadrado: ");
        double lado = scanner.nextDouble();
        scanner.nextLine();
        double area = lado * lado;

        System.out.println("O quadrado em questao tem uma area de tamanho: " + area);
    }

    public static void Ex3()
    {
        double altura, base, area;

        System.out.print("Entre com a altura do triangulo: ");
        altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Entre com a base do triangulo: ");
        base = scanner.nextDouble();
        scanner.nextLine();

        area = (base * altura)/2;

        System.out.println("Um triangulo de base " + base +
                " e altura " + altura +
                " tem uma area total de: " + area);
    }

    public static void Ex4()
    {
        String nome1, nome2;
        int idade1, idade2;

        System.out.print("Entre com o nome da pessoa 1: ");
        nome1 = scanner.nextLine();
        System.out.print("Entre com a idade da pessoa 1: ");
        idade1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Entre com o nome da pessoa 2: ");
        nome2 = scanner.nextLine();
        System.out.print("Entre com a idade da pessoa 2: ");
        idade2 = scanner.nextInt();
        scanner.nextLine();


        if(idade1 > idade2) System.out.println(nome1 + " eh " + (idade1-idade2) + " mais velho(a) que " + nome2);
        else if (idade2 > idade1) System.out.println(nome2 + " eh " + (idade2-idade1) + " mais velho(a) que " + nome1);
        else System.out.println(nome1 + " tem a mesma idade que " + nome2);
    }
}