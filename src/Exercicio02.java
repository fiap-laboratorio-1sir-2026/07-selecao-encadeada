import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaria;
        double conta, taxa;

        System.out.print("Total de diárias --> ");
        diaria = sc.nextInt();

        if(diaria > 15) {
            taxa = 15.50;
        }
        else if(diaria == 15) {
            taxa = 36;
        }
        else {
            taxa = 58;
        }

        conta = diaria * (250 + taxa);
        System.out.println("Conta --> R$ " + conta);

    }

}
