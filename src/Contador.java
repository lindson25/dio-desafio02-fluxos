import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int number1 = scan.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int number2 = scan.nextInt();

        try {
            contar(number1, number2);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        scan.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int number = 1; number <= contagem; number++) {
            System.out.println(number);
        }
    }
}
