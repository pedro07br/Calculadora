import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int x = -1;
        Scanner scanner = new Scanner(System.in);

        while (x != 0) {
            System.out.println("Calculadora simples (0 to exit): ");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            x = scanner.nextInt();

            switch (x) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextInt();
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
        }
    }
}