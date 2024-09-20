/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadejava3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class AtividadeJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criando o Scanner para capturar as entradas do usuário
        Scanner entrada = new Scanner(System.in);

        // Informações pessoais (as suas)
        String meuNome = "Selma";
        int minhaIdade = 53;
        double meuPeso = 57;
        double minhaAltura = 1.67;
        String minhaSerieFavorita = "The Chosen";
        String minhaMusicaFavorita = "Goodness of God";
        String meuJogoFavorito = "WoW";

        // Variável para contar quantas características são iguais
        int caracteristicasIguais = 0;

        // 1. Comparação do nome
        System.out.print("Digite o nome da pessoa: ");
        String nomePessoa = entrada.nextLine();
        if (nomePessoa.equalsIgnoreCase(meuNome)) {
            System.out.println("Pessoa com nome igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com nome diferente.");
        }

        // 2. Comparação da idade
        System.out.print("Digite a idade da pessoa: ");
        int idadePessoa = entrada.nextInt();
        if (idadePessoa == minhaIdade) {
            System.out.println("Pessoa com idade igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com idade diferente.");
        }

        // 3. Comparação do peso
        System.out.print("Digite o peso da pessoa (em kg): ");
        double pesoPessoa = entrada.nextDouble();
        if (pesoPessoa == meuPeso) {
            System.out.println("Pessoa com peso igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com peso diferente.");
        }

        // 4. Comparação da altura
        System.out.print("Digite a altura da pessoa (em metros): ");
        double alturaPessoa = entrada.nextDouble();
        if (alturaPessoa == minhaAltura) {
            System.out.println("Pessoa com altura igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com altura diferente.");
        }

        // Limpar o buffer do Scanner após ler um número
        entrada.nextLine();

        // 5. Comparação da série favorita
        System.out.print("Digite a serie favorita da pessoa: ");
        String seriePessoa = entrada.nextLine();
        if (seriePessoa.equalsIgnoreCase(minhaSerieFavorita)) {
            System.out.println("Pessoa com serie favorita igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com serie favorita diferente.");
        }

        // 6. Comparação da música favorita
        System.out.print("Digite a musica favorita da pessoa: ");
        String musicaPessoa = entrada.nextLine();
        if (musicaPessoa.equalsIgnoreCase(minhaMusicaFavorita)) {
            System.out.println("Pessoa com musica favorita igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com musica favorita diferente.");
        }

        // 7. Comparação do jogo favorito
        System.out.print("Digite o jogo favorito da pessoa: ");
        String jogoPessoa = entrada.nextLine();
        if (jogoPessoa.equalsIgnoreCase(meuJogoFavorito)) {
            System.out.println("Pessoa com jogo favorito igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com jogo favorito diferente.");
        }

        // IF aninhado para verificar se 3 ou mais características são iguais
        if (caracteristicasIguais >= 3) {
            System.out.println("Esta pessoa eh bem parecida comigo!");
        } else {
            System.out.println("Esta pessoa nao eh tao parecida comigo.");
        }

        // Fechando o Scanner
        entrada.close();
    }
}
     

