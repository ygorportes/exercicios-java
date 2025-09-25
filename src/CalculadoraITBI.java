import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class CalculadoraITBI {
    public static void main(String[] args) {
        Locale ptBr = new Locale("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(ptBr);

        JOptionPane.showMessageDialog(null, "--- Calculadora de ITBI ---");

        String transacaoStr = JOptionPane.showInputDialog("Digite o valor de transação do imóvel: ");
        double valorTransacao = Double.parseDouble(transacaoStr);

        String venalStr = JOptionPane.showInputDialog("Digite o valor venal do imóvel: ");
        double valorVenal = Double.parseDouble(venalStr);

        String impostoStr = JOptionPane.showInputDialog("Digite a porcentagem do imposto ITBI (%): ");
        double percImposto = Double.parseDouble(impostoStr);

        double baseCalculo = Math.max(valorTransacao, valorVenal);
        double valorImposto = baseCalculo * (percImposto / 100);

        String resultado = String.format(
                "Base de Cálculo: %s\nValor do ITBI a ser pago: %s",
                formatoMoeda.format(baseCalculo),
                formatoMoeda.format(valorImposto)
        );

        JOptionPane.showMessageDialog(null, resultado, "Resultado do Cálculo de ITBI", JOptionPane.INFORMATION_MESSAGE);
    }
}
