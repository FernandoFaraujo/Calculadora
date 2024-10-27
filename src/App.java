import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtração");
        System.out.println("[3] Divisão");
        System.out.println("[4] Multiplicação");

        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o primeiro valor: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double num2 = scanner.nextDouble();

        switch (opcao) {
        case 1:
            System.out.println("Resultado: " + somar(num1, num2));
            break;
        case 2:
            System.out.println("Resultado: " + subtrair(num1, num2));
            break;
        case 3:
            System.out.println("Resultado: " + dividir(num1, num2));
            break;
        case 4:
            System.out.println("Resultado: " + multiplicar(num1, num2));
            break;
        default:
            System.out.println("Opção inválida");
        }
    }

    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 != 0){
            return num1 / num2;   
        } else {
            System.out.println("Erro!: Divisão por zero incalculável");
                return 0;
        }
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
}