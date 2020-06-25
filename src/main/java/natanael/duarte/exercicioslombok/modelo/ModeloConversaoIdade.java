package natanael.duarte.exercicioslombok.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ModeloConversaoIdade {

    @Getter @Setter
    private int idade;

    public int ConversaoDias () {
        return idade*365;
    }

    public int ConversaoSemana () {
        return idade*52;
    }

    public int ConversaoMeses () {
        return idade*12;
    }

}