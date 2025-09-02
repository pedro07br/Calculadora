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
            System.out.println("5. Potência");
            System.out.println("6. Raiz Quadrada");
            System.out.println("7. Logaritmo");
            System.out.println("8. Fatorial");
            System.out.print("Escolha a operação: ");
            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo da calculadora...");
                break;
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
            } else if (opcao ==5) {
                double resultado = Math.pow(num1, num2);
                System.out.println("O resultado de " + num1 + " elevado a " + num2 + " é: " + resultado);

            } else if (opcao == 6) {
                if (num1 >= 0 && num2 >= 0) {
                double resultado = Math.sqrt(num1);
                double resultado2 = Math.sqrt(num2);
                System.out.println("A raiz quadrada de " + num1 + " é: " + resultado);
                System.out.println("A raiz quadrada de " + num2 + " é: " + resultado2);
                } else {
                System.out.println("Não é possível calcular a raiz quadrada de um número negativo.");
                }
            } else if (opcao == 7) {
                if (num1 > 0 && num2 > 0) {
                    double resultado = Math.log10(num1);
                    double resultado2 = Math.log10(num2);
                    System.out.println("O logaritmo de " + num1 + " na base 10 é: " + resultado);
                    System.out.println("O logaritmo de " + num2 + " na base 10 é: " + resultado2);
                } else {
                    System.out.println("O logaritmando deve ser um número positivo.");
                }
            
            } else if (opcao == 8) {
                if (num1 >= 0 && num2 >= 0) {
                    long fatorial = 1;
                    for (int i = 1; i <= num1; i++) {
                        fatorial *= i;
                    }
                    long fatorial2 = 1;
                    for (int i = 1; i <= num2; i++) {
                        fatorial2 *= i;
                    }
                    System.out.println("O fatorial de " + num1 + " é: " + fatorial);
                    System.out.println("O fatorial de " + num2 + " é: " + fatorial2);
                } else {
                    System.out.println("Não é possível calcular o fatorial de um número negativo.");
                }
            } else {
                System.out.println("Operação inválida.");
            }
        }

        scanner.close();
        System.err.println("Fim do codigo!");
    }
}
