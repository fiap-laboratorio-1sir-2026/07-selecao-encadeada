import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        String cargo;
        int tempo;
        double salarioAtual, percentual, aumento, novoSalario;

        // entrada de dados
        System.out.print("Informe o cargo (Gerente, Engenheiro, Tecnico) --> ");
        cargo = sc.nextLine().trim();

        System.out.print("Informe o tempo de serviço em anos --> ");
        tempo = sc.nextInt();

        System.out.print("Informe o salário atual --> R$ ");
        salarioAtual = sc.nextDouble();

        // processamento de dados
        if (cargo.equalsIgnoreCase("Gerente")) {
            if (tempo >= 5) {
                percentual = 0.10;
            }
            else if (tempo >= 3) {
                percentual = 0.09;
            }
            else {
                percentual = 0.08;
            }
        }
        else if (cargo.equalsIgnoreCase("Engenheiro")) {
            if (tempo >= 5) {
                percentual = 0.11;
            }
            else if (tempo >= 3) {
                percentual = 0.10;
            }
            else {
                percentual = 0.09;
            }
        }
        else if (cargo.equalsIgnoreCase("Tecnico")) {
            if (tempo >= 5) {
                percentual = 0.12;
            }
            else if (tempo >= 3) {
                percentual = 0.11;
            }
            else {
                percentual = 0.10;
            }
        }
        else {
            percentual = 0.05;
        }

        aumento = salarioAtual * percentual;
        novoSalario = salarioAtual + aumento;

        // saida de dados
        System.out.printf("Salário anterior: R$ %.2f%n", salarioAtual);
        System.out.printf("Novo salário    : R$ %.2f%n", novoSalario);
        System.out.printf("Diferença       : R$ %.2f%n", aumento);
    }
}
