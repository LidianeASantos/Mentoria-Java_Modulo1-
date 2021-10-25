package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a nota");
        int nota1 = leitor.nextInt();

        System.out.println("Informe a média");
        int media = leitor.nextInt();

        int mediaDobrada = media * 2;
        int nota2 = mediaDobrada - nota1;

        System.out.println("O valor da segunda nota é: " + nota2);
    }
}
