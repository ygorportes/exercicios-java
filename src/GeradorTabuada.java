import java.util.Scanner;

public class GeradorTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Gerador de Tabuada ---");
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();

        System.out.printf("\n--- Tabuada do %d ---\n", numero);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, (numero * i));
        }

        scanner.close();
    }
}
