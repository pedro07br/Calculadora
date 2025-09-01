import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int opcao = -1;
        Scanner scanner = new Scanner(System.in);

        while (opcao != 0) {
            System.out.println("Calculadora simples (0 para sair): ");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.print("Escolha a operação: ");
            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo da calculadora...");
                break; // encerra o loop
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            if (opcao == 1) {
                System.out.println("Resultado: " + (num1 + num2));
            } else if (opcao == 2) {
                System.out.println("Resultado: " + (num1 - num2));
            } else if (opcao == 3) {
                System.out.println("Resultado: " + (num1 * num2));
            } else if (opcao == 4) {
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
            } else {
                System.out.println("Operação inválida.");
            }
        }

        scanner.close();
        System.err.println("Fim do codigo");
    }
}
