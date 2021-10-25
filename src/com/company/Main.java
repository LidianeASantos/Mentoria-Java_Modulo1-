package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a capacidade máxima da cabine: ");
        int capacidadeMaxima = leitor.nextInt();

        System.out.println("Informe o número de alunos: ");
        int numeroAlunos = leitor.nextInt();

        int alunosMonitor = capacidadeMaxima - 1;
        int numeroDeViagens = 0;

        while (numeroAlunos > 0) {
            numeroAlunos = numeroAlunos - alunosMonitor ;
            numeroDeViagens++;
        }

        System.out.println("Numero de viagens: " + numeroDeViagens);
    }
}
