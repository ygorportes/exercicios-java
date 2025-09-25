import javax.swing.*;
import java.text.DecimalFormat;

public class SistemaAvaliacao {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "--- Sistema de Avaliação de Alunos ---");

        String nota1Str = JOptionPane.showInputDialog("Digite a nota da Prova 1:");
        double nota1 = Double.parseDouble(nota1Str);

        String nota2Str = JOptionPane.showInputDialog("Digite a nota da Prova 2:");
        double nota2 = Double.parseDouble(nota2Str);

        String trabalhoStr = JOptionPane.showInputDialog("Digite a nota do Trabalho:");
        double notaTrabalho = Double.parseDouble(trabalhoStr);

        double media = (nota1 + nota2 + notaTrabalho) / 3;

        DecimalFormat df = new DecimalFormat("#.##");
        String situacao;

        if (media >= 6.0) {
            situacao = "APROVADO";
        } else {
            situacao = "REPROVADO";
        }

        String resultado = String.format(
                "Média final: %s\nSituação: %s",
                df.format(media),
                situacao
        );

        JOptionPane.showMessageDialog(null, resultado, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
    }
}
