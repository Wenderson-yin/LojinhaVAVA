package com.company;

import java.util.Scanner;

public class LojinhaChamber {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner ler = new Scanner(System.in);
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("Bem vindo a Loja Valorant Champions!");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("1 - Phantom Champions 2022!");
            System.out.println("2 - Butterfly Champions 2022!");
            System.out.println("3 - Vandal Champions 2021!");
            System.out.println("4 - Karambit Champions 2021!");
        int op = ler.nextInt();
        if (op == 1){
            System.out.println("Phantom Champions 3100 VP = R$110.00");
            } else if (op == 2) {
            System.out.println("Butterfly Champions 6500 VP = R$170.00");
        }else if (op == 3) {
            System.out.println("Vandal Champions 2675 VP = 79.00");
        }else if (op == 4) {
            System.out.println("Karambit Champions 5350 VP = R$150.00");
        }
    }
}
