import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao;
        int num1;
        int num2;
        float resultado;

        System.out.println("Seja bem vindo à nossa calculadra");
        System.out.println("escolha a operação");

        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        operacao = scanner.nextInt();
        System.out.println("Digite o primeiro número");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número");
        num2 = scanner.nextInt();
        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("O resultado da adição é: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("O resultado da divisão é: " + resultado);
                } else {
                    System.out.println("Não é possível dividir um número por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida");


        }
    }
}
