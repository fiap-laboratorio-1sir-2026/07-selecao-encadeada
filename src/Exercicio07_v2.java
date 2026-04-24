import java.util.Scanner;

public class Exercicio07_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login, senha;

        System.out.print("Login --> ");
        login = sc.next();
        System.out.print("Senha --> ");
        senha = sc.next();

        if(login.equals("admin") && senha.equals("fiap2026")) {
            System.out.println("Acesso Liberado");
        }
        else if(login.equals("admin") && !senha.equals("fiap2026")) {

        }
    }
}
