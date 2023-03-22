package Jokenpo_domain;

import java.util.Map;

public class Pedra extends Algoritmo{

    @Override
    public Map<String, String> executar(Tipo pTipo) {
       switch(pTipo){
           case PAPEL -> valor = "Perdeu. Papel embrula a Pedra!";
           case TESOURA -> valor = "Ganhou. Pedra quebra a Tesoura";
           case PEDRA -> valor = "Empate. Pedra empata com Pedra!";
           case LAGARTO -> valor = "Ganhou. Pedra esmaga o Lagarto!";
           case SPOCK -> valor = "Perdeu. Spock vaporiza a Pedra!";
           default -> valor = "Empate, opção inválida";
       }
       
       resultado.put(KEY, valor);
       return resultado;
    }
    

    
    
    
}
