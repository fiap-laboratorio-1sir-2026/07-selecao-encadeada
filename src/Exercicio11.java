import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double peso, frete;

        // entrada de dados
        System.out.print("Informe o peso do pacote em kg --> ");
        peso = sc.nextDouble();

        // processamento de dados
        if (peso <= 0) {
            frete = -1;
        }
        else if (peso <= 1) {
            frete = 10.00;
        }
        else if (peso <= 5) {
            frete = 18.00;
        }
        else if (peso <= 20) {
            frete = 35.00;
        }
        else {
            frete = 60.00;
        }

        // saida de dados
        if (frete == -1) {
            System.out.println("Erro: o peso deve ser maior que zero.");
        }
        else {
            System.out.printf("Peso informado: %.2f kg%n", peso);
            System.out.printf("Valor do frete: R$ %.2f%n", frete);
        }
    }
}
