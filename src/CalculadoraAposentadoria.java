import java.util.Scanner;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Calculadora de Aposentadoria ---");

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        char sexo;
        do {
            System.out.print("Digite seu sexo (M para Masculino, F para Feminino): ");
            sexo = scanner.next().toUpperCase().charAt(0);
            if (sexo != 'M' && sexo != 'F') {
                System.out.println("Entrada inválida. Por favor, digite M ou F.");
            }
        } while (sexo != 'M' && sexo != 'F');

        System.out.print("Digite seus anos de contribuição: ");
        int anosContribuicao = scanner.nextInt();

        final int IDADE_MIN_M = 65;
        final int CONTRIB_MIN_M = 35;
        final int IDADE_MIN_F = 62;
        final int CONTRIB_MIN_F = 30;

        boolean podeAposentar = false;

        if (sexo == 'M') {
            if (idade >= IDADE_MIN_M || anosContribuicao >= CONTRIB_MIN_M) {
                podeAposentar = true;
            }
        } else if (sexo == 'F') {
            if (idade >= IDADE_MIN_F || anosContribuicao >= CONTRIB_MIN_F) {
                podeAposentar = true;
            }
        }

        if (podeAposentar) {
            System.out.println("\nParabéns! Você já pode se aposentar.");
        } else {
            System.out.println("\nVocê ainda não pode se aposentar.");
            if (sexo == 'M') {
                int anosFaltantesIdade = Math.max(0, IDADE_MIN_M - idade);
                int anosFaltantesContr = Math.max(0, CONTRIB_MIN_M - anosContribuicao);
                System.out.printf("Faltam %d anos por idade ou %d anos por tempo de contribuição.\n", anosFaltantesIdade, anosFaltantesContr);
            } else if (sexo == 'F') {
                int anosFaltantesIdade = Math.max(0, IDADE_MIN_F - idade);
                int anosFaltantesContr = Math.max(0, CONTRIB_MIN_F - anosContribuicao);
                System.out.printf("Faltam %d anos por idade ou %d anos por tempo de contribuição.\n", anosFaltantesIdade, anosFaltantesContr);
            }
        }

        scanner.close();
    }
}
