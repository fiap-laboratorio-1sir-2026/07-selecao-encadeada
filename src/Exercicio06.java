import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String turno;

        System.out.print("Qual o turno? ");
        turno = sc.next();

        if(turno.equals("manha")) {
            System.out.println("7h às 12h");
        }
        else if(turno.equals("tarde")) {
            System.out.println("13h às 18h");
        }
        else if(turno.equals("noite")) {
            System.out.println("19h às 23h");
        }
        else {
            System.out.println("turno inválido");
        }


    }
}
