package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String pronto;
        int resposta = (int) Math.round(Math.random() * 10);
        int tentativa;


        System.out.println("##############################");
        System.out.println("###   Jogo da Advinhação   ###");
        System.out.println("##############################");
        System.out.println();
        System.out.println("Regras do Jogo!");
        System.out.println("1- Vou pensar em um número");
        System.out.println("2- Você tenta adivinhar qual número estou pensando");
        System.out.println("3- Te informo se acertou ou não");
        System.out.println("Esta pronto para jogar? s/n");
        pronto = leitura.next();


        switch (pronto) {
            case "s":
                jogo_for();



                break;
            case "n":
                System.out.println("Até mais, então.");
                break;
            default:
                System.out.println("Opção inválida!");

        }
        }
    public static void
            jogo_for () {

        Scanner leitura = new Scanner(System.in);
        String pronto;
        int resposta = (int) Math.round(Math.random() * 10);
        int tentativa;

        for(int contador = 0;contador<=10;contador++){
        System.out.println("Qual número eu estou pensando");
        tentativa = leitura.nextInt();
        if (tentativa == resposta) {
            System.out.println("!Parabéns,você acertou!");
        } else {

            System.out.println("#########################");
            System.out.println("##Que pena,você errou##");
            System.out.println("#########################");
            System.out.println("A resposta era " + resposta);
        }

        resposta = (int) Math.round(Math.random() * 10);

    }
    }
}