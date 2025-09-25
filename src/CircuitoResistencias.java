import java.util.Arrays;
import java.util.Scanner;

public class CircuitoResistencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] resistencias = new double[4];

        System.out.println("--- Cálculo de Circuito de Resistências em Série ---");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite o valor da resistência %d: ", i + 1);
            resistencias[i] = scanner.nextDouble();
        }

        double resistenciaEquivalente = 0;
        for (double r : resistencias) {
            resistenciaEquivalente += r;
        }

        Arrays.sort(resistencias);
        double menorResistencia = resistencias[0];
        double maiorResistencia = resistencias[3];

        System.out.println("\n--- Resultados ---");
        System.out.printf("Resistência Equivalente: %.2f\n", resistenciaEquivalente);
        System.out.printf("Menor Resistência: %.2f\n", menorResistencia);
        System.out.printf("Maior Resistência: %.2f\n", maiorResistencia);

        scanner.close();
    }
}

