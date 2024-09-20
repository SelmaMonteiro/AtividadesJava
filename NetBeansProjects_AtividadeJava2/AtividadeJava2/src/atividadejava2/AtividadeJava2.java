/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadejava2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class AtividadeJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Criando o Scanner para capturar entradas do usuário
        Scanner entrada = new Scanner(System.in);

        // 1. Verificando o gênero
        System.out.print("Digite o genero (m ou f): ");
        String genero = entrada.next();
        if (genero.equalsIgnoreCase("f")) {
            System.out.println("O genero eh feminino.");
        } else {
            System.out.println("O genero nao eh feminino.");
        }

        // 2. Verificando a idade
        System.out.print("Digite a idade: ");
        int idade = entrada.nextInt();
        if (idade > 21) {
            System.out.println("A pessoa tem mais de 21 anos.");
        } else {
            System.out.println("A pessoa tem 21 anos ou menos.");
        }

        // 3. Verificando o salário
        System.out.print("Digite o salario: R$ ");
        double salario = entrada.nextDouble();
        double salarioMinimo = 1640.00; // Salário mínimo em 2024
        if (salario > 5 * salarioMinimo) {
            System.out.println("O salario eh maior que 5 vezes o salario minimo.");
        } else {
            System.out.println("O salario eh menor ou igual a 5 vezes o salario minimo.");
        }

        // 4. Verificando a altura
        System.out.print("Digite a altura em metros): ");
        double altura = entrada.nextDouble();
        if (altura > 1.75) {
            System.out.println("A pessoa eh mais alta que 1,75 m.");
        } else {
            System.out.println("A pessoa tem 1,75 m ou menos.");
        }

        // 5. Verificando o peso
        System.out.print("Digite o peso em kg: ");
        double peso = entrada.nextDouble();
        if (peso > 70) {
            System.out.println("A pessoa pesa mais de 70 kg.");
        } else {
            System.out.println("A pessoa pesa 70 kg ou menos.");
        }

        // 6. Verificando o sobrenome
        System.out.print("Digite o sobrenome: ");
        String sobrenome = entrada.next();
        if (!sobrenome.equalsIgnoreCase("Boldieri")) {
            System.out.println("O sobrenome eh diferente.");
        } else {
            System.out.println("O sobrenome eh Lima.");
        }

        // Fechando o Scanner
        entrada.close();
    }// TODO code application logic here
    }
    

