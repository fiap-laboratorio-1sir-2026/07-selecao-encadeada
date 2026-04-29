import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        int categoria;
        double valorPedagio;
        String veiculo;

        // entrada de dados
        System.out.print("Informe a categoria do veiculo (1 a 5) --> ");
        categoria = sc.nextInt();

        // processamento de dados
        if (categoria == 1) {
            veiculo = "Moto";
            valorPedagio = 4.50;
        }
        else if (categoria == 2) {
            veiculo = "Carro";
            valorPedagio = 9.00;
        }
        else if (categoria == 3) {
            veiculo = "Carro com reboque";
            valorPedagio = 13.50;
        }
        else if (categoria == 4) {
            veiculo = "Caminhão 2 eixos";
            valorPedagio = 18.00;
        }
        else if (categoria == 5) {
            veiculo = "Caminhão 3+ eixos";
            valorPedagio = 27.00;
        }
        else {
            veiculo = "";
            valorPedagio = 0;
        }

        // saida de dados
        if (categoria < 1 || categoria > 5) {
            System.out.println("Categoria inválida.");
        }
        else {
            System.out.printf("Categoria: %d%n", categoria);
            System.out.printf("Veículo: %s%n", veiculo);
            System.out.printf("Valor do pedágio: R$ %.2f%n", valorPedagio);
        }
    }
}
