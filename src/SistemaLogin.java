import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String LOGIN_CORRETO = "java8";
        final String SENHA_CORRETA = "java8";
        final int MAX_TENTATIVAS = 3;

        System.out.println("--- Sistema de Login ---");

        for (int tentativa = 1; tentativa <= MAX_TENTATIVAS; tentativa++) {
            System.out.print("Login: ");
            String login = scanner.nextLine();

            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            if (login.equals(LOGIN_CORRETO) && senha.equals(SENHA_CORRETA)) {
                System.out.println("\nAcesso permitido. Bem-vindo ao sistema!");
                break;
            } else {
                System.out.printf("Login ou senha incorretos. Você tem mais %d tentativa(s).\n\n", MAX_TENTATIVAS - tentativa);
                if (tentativa == MAX_TENTATIVAS) {
                    System.out.println("Número máximo de tentativas excedido. Acesso bloqueado.");
                }
            }
        }
        scanner.close();
    }
}
