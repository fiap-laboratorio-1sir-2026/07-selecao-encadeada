import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double peso, altura, imc;
        String classificacao;

        // entrada de dados
        System.out.print("Informe o peso em kg --> ");
        peso = sc.nextDouble();
        System.out.print("Informe a altura em metros --> ");
        altura = sc.nextDouble();

        // processamento de dados
        imc = peso / (altura * altura);
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        }
        else if (imc < 25.0) {
            classificacao = "Peso normal";
        }
        else if (imc < 30.0) {
            classificacao = "Sobrepeso";
        }
        else if (imc < 40.0) {
            classificacao = "Obesidade";
        }
        else {
            classificacao = "Obesidade grave";
        }

        // saida de dados
        System.out.printf("IMC: %.2f%n", imc);
        System.out.printf("Classificação: %s%n", classificacao);
    }
}
