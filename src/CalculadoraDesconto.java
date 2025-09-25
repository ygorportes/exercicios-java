import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale ptBr = new Locale("pt", "BR");
        NumberFormat fomatoMoeda = NumberFormat.getCurrencyInstance(ptBr);

        System.out.println("--- Calculadora desconto ---");

        System.out.println("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.println("Digite a porcentagem de desconto (%): ");
        double percDesconto = scanner.nextDouble();

        double valorDesconto = valorProduto * (percDesconto / 100);
        double precoFinal = valorProduto - valorDesconto;

        System.out.println("\n--- Resultado ---");
        System.out.println("Valor do desconto: " + fomatoMoeda.format(valorDesconto));
        System.out.println("Preço final do produto: " + fomatoMoeda.format(precoFinal));

        scanner.close();
    }
}
