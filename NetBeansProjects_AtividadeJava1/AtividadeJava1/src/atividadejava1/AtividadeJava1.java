/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadejava1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class AtividadeJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    
    // Criação do objeto Scanner para leitura de dados
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados fornecidos pelo usuário
        System.out.println("Digite o valor total da fatura (R$): ");
        double valorTotal = entrada.nextDouble(); // Valor total da fatura

        System.out.println("Digite o numero de parcelas: ");
        int numeroParcelas = entrada.nextInt(); // Número de parcelas

        System.out.println("Digite o percentual de desconto por pagamento antecipado (%): ");
        double percentualDesconto = entrada.nextDouble(); // Percentual de desconto

        System.out.println("Digite o percentual de multa por atraso (%): ");
        double percentualMulta = entrada.nextDouble(); // Percentual de multa

        // Cálculo do valor total com desconto
        double valorComDesconto = valorTotal - (valorTotal * (percentualDesconto / 100));

        // Cálculo da multa total por atraso
        double valorMultaTotal = valorTotal * (percentualMulta / 100);

        // Cálculo do valor de cada parcela com multa
        double valorParcelaComMulta = (valorTotal + valorMultaTotal) / numeroParcelas;

        // Cálculo do valor da multa em cada parcela
        double multaPorParcela = valorMultaTotal / numeroParcelas;

        // Exibição dos resultados formatados
        System.out.printf("\nValor total com desconto para pagamento antecipado: R$ %.2f%n", valorComDesconto);
        System.out.printf("Valor de cada parcela com multa: R$ %.2f%n", valorParcelaComMulta);
        System.out.printf("Multa paga em cada parcela: R$ %.2f%n", multaPorParcela);

        // Fechamento do Scanner para liberar recursos
        entrada.close();
    }
}

