package jokenpo_java;

import Jokenpo_domain.Jokenpo;
import Jokenpo_domain.Papel;
import Jokenpo_domain.Pedra ;
import Jokenpo_domain.Lagarto ;
import Jokenpo_domain.Tesoura ;
import Jokenpo_domain.Spock;
import Jokenpo_domain.Algoritmo;
import Jokenpo_domain.Tipo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        var jokenpo = new Jokenpo();

        System.out.println("Escolha uma das opções [ 1-PAPEL, 2-TESOURA, 3-PEDRA, 4-LAGARTO, 5-SPOCK ]\n");
        int jogada = in.nextInt();
        int computador = new Random().nextInt(5) + 1;
        System.out.println("O COMPUTADOR escolheu: " + Tipo.getInstance(computador));

        //TODO: Implementar regra para criação do tipo om base na classe Algoritmo
        var algoritmo = getAlgoritmo(jogada);

        jokenpo.setAlgoritmo(algoritmo);
        Tipo tipoJogadaComputador = Tipo.getInstance(computador);

        jokenpo.jogar(tipoJogadaComputador);

        in.close();

    }
    
    private static Algoritmo getAlgoritmo(Integer pId) {
        Algoritmo algoritmo = null;
        switch (pId) {
            case 1 -> algoritmo = new Papel();
            case 2 -> algoritmo = new Tesoura();
            case 3 -> algoritmo = new Pedra();
            case 4 -> algoritmo = new Lagarto();
            case 5 -> algoritmo = new Spock();
            default -> throw new IllegalStateException("Unexpected value: " + pId);
        }
        return algoritmo;
    }    
}