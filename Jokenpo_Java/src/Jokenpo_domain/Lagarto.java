
package Jokenpo_domain;

import java.util.Map;

public class Lagarto extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch(pTipo){
            case PAPEL -> valor = "Ganhou. Lagarto come o Papel!";
            case PEDRA -> valor = "Perdeu. Pedra esmaga o Lagarto!";
            case TESOURA -> valor = "Perdeu. Tesoura decapita o Lagarto!";
            case LAGARTO -> valor = "Empate. Lagarto empata com o Lagarto!";
            case SPOCK -> valor = "Ganhou. Lagarto envenena o Spock!"; 
            default -> valor = "Empatou, opção inválida!";
        }
    
        resultado.put(KEY, valor);
        return resultado;
    }
    
}
