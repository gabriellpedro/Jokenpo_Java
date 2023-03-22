
package Jokenpo_domain;

import java.util.Map;

public class Tesoura extends Algoritmo{

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch(pTipo){
            case PAPEL -> valor = "Ganhou. Tesoura corta o Papel!";
            case PEDRA -> valor = "Perdeu. Pedra quebra a Tesoura!";
            case TESOURA -> valor = "Empate. Tesoura empata com Tesoura!";
            case LAGARTO -> valor = "Ganhou. Tesoura decapta o Lagarto!";
            case SPOCK -> valor = "Perdeu. Spock esmaga a Tesoura!";
            default -> valor = "Empatou! Opção inválida";
            
        }
        
        resultado.put(KEY, valor);
        return resultado;
        }
    
    
    
}
