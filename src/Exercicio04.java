import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2, valor3;

        System.out.println("Digite 3 valores: ");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        valor3 = sc.nextInt();

        if(valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
            if(valor1 < valor2 && valor1 < valor3) {
                System.out.println("menor = " + valor1);
            }
            else if(valor2 < valor3) {
                System.out.println("menor = " + valor2);
            }
            else {
                System.out.println("menor " + valor3);
            }
        }
        else {
            System.out.println("os valores devem ser diferentes");
        }

    }
}
